package creational.abstract_factory.mac_os;

import creational.abstract_factory.abstractc_interfaces.Button;

public class MacOSButton implements Button {
    @Override
    public void paint(){
        System.out.println("You have created MacOSButton");
    }
}
