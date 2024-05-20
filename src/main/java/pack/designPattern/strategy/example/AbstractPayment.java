package pack.designPattern.strategy.example;

import pack.designPattern.strategy.template.AbstractStrategy;

import java.math.BigDecimal;

/**
 *@name AbstractPayment
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class AbstractPayment implements AbstractStrategy {

    private String method;
    private String payId;
    private BigDecimal value;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String buildMask() {
        return getMethod().toUpperCase();
    }
}
