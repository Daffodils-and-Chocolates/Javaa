package GUI.awt;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        Font largeFont = new Font("Arial", Font.PLAIN ,50);
        Font NormalFont = new Font("Arial", Font.PLAIN, 30);
        Font smallestFont = new Font("Arial", Font.PLAIN, 20);

        Panel UserInput = new Panel(new GridLayout(3, 1));

        Panel row1 = new Panel(new FlowLayout());

        Panel row2 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        Label history1 = new Label("");
        history1.setFont(smallestFont);
        // row2.setBackground(Color.CYAN);
        row2.add(history1);

        Panel row3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        Label userInput = new Label("0");
        userInput.setFont(largeFont);
        row3.add(userInput);

        UserInput.add(row1);
        UserInput.add(row2);
        UserInput.add(row3);

        Panel calculatorPanel = new Panel(new GridLayout(6, 4));
        Button[] buttons = {
            new Button("%"),
            new Button("CE"),
            new Button("C"),
            new Button("del"),

            new Button("1/x"),
            new Button("x^2"),
            new Button("(x)^1/2"),
            new Button("÷"),
            
            new Button("7"),
            new Button("8"),
            new Button("9"),
            new Button("x"),
            
            new Button("4"),
            new Button("5"),
            new Button("6"),
            new Button("-"),

            new Button("1"),
            new Button("2"),
            new Button("3"),
            new Button("+"),
            
            new Button("+/-"),
            new Button("0"),
            new Button("."),
            new Button("="),      
        };

        for (Button button : buttons) {
            calculatorPanel.add(button);
        }

        f.setLayout(new GridLayout(2, 1));
        f.add(UserInput);
        f.add(calculatorPanel);
        f.setVisible(true);
        f.setSize(600, 600);

        for (int i=7;i<=22;i++) {//the number and the operators
            if(i==20) continue;
            final int index = i;
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    userInput.setText(PrintString(userInput, buttons[index].getLabel(),history1,row2));
                    row3.validate();
                }
            });
        }

        buttons[23].addActionListener(new ActionListener() {//equal to =
            public void actionPerformed(ActionEvent e){
                String expression = (history1.getText()+userInput.getText()).replace('x', '*').replace('÷', '/');;
                String result = calculate(expression);
                String text = history1.getText()+userInput.getText()+"=";
                setSomeText(row2, history1, text);
                setSomeText(row3, userInput, result);
            }
        });

        buttons[3].addActionListener(new ActionListener() {// the del button
            public void actionPerformed(ActionEvent e){
                String text = userInput.getText();
                String lastChar = text.charAt(text.length() - 1)+"";
                if(lastChar.equals("÷")||lastChar.equals("+")||lastChar.equals("-")||lastChar.equals("x")){
                    return;
                }
                if(text.length()==1){
                    userInput.setText("0");
                    return;
                }
                setSomeText(row3, userInput, text.substring(0, text.length()-1));
            }
        });

        buttons[2].addActionListener(new ActionListener() {//C button
            public void actionPerformed(ActionEvent e){
                setSomeText(row3, userInput, "0");
                setSomeText(row2, history1, "");
            }
        });
        
    }

    static void setSomeText(Panel panel, Label label, String text){
        label.setText(text);
        label.setSize(new Dimension(text.length()*15 , 22));
        panel.validate();
    }
    static String PrintString(Label userInput, String str,Label recent, Panel row2){
        String text = userInput.getText();
        String a ="";
        String lastChar = text.charAt(text.length() - 1)+"";
        if(!text.equals("0")) a+=text;

        if((str.equals("÷")||str.equals("+")||str.equals("-")||str.equals("x"))&&(lastChar.equals("÷")||lastChar.equals("+")||lastChar.equals("-")||lastChar.equals("x"))){
            a=text.substring(0, text.length() - 1);
        }//not adding two operators continously

        if(str.equals("÷")||str.equals("+")||str.equals("-")||str.equals("x")){
            setSomeText(row2, recent, recent.getText()+a+str);
        }//updating the recent

        if(!(str.equals("÷")||str.equals("+")||str.equals("-")||str.equals("x"))&&(lastChar.equals("÷")||lastChar.equals("+")||lastChar.equals("-")||lastChar.equals("x"))){
            return str;
        }
        return(a+str);        
    }
    public static String calculate(String infixExpression) {
        String postfixExpression = infixToPostfix(infixExpression);
        int result = evaluatePostfix(postfixExpression);
        return result+"";
        // return postfixExpression;
        // return infixExpression;
    }

    static int evaluatePostfix(String exp)
    {
        // Create a stack
        Stack<Integer> stack = new Stack<>();
 
        // Scan all characters one by one
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
 
            // If the scanned character is an operand
            // (number here), push it to the stack.
            if (Character.isDigit(c))
                stack.push(c - '0');
 
            //  If the scanned character is an operator, pop
            //  two elements from stack apply the operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
 
                switch (c) {
                case '+':
                    stack.push(val2 + val1);
                    break;
                case '-':
                    stack.push(val2 - val1);
                    break;
                case '/':
                    stack.push(val2 / val1);
                    break;
                case '*':
                    stack.push(val2 * val1);
                    break;
                }
            }
        }
        return stack.pop();
    }
 

    static String infixToPostfix(String exp)
    {
        // Initializing empty String for result
        String result = new String("");
 
        // Initializing empty stack
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
 
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
 
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
 
            // If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                       && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
 
                stack.pop();
            }
           
            // An operator is encountered
            else
            {
                while (!stack.isEmpty()
                       && Prec(c) <= Prec(stack.peek())) {
 
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
 
        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
       
        return result;
    }

    static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }
 
}