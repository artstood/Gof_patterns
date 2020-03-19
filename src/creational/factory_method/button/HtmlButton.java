package creational.factory_method.button;

public class HtmlButton implements Button {

    public void render(){
        System.out.println("<button>Test button</button>");
        onClick();
    }
    public void onClick(){
        System.out.println("Click");
    }
}
