package pack.designPattern.chain.template;

import org.springframework.core.Ordered;

/**
 *@name AbstractChainHandler
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public interface AbstractChainHandler<T> extends Ordered {
    void handler(T requestParam);

    String mark();
}
