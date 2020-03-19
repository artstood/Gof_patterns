package creational.abstract_factory.windows;

import creational.abstract_factory.abstractc_interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint(){
        System.out.println("You have created Windows Check box");
    }
}
