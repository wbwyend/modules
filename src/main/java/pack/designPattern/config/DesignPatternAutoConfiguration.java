package pack.designPattern.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pack.designPattern.chain.template.AbstractChainContext;
import pack.designPattern.chain.template.AbstractChainHandler;
import pack.designPattern.strategy.template.AbstractExecuteStrategy;
import pack.designPattern.strategy.template.AbstractStrategyChoose;

/**
 *@name DesignPatternAutoConfigution
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Configuration
public class DesignPatternAutoConfiguration {
    @Bean
    public AbstractStrategyChoose abstractStrategyChoose() {
        return new AbstractStrategyChoose();
    }
    @Bean
    public AbstractChainContext abstractChainContext() {
        return new AbstractChainContext();
    }
}
