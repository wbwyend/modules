package pack.designPattern.chain.example;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 *@name OrderCreateOrderValueChainHandler
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class OrderCreateOrderValueChainHandler implements OrderCreateChainFilterPlus<OrderCreateParam>{
    /**
     * @param requestParam
     */
    @Override
    public void handler(OrderCreateParam requestParam) {
        if (ObjectUtils.isEmpty(requestParam.getValue()) || requestParam.getValue() == 0) throw new OrderException("value为null");
        System.out.println("value检查完成");
    }

    /**
     * @return
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
