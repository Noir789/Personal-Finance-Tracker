package observer;

public class User implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Notification to user: " + message);
    }
}
