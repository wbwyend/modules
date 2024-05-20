package pack.designPattern.strategy.example;

import org.springframework.stereotype.Component;
import pack.designPattern.strategy.template.AbstractExecuteStrategy;

/**
 *@name WeChatPay
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class WeChatPay implements AbstractExecuteStrategy<AbstractPayment, String> {
    /**
     * @return
     */
    @Override
    public String mask() {
        return PaymentMethod.WECHATPAY.name();
    }

    @Override
    public String executeResp(AbstractPayment requestParam) {
        System.out.println("执行了微信支付");
        return mask();
    }
}
