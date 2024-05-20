package pack.designPattern.strategy.example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *@name Payment
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class AliPayment extends AbstractPayment implements Serializable {


    /**
     * @return
     */
    @Override
    public String buildMask() {
        this.setMethod("alipay");
        return getMethod().toUpperCase();
    }
}
