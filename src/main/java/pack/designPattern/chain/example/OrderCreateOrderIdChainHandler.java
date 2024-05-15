package pack.designPattern.chain.example;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 *@name OrderCreateOrderIdChainFilter
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class OrderCreateOrderIdChainHandler implements OrderCreateChainFilter<OrderCreateParam> {
    /**
     * @param requestParam
     */
    @Override
    public void handler(OrderCreateParam requestParam) {
        if (ObjectUtils.isEmpty(requestParam.getOrderId())) throw new OrderException("id为空");
        System.out.println("id检查完成");
    }

    /**
     * @return mask
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
