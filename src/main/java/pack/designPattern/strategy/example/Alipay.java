package pack.designPattern.strategy.example;

import org.springframework.stereotype.Component;
import pack.designPattern.strategy.template.AbstractExecuteStrategy;

/**
 *@name Alipay
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class Alipay implements AbstractExecuteStrategy<AbstractPayment, String> {
    /**
     * @return
     */
    @Override
    public String mask() {
        return PaymentMethod.ALIPAY.name();
    }

    /**
     * @param requestParam 请求参数
     * @return
     */
    @Override
    public String executeResp(AbstractPayment requestParam) {
        System.out.println("执行了支付宝支付");
        return mask();
    }
}
