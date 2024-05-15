package pack.designPattern.builder.template;

import java.io.Serializable;

/**
 *@name Builder 建造者组件
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public interface Builder<T> extends Serializable {
    /**
     * 建造方法
     *
     * @return T
     */
    T build();
}
