package com.example.demo;

/**
 * @author Ning Baoqi
 * @date 2019/11/18 9:56
 */
import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class DMSSendTest {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个可重用固定线程数的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        // 创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
for (int i=0;i<100;i++){
    Thread t = new MyThread();
    pool.execute(t);

}
        // 关闭线程池
        pool.shutdown();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行… …"+ System.currentTimeMillis());
        try {
            Thread.currentThread().sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
