package creational.abstract_factory;

import creational.abstract_factory.abstractc_interfaces.Button;
import creational.abstract_factory.abstractc_interfaces.CheckBox;
import creational.abstract_factory.abstractc_interfaces.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
