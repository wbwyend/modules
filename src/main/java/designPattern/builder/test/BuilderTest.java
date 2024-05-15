package designPattern.builder.test;

import designPattern.builder.example.ThreadPoolExecutorBuilder;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *@name BuilderTest
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class BuilderTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = ThreadPoolExecutorBuilder.builder()
                .core(1)
                .maximum(1)
                .keepAliveTime(10)
                .timeUnit(TimeUnit.SECONDS)
                .workQueue(100)
                .handler(new ThreadPoolExecutor.CallerRunsPolicy())
                .build();

        for (int i = 0; i < 10; i++) {
            final int k = i;
            executor.submit(() -> System.out.println(k));
        }
        executor.shutdown();
    }
}
