package com.example.demo.multiThread;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Ning Baoqi
 * @date 2021/6/3 14:48
 */
public class NewLock {
    ReentrantLock reentrantLock;
    ReadWriteLock lock2 = new ReentrantReadWriteLock();
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Lock lock = new ReentrantLock();    //注意这个地方
    public static void main(String[] args)  {
        final NewLock test = new NewLock();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {

        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<5;i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}
