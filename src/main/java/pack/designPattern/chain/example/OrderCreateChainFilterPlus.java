package pack.designPattern.chain.example;

import pack.designPattern.chain.template.AbstractChainHandler;

/**
 *@name OrderCreateChainFilterPlus
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public interface OrderCreateChainFilterPlus<O> extends AbstractChainHandler<OrderCreateParam> {
    @Override
    default String mark() {
        return OrderChainMarkEnum.ORDER_CREATE_FILTER_PLUS.name();
    }
}
