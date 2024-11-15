
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Traffic implements ActionListener{
  JFrame frame;
  JButton[] button = new JButton[3];
  JButton redButton, yelButton, greButton;
  JPanel buttonPanel, redPanel, yelPanel, grePanel;
  
  Traffic(){
    frame = new JFrame("Traffic Lights");
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);
    
    redButton = new JButton("Red");
    yelButton = new JButton("Yellow");
    greButton = new JButton("Green");

    button[0] = redButton;
    button[1] = yelButton;
    button[2] = greButton;

    for(int i=0; i<3; i++){
      button[i].addActionListener(this);
      button[i].setFont(new Font("Arial", Font.PLAIN, 20));
      button[i].setFocusable(false);
    }

    buttonPanel = new JPanel();
    buttonPanel.setBounds(50, 50, 400, 50);
    buttonPanel.setLayout(new GridLayout(1, 3, 5, 5));

    buttonPanel.add(redButton);
    buttonPanel.add(yelButton);
    buttonPanel.add(greButton);
    
    redPanel = new JPanel();
    redPanel.setBounds(50, 120, 130, 130);
    redPanel.setBackground(Color.GRAY);
    
    yelPanel = new JPanel();
    yelPanel.setBounds(185, 120, 130, 130);
    yelPanel.setBackground(Color.GRAY);
    
    grePanel = new JPanel();
    grePanel.setBounds(320, 120, 130, 130);
    grePanel.setBackground(Color.GRAY);
    

    frame.add(redPanel);
    frame.add(yelPanel);
    frame.add(grePanel);
    frame.add(buttonPanel);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
      Traffic traffic = new Traffic();
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == redButton){
      turnOffAll();
      redPanel.setBackground(Color.RED);
    }
    if(e.getSource() == yelButton){
      turnOffAll();
      yelPanel.setBackground(Color.YELLOW);
    }
    if(e.getSource() == greButton){
      turnOffAll();
      grePanel.setBackground(Color.GREEN);
    }
  }

  public void turnOffAll(){
    redPanel.setBackground(Color.GRAY);
    yelPanel.setBackground(Color.GRAY);
    grePanel.setBackground(Color.GRAY);
  }
}
