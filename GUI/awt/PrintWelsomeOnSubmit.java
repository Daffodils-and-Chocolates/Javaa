package GUI.awt;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class PrintWelsomeOnSubmit{
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Frame f =new Frame("Frame to print welcome to user!!");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });

        Panel mainPanel = new Panel();
        mainPanel.setLayout(new GridLayout(3,1));
        mainPanel.setBackground(Color.BLACK);

        Panel inputPanel = new Panel();
        inputPanel.setBackground(Color.MAGENTA);
        Label l1 = new Label("Enter Username");
        Label l2 = new Label();
        l2.setBackground(Color.CYAN);
        TextField t = new TextField(30);
        inputPanel.add(l1);
        inputPanel.add(t);

        Panel submitPanel = new Panel();
        Button b = new Button("Submit");
        submitPanel.add(b);

        Panel welcomePanel = new Panel();
        welcomePanel.add(l2);
        welcomePanel.setBackground(Color.GRAY);

        mainPanel.add(inputPanel);
        mainPanel.add(submitPanel);
        mainPanel.add(welcomePanel);

        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.add(mainPanel);
        f.setVisible(true);
        f.setSize(500,500);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String welcomeMssg = "Welcome User " + t.getText()+"!";
                l2.setText(welcomeMssg);
                int a = welcomeMssg.length() * 5;
                l2.setSize(new Dimension(a, 22));
                welcomePanel.setLayout(new FlowLayout());
                welcomePanel.validate();
            }
        });
    }
}