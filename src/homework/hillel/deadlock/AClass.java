package homework.hillel.deadlock;

public class AClass {
    private BClass bClass;

    public void setBClass(BClass bClass) {
        this.bClass = bClass;
    }

    public synchronized String getString() {
        return "Test B";
    }

    public synchronized String getStringFromBClass() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bClass.getString();
    }
}
