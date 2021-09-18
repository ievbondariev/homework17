package homework.hillel.deadlock;

public class BClass {
    private AClass aClass;

    public void setAClass(AClass aClass) {
        this.aClass = aClass;
    }

    public synchronized String getString() {
        return "Test A";
    }

    public synchronized String getStringFromAClass() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return aClass.getString();
    }
}
