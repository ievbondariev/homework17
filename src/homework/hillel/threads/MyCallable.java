package homework.hillel.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            MyName.getNameOfThread();
        }
        return null;
    }
}
