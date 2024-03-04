package GUI.awt;
import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;

public class SwapTextFields {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Frame f = new Frame("practise");

        f.addWindowListener(new WindowAdapter() { // to make the close button actually work
            @Override
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });

        Label l1 = new Label("First Name");
        Label l2 = new Label("Last name");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);

        Font labelFont = new Font("Arial", Font.PLAIN, 18);
        l1.setFont(labelFont);
        l2.setFont(labelFont);
        t1.setFont(labelFont);
        t2.setFont(labelFont);

        Button b1 = new Button("Submit");
        b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                    String temp = t1.getText();
                    t1.setText(t2.getText());
                    t2.setText(temp);
                }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);

        f.setLayout(new FlowLayout());
        f.setSize(1000,100);
        f.setVisible(true);
    }
}