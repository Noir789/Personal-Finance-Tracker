import controller.TransactionController;
import view.MainView;

public class Main {
    public static void main(String[] args) {
        TransactionController controller = new TransactionController();
        MainView view = new MainView(controller);
        view.start();
    }
}
