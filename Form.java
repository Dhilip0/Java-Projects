import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Form {
    Form() {
        JFrame frame = new JFrame("Form");

        JLabel email = new JLabel("Email:");
        email.setBounds(50,130,100,30);

        JTextField emailInput = new JTextField("Enter your Email Id");
        emailInput.setBounds(170,130,100,30);

        JLabel password = new JLabel("Password:");
        password.setBounds(50,170,100,30);

        JTextField passwordIp = new JTextField("Enter your Password");
        passwordIp.setBounds(170,170,100,30);

        JLabel age = new JLabel("Age:");
        age.setBounds(50,210,100,30);

        JTextField ageInput = new JTextField("Enter your Age");
        ageInput.setBounds(170,210,100,30);

        JButton sumbit = new JButton("Submit");
        sumbit.setBounds(200,250,50,30);

        ActionListener submitListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(emailInput.getText());
                System.out.println(passwordIp.getText());
                System.out.println(ageInput.getText());
            }
        };

        ButtonListener buttonListener = new ButtonListener(emailInput,passwordIp,ageInput);

        sumbit.addActionListener(buttonListener);

        frame.add(email);
        frame.add(password);
        frame.add(age);
        frame.add(emailInput);
        frame.add(passwordIp);
        frame.add(ageInput);
        frame.add(sumbit);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,400);
    }

    public static void main(String[] args) {
        new Form();
    }
}

class ButtonListener implements ActionListener{
    JTextField emailInput;

    JTextField passwordIp;

    JTextField ageInput;

    ButtonListener(JTextField emailInput, JTextField passwordIp, JTextField ageInput){
        this.emailInput = emailInput;
        this.passwordIp = passwordIp;
        this.ageInput = ageInput;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(emailInput.getText());
        System.out.println(passwordIp.getText());
        System.out.println(ageInput.getText());
    }
}

