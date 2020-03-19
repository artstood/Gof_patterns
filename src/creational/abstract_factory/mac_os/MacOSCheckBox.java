package creational.abstract_factory.mac_os;

import creational.abstract_factory.abstractc_interfaces.CheckBox;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint(){
        System.out.println("You have created MacOS Check box");
    }
}
