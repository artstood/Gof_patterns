package creational.abstract_factory.windows;

import creational.abstract_factory.abstractc_interfaces.Button;
import creational.abstract_factory.abstractc_interfaces.CheckBox;
import creational.abstract_factory.abstractc_interfaces.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}
