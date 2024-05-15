package pack.designPattern.chain.template;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 *@name AbstractChainContext
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public final class AbstractChainContext<T> implements CommandLineRunner {
    private final Map<String, List<AbstractChainHandler>> abstractChainHandlerMap = new HashMap<>();

    public void handle(String mark, T requestParam) {
        List<AbstractChainHandler> abstractChainHandlers = abstractChainHandlerMap.get(mark);
        if (CollectionUtils.isEmpty(abstractChainHandlers)) {
            throw new RuntimeException(String.format("[%s] Chain of Responsibility ID is undefined.", mark));
        }
        abstractChainHandlers.forEach(each -> each.handle(requestParam));
    }

    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        Map<String, AbstractChainHandler> chainFilterMap = ApplicationContextHolder.getBeanOfType(AbstractChainHandler.class);
        chainFilterMap.forEach((beanName, bean) -> {
            List<AbstractChainHandler> abstractChainHandlerList = abstractChainHandlerMap.get(bean.mark());
            if (CollectionUtils.isEmpty(abstractChainHandlerList)) {
                abstractChainHandlerList = new ArrayList<>();
            }
            abstractChainHandlerList.add(bean);
            List<AbstractChainHandler> actualChainHandlerList = abstractChainHandlerList.stream()
                    .sorted(Comparator.comparing(Ordered::getOrder))
                    .collect(Collectors.toList());
            abstractChainHandlerMap.put(bean.mark(), actualChainHandlerList);
        });
    }
}
