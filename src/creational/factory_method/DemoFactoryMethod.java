package creational.factory_method;

import creational.factory_method.dialog.Dialog;
import creational.factory_method.dialog.HtmlDialog;
import creational.factory_method.dialog.WindowsDialog;

public class DemoFactoryMethod {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 7")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
