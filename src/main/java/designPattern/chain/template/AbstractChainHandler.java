package designPattern.chain.template;

import java.io.Serializable;

/**
 *@name AbstractChainHandler
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public interface AbstractChainHandler<T> extends Serializable {
    void handle(T requestParam);

    String mark();

}
