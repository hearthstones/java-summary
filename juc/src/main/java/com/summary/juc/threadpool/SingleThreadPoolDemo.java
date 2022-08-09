package com.summary.juc.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SingleThreadPoolDemo
 *
 * @author luchao
 * @since 2022/8/8
 */
public class SingleThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.execute(() -> System.out.println("当前任务：" + index + "，当前线程：" + Thread.currentThread().getName()));
        }
    }

}
