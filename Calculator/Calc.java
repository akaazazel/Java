import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc implements ActionListener {
  JFrame frame;
  JTextField textField;
  JPanel panel;
  JButton numberButton[] = new JButton[10];
  JButton funcButton[] = new JButton[8];
  JButton addButton, subButton, mulButton, divButton;
  JButton decButton, equButton, delButton, clrButton;

  Font myFont = new Font("Poppins", Font.PLAIN, 20);

  double num1 = 0, num2 = 0, result = 0;
  char operator;

  Calc(){
    frame = new JFrame("Calculator");
    frame.setSize(430, 550);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);

    textField = new JTextField();
    textField.setBounds(50, 50, 310, 50);
    textField.setFont(myFont);
    textField.setEditable(false);

    addButton = new JButton("+");
    subButton = new JButton("-");
    mulButton = new JButton("*");
    divButton = new JButton("/");
    decButton = new JButton(".");
    equButton = new JButton("=");
    delButton = new JButton("DEL");
    clrButton = new JButton("CLR");

    funcButton[0] = addButton;
    funcButton[1] = subButton;
    funcButton[2] = mulButton;
    funcButton[3] = divButton;
    funcButton[4] = decButton;
    funcButton[5] = equButton;
    funcButton[6] = delButton;
    funcButton[7] = clrButton;

    for(int i=0; i<8; i++){
      funcButton[i].addActionListener(this);
      funcButton[i].setFont(myFont);
      funcButton[i].setFocusable(false);
    }

    for(int i=0; i<10; i++){
      numberButton[i] = new JButton(String.valueOf(i));
      numberButton[i].addActionListener(this);
      numberButton[i].setFont(myFont);
      numberButton[i].setFocusable(false);
    }

    panel = new JPanel();
    panel.setBounds(50, 110, 310, 310);
    panel.setLayout(new GridLayout(4,4,10,10));

    panel.add(numberButton[1]);
    panel.add(numberButton[2]);
    panel.add(numberButton[3]);
    panel.add(addButton);
    panel.add(numberButton[4]);
    panel.add(numberButton[5]);
    panel.add(numberButton[6]);
    panel.add(subButton);
    panel.add(numberButton[7]);
    panel.add(numberButton[8]);
    panel.add(numberButton[9]);
    panel.add(mulButton);
    panel.add(decButton);
    panel.add(numberButton[0]);
    panel.add(equButton);
    panel.add(divButton);

    delButton.setBounds(50, 430, 150, 50);
    clrButton.setBounds(210, 430, 150, 50);
    
    frame.add(textField);
    frame.add(panel);
    frame.add(delButton);
    frame.add(clrButton);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
      Calc calc = new Calc();
  }

  @Override
  public void actionPerformed(ActionEvent e){

    for(int i=0; i<10; i++){
      if(e.getSource() == numberButton[i]){
        textField.setText(textField.getText().concat(String.valueOf(i)));
      }
    }

    if(e.getSource() == decButton){
      textField.setText(textField.getText().concat("."));
    }

    if(e.getSource() == addButton){
      num1 = Double.parseDouble(textField.getText());
      operator = '+';
      textField.setText("");
    }

    if(e.getSource() == subButton){
      num1 = Double.parseDouble(textField.getText());
      operator = '-';
      textField.setText("");
    }

    if(e.getSource() == mulButton){
      num1 = Double.parseDouble(textField.getText());
      operator = '*';
      textField.setText("");
    }

    if(e.getSource() == divButton){
      num1 = Double.parseDouble(textField.getText());
      operator = '/';
      textField.setText("");
    }

    if(e.getSource() == equButton){
      num2 = Double.parseDouble(textField.getText());

      switch(operator){
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          result = num1 / num2;
          break;
      }

      textField.setText(String.valueOf(result));
      num1 = result;
    }

    if(e.getSource() == clrButton){
      textField.setText("");
    }

    if(e.getSource() == delButton){
      String string = textField.getText();
      textField.setText("");

      for(int i=0; i<string.length() - 1; i++){
        textField.setText(textField.getText().concat(String.valueOf(string.charAt(i))));
      }
    }
  }
}
