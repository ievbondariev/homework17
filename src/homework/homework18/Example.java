package homework.homework18;

import java.util.concurrent.locks.Lock;

public class Example {
    Lock lock;
    String thread;

    public Example(String thread, Lock lock) {
        this.thread = thread;
        this.lock = lock;
    }

    public void print() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println("print " + thread);
        }
    }

    public void write() {
        for (int i = 0; i < 100; i++) {
            System.out.println("write " + thread);
        }
        lock.lock();
    }

    public void copy() {
        for (int i = 0; i < 100; i++) {
            System.out.println("copy " + thread);
        }
        lock.unlock();
        lock.unlock();
    }
}
