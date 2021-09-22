package homework.homework18;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static AtomicInteger testAtomic = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(Main::decrement);
        Thread thread2 = new Thread(Main::decrement);

        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        System.out.println(testAtomic);
    }

    private static void decrement() {
        for (int i = 0; i < 10000; i++) {
            testAtomic.decrementAndGet();
        }
    }
}
