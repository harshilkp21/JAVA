package AWT;

import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    Frame f = new Frame();
    Label firstnumber = new Label("First Number");
    Label secondnumber = new Label("Second Number");
    Label resultnumber = new Label("Result Number");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button add = new Button("Add");
    Button sub = new Button("Substract");
    Button mul = new Button("Multiply");
    Button div = new Button("Division");
    Button cancel =new Button("Cancel");

    Calculator()
    {
        int windowWidth = 1920;
        int windowHeight = 1080;

        firstnumber.setBounds(  50,  100,200,20);
        secondnumber.setBounds(  50,  140,200,20);
        resultnumber.setBounds(  50,  180,200,20);
        t1.setBounds(300, 100, 100, 20);
        t2.setBounds(300, 140, 100, 20);
        t3.setBounds(300, 180, 100, 20);
        add.setBounds(50, 250, 100, 30); // Increase button size
        sub.setBounds(160, 250, 100, 30); // Increase button size
        mul.setBounds(270, 250, 100, 30); // Increase button size
        div.setBounds(380, 250, 100, 30); // Increase button size
        cancel.setBounds( 490, 250, 100, 30); // Increase button size

        Font labelFont = new Font("Arial", Font.PLAIN, 15); // Increase font size
        firstnumber.setFont(labelFont);
        secondnumber.setFont(labelFont);
        resultnumber.setFont(labelFont);

        Font buttonFont = new Font("Arial", Font.PLAIN, 16); // Increase font size
        add.setFont(buttonFont);
        sub.setFont(buttonFont);
        mul.setFont(buttonFont);
        div.setFont(buttonFont);
        cancel.setFont(buttonFont);

        f.add(firstnumber);
        f.add(secondnumber);
        f.add(resultnumber);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(cancel);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        cancel.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(windowWidth, windowHeight);

    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if (e.getSource() == add) {
            t3.setText(String.valueOf(n1+n2));
        }
        if (e.getSource() == sub) {
            t3.setText(String.valueOf(n1-n2));
        }
        if (e.getSource() == mul) {
            t3.setText(String.valueOf(n1*n2));
        }
        if (e.getSource() == div) {
            t3.setText(String.valueOf((float)n1/n2));
        }
        if (e.getSource() == cancel) {
            System.exit(0);
        }
    }
}

public class Code {
    public static void main(String[] args) {
        new Calculator();
    }
    
}
