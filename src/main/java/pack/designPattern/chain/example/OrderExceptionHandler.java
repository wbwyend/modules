package pack.designPattern.chain.example;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *@name OrderException
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@ControllerAdvice
public class OrderExceptionHandler {

    @ExceptionHandler
    public void orderExceptionHandler(OrderException e) {
        System.out.println(e.getMsg());
    }
}
