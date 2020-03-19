package creational.abstract_factory.mac_os;

import creational.abstract_factory.abstractc_interfaces.Button;
import creational.abstract_factory.abstractc_interfaces.CheckBox;
import creational.abstract_factory.abstractc_interfaces.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new MacOSCheckBox();
    }
}
