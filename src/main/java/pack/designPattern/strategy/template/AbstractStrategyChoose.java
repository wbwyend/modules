package pack.designPattern.strategy.template;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import pack.designPattern.chain.template.ApplicationContextHolder;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *@name AbstractStrategyExecuteChoose
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class AbstractStrategyChoose implements ApplicationListener<ApplicationEvent> {
    private final Map<String, AbstractExecuteStrategy> abstractExecuteStrategyMap = new HashMap<>();

    private AbstractExecuteStrategy choose(String mask) {
        return Optional.ofNullable(abstractExecuteStrategyMap.get(mask)).orElseThrow(RuntimeException::new);
    }

    public <Request> void chooseAndExecute(String mask, Request requestParam) {
        AbstractExecuteStrategy executeStrategy = choose(mask);
        executeStrategy.execute(requestParam);
    }

    public <Request, Response> Response chooseAndExecuteResp(String mask, Request requestParam) {
        AbstractExecuteStrategy executeStrategy = choose(mask);
        return (Response) executeStrategy.executeResp(requestParam);
    }

    /**
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        Map<String, AbstractExecuteStrategy> map = ApplicationContextHolder.getBeansOfType(AbstractExecuteStrategy.class);
        map.forEach((beanName, bean) -> {
            abstractExecuteStrategyMap.putIfAbsent(bean.mask(), bean);
        });
    }
}
