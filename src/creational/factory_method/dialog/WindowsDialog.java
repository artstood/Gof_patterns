package creational.factory_method.dialog;

import creational.factory_method.button.Button;
import creational.factory_method.button.WIndowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton(){
        return new WIndowsButton();
    }
}
