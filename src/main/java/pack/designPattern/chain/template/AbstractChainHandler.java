package pack.designPattern.chain.template;

import org.springframework.core.Ordered;

import java.io.Serializable;

/**
 *@name AbstractChainHandler
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public interface AbstractChainHandler<T> extends Ordered {
    void handle(T requestParam);

    String mark();
}
