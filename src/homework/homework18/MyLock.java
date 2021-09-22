package homework.homework18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        Thread thread1 = new Thread(new Runnable() {
            Example example = new Example("A", lock);

            @Override
            public void run() {
                example.print();
                example.write();
                example.copy();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            Example example = new Example("B", lock);

            @Override
            public void run() {
                example.print();
                example.write();
                example.copy();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            Example example = new Example("C", lock);

            @Override
            public void run() {
                example.print();
                example.write();
                example.copy();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
