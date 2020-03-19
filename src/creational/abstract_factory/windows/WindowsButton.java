package creational.abstract_factory.windows;

import creational.abstract_factory.abstractc_interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint(){
        System.out.println("You have created windows button");
    }
}
