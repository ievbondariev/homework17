package homework.hillel.threads;

public class MyName {
    public static int i = 0;
    public static synchronized void getNameOfThread() {
        String name = Thread.currentThread().getName();
        System.out.println(name + i);
        ++i;
    }
}
