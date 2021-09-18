package homework.hillel.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            MyName.getNameOfThread();
        }
    }
}
