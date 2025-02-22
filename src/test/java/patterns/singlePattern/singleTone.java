package patterns.singlePattern;

public class singleTone {

    private static singleTone instance;
    private singleTone()
    {

    }
    public static singleTone getInstance() {
        if (instance == null) {
            instance = new singleTone();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Singleton Instance");
    }

    public static void main(String[] args) {
        singleTone obj = singleTone.getInstance();
        obj.showMessage();
    }

}
