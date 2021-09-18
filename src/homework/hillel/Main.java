package homework.hillel;

import homework.hillel.deadlock.AClass;
import homework.hillel.deadlock.BClass;
import homework.hillel.threads.MyCallable;
import homework.hillel.threads.MyRunnable;
import homework.hillel.threads.MyThread;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("A");
        myThread.start();

        Thread thread = new Thread(new MyRunnable());
        thread.setName("B");
        thread.start();

        FutureTask<String> futureTask = new FutureTask<>(new MyCallable());
        Thread thread1 = new Thread(futureTask);
        thread1.setName("C");
        thread1.start();

//        myThread.join();
//        thread.join();
        thread1.join();

        //"Without synchronised 2549-2999"
        //"With synchronised 2562-2999"
        //"With join 2532-2732"

        AClass aClass = new AClass();
        BClass bClass = new BClass();

        aClass.setBClass(bClass);
        bClass.setAClass(aClass);

        Thread thread2 = new Thread(() -> System.out.println(aClass.getStringFromBClass()));
        Thread thread3 = new Thread(() -> System.out.println(bClass.getStringFromAClass()));

//        thread2.start();
        thread3.start();
    }
}
