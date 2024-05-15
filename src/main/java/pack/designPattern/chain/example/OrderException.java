package pack.designPattern.chain.example;
/**
 *@name OrderException
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class OrderException extends RuntimeException {
    private final String msg;

    public String getMsg() {
        return msg;
    }

    public OrderException(String msg) {
        this.msg = msg;
    }
}
