package pack.designPattern.chain.example;
/**
 *@name OrderCreateParam
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class OrderCreateParam {
    private Integer orderId;
    private Integer value;
    private String createTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
