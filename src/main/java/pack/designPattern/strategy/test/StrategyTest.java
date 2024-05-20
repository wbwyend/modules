package pack.designPattern.strategy.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pack.designPattern.strategy.example.*;
import pack.designPattern.strategy.template.AbstractStrategyChoose;

/**
 *@name StrategyTest
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class StrategyTest {
    @Autowired
    private AbstractStrategyChoose abstractStrategyChoose;

    public void test() {


        AbstractPayment payment = new AbstractPayment();
        payment.setMethod("wechatpay");
        String res = abstractStrategyChoose.chooseAndExecuteResp(payment.buildMask(), payment);
        System.out.println(res);
    }
}
