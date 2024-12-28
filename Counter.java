import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter extends Frame {

    TextField display;
    Button increment,reset;

    Counter()
    {
        display = new TextField("0");
        display.setBounds(50,50,200,30);

        increment = new Button("Increment");
        increment.setBounds(250,150,100,20);
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(display.getText());
                display.setText(String.valueOf(++num));
            }
        });

        reset = new Button("Reset");
        reset.setBounds(100,200,100,20);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });

        add(display);
        add(increment);
        add(reset);

        setLayout(null);
        setSize(500,500);
        setTitle("Tally Counter");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Counter();
    }
}
