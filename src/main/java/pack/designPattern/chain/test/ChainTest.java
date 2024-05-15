package pack.designPattern.chain.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pack.designPattern.chain.example.OrderChainMarkEnum;
import pack.designPattern.chain.example.OrderCreateParam;
import pack.designPattern.chain.template.AbstractChainContext;

/**
 *@name Test
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class ChainTest {

    @Autowired
    private AbstractChainContext<OrderCreateParam> abstractChainContext;

    public void test() {
        OrderCreateParam orderCreateParam = new OrderCreateParam();
        orderCreateParam.setOrderId(1);
        orderCreateParam.setValue(1);
        orderCreateParam.setCreateTime("2024-05-15 19:45:00.000");

        abstractChainContext.handler(OrderChainMarkEnum.ORDER_CREATE_FILTER_PLUS.name(), orderCreateParam);
        System.out.println("--------------------");
        abstractChainContext.handler(OrderChainMarkEnum.ORDER_CREATE_FILTER.name(), orderCreateParam);
    }


}
