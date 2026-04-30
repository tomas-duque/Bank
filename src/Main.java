import config.Config;
import userinterface.MenuApp;

public class Main {

    public static void main(String[] args){

        MenuApp app = Config.createMenuApp();
        app.menuPrincipal();
    }
}