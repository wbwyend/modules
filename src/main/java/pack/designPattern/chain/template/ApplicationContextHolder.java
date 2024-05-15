package pack.designPattern.chain.template;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 *@name ApplicationContextHolder
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {
    private static ApplicationContext CONTEXT;

    /**
     * @param applicationContext the ApplicationContext object to be used by this object
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return CONTEXT.getBean(clazz);
    }

    public static <T> T getBean(String name, Class<T> clazz) {
        return CONTEXT.getBean(name, clazz);
    }

    public static <T> Map<String, T> getBeanOfType(Class<T> clazz) {
        return CONTEXT.getBeansOfType(clazz);
    }
}
