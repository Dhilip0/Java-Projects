import java.awt.*;

class Simple{
    Simple(){
        Frame frame = new Frame("Simple App");

        Label label = new Label("This is Text");
        label.setBounds(50,30,100,20);

        Button btn = new Button("Click Me");
        btn.setBounds(50,70,100,30);
        TextField textField = new TextField("Enter your name");
        TextArea textArea = new TextArea("Enter your Description");
        Checkbox checkbox = new Checkbox("Male");
        Choice choice = new Choice();
        choice.add("India");
        choice.add("USA");
        choice.add("Sri Lanka");

        frame.add(btn);
        frame.add(label);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(200,200);
//      frame.setTitle("Simple App");
    }

    public static void main(String[] args) {
        new Simple();
    }
}
