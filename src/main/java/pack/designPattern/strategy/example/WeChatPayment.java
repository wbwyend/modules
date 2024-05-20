package pack.designPattern.strategy.example;

import java.io.Serializable;

/**
 *@name WeChatPayment
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class WeChatPayment extends AbstractPayment implements Serializable {
    @Override
    public String buildMask() {
        setMethod("wechatpay");
        return getMethod().toUpperCase();
    }
}
