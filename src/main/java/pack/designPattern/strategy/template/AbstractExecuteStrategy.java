package pack.designPattern.strategy.template;
/**
 *@name AbstractExecuteStrategy 抽象执行策略
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public interface AbstractExecuteStrategy<Request, Response> {
    /**
     * 策略标识
     *
     * @return mask 标识
     */
    String mask();

    /**
     * 执行策略
     *
     * @param requestParam 请求参数
     */
    default void execute(Request requestParam) {

    }

    /**
     * 执行带返回值的策略
     *
     * @param requestParam 请求参数
     * @return null
     */
    default Response executeResp(Request requestParam) {
        return null;
    }
}
