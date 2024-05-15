package pack.designPattern.chain.example;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 *@name OrderCreateOrderTimeChainHandler
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class OrderCreateOrderTimeChainHandler implements OrderCreateChainFilter<OrderCreateParam> {
    /**
     * @param requestParam
     */
    @Override
    public void handler(OrderCreateParam requestParam) {
        if (ObjectUtils.isEmpty(requestParam.getCreateTime())) throw new OrderException("time为null");
        System.out.println("time检查完成");
    }

    /**
     * @return
     */
    @Override
    public int getOrder() {
        return 2;
    }
}
