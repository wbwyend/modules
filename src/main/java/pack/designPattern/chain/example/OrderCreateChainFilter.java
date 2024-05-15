package pack.designPattern.chain.example;

import pack.designPattern.chain.template.AbstractChainHandler;

/**
 *@name OrderCreateChainFilter
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public interface OrderCreateChainFilter<T extends OrderCreateParam> extends AbstractChainHandler<OrderCreateParam> {
    @Override
    default String mark() {
        return OrderChainMarkEnum.ORDER_CREATE_FILTER.name();
    }
}
