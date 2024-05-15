package designPattern.builder.example;

import designPattern.builder.template.Builder;

import java.util.concurrent.*;

/**
 *@name ThreadPoolExecutorBuilder
 *
 *@author wbwyend
 *@date 2024/05/15 
 */
public class ThreadPoolExecutorBuilder implements Builder<ThreadPoolExecutor> {

    private int coreSize = 1;
    private int maximumSize = 1;
    private long keepAliveTime = 30000L;
    private TimeUnit timeUnit = TimeUnit.SECONDS;
    private BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2048);
    private final ThreadFactory threadFactory = Executors.defaultThreadFactory();
    private RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();

    public ThreadPoolExecutorBuilder() {
    }

    public ThreadPoolExecutorBuilder core(int coreSize) {
        this.coreSize = coreSize;
        return this;
    }

    public ThreadPoolExecutorBuilder maximum(int maximumSize) {
        this.maximumSize = maximumSize;
        return this;
    }

    public ThreadPoolExecutorBuilder keepAliveTime(long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
        return this;
    }

    public ThreadPoolExecutorBuilder timeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    public ThreadPoolExecutorBuilder workQueue(int queueSize) {
        this.workQueue = new ArrayBlockingQueue<>(queueSize);
        return this;
    }

    public ThreadPoolExecutorBuilder handler(RejectedExecutionHandler handler) {
        this.handler = handler;
        return this;
    }

    public static ThreadPoolExecutorBuilder builder() {
        return new ThreadPoolExecutorBuilder();
    }

    @Override
    public ThreadPoolExecutor build() {
        return new ThreadPoolExecutor(
                coreSize,
                maximumSize,
                keepAliveTime,
                timeUnit,
                workQueue,
                threadFactory,
                handler);
    }
}
