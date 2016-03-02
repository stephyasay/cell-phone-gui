import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;

/**
 * The PhoneGUI class calls the methods in the Phone object.
 * 
 * @author Stephanie Yasay 
 */
public class PhoneGUI
{
    Phone phone = new Phone();
    JFrame frame = new JFrame();
    FlowLayout flow = new FlowLayout();
    GridLayout numberKeypad = new GridLayout(4,3);
    GridLayout functionKeypad = new GridLayout(3,2);
    JLabel number;
    JButton button1; 
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton starButton;
    JButton button0;
    JButton poundButton;
    JButton callButton;
    JButton endButton;
    JButton redialButton;
    JButton deleteButton;
    JButton clearButton;
    JButton exitButton;
    JPanel numPanel;
    JPanel functionPanel;
    JPanel display;
    boolean onCall = false;
    Font numFont = new Font("Courier New", Font.BOLD, 30);
    Font functionFont = new Font("Courier New", Font.BOLD, 15);
    
    public static void main (String [] args){
        new PhoneGUI();
    }
    
    public PhoneGUI()
    {
        number = new JLabel("");
        numPad();
        callFunctions();
        enableButtons();
        
        frame.setLayout(new BorderLayout());
        frame.add(numPanel, BorderLayout.CENTER);
        frame.add(functionPanel, BorderLayout.SOUTH);
        frame.add(display, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * This creates the buttons on the number keypad by adding buttons and calls the action listeners.
     */
    public void numPad()
    {
        numPanel = new JPanel(numberKeypad);
        
        button1 = new JButton("1");
        button1.setFont(numFont);
        button1.setForeground(Color.RED);
        button1.setBackground(Color.WHITE);
        button1.setOpaque(true);
        button1.addActionListener(new numPadListener());
        numPanel.add(button1);
        
        button2 = new JButton("2");
        button2.setFont(numFont);
        button2.setForeground(Color.RED);
        button2.setBackground(Color.WHITE);
        button2.setOpaque(true);
        button2.addActionListener(new numPadListener());
        numPanel.add(button2);
        
        button3 = new JButton("3");
        button3.setFont(numFont);
        button3.setForeground(Color.RED);
        button3.setBackground(Color.WHITE);
        button3.setOpaque(true);
        button3.addActionListener(new numPadListener());
        numPanel.add(button3);
        
        button4 = new JButton("4");
        button4.setFont(numFont);
        button4.setForeground(Color.RED);
        button4.setBackground(Color.WHITE);
        button4.setOpaque(true);
        button4.addActionListener(new numPadListener());
        numPanel.add(button4);
        
        button5 = new JButton("5");
        button5.setFont(numFont);
        button5.setForeground(Color.RED);
        button5.setBackground(Color.WHITE);
        button5.setOpaque(true);
        button5.addActionListener(new numPadListener());
        numPanel.add(button5);
        
        button6 = new JButton("6");
        button6.setFont(numFont);
        button6.setForeground(Color.RED);
        button6.setBackground(Color.WHITE);
        button6.setOpaque(true);
        button6.addActionListener(new numPadListener());
        numPanel.add(button6);
        
        button7 = new JButton("7");
        button7.setFont(numFont);
        button7.setForeground(Color.RED);
        button7.setBackground(Color.WHITE);
        button7.setOpaque(true);
        button7.addActionListener(new numPadListener());
        numPanel.add(button7);
        
        button8 = new JButton("8");
        button8.setFont(numFont);
        button8.setForeground(Color.RED);
        button8.setBackground(Color.WHITE);
        button8.setOpaque(true);
        button8.addActionListener(new numPadListener());
        numPanel.add(button8);
        
        button9 = new JButton("9");
        button9.setFont(numFont);
        button9.setForeground(Color.RED);
        button9.setBackground(Color.WHITE);
        button9.setOpaque(true);
        button9.addActionListener(new numPadListener());
        numPanel.add(button9);
        
        starButton = new JButton("*");
        starButton.setFont(numFont);
        starButton.setForeground(Color.RED);
        starButton.setBackground(Color.WHITE);
        starButton.setOpaque(true);
        starButton.addActionListener(new numPadListener());
        numPanel.add(starButton);
        
        button0 = new JButton("0");
        button0.setFont(numFont);
        button0.setForeground(Color.RED);
        button0.setBackground(Color.WHITE);
        button0.setOpaque(true);
        button0.addActionListener(new numPadListener());
        numPanel.add(button0);
        
        poundButton = new JButton("#");
        poundButton.setFont(numFont);
        poundButton.setForeground(Color.RED);
        poundButton.setBackground(Color.WHITE);
        poundButton.setOpaque(true);
        poundButton.addActionListener(new numPadListener());
        numPanel.add(poundButton);
    }
    
    /** 
     * This creates display field and call function buttons and calls the action listeners.
     */
    public void callFunctions()
    {
        display = new JPanel(flow);
        display.add(number);
       
        functionPanel = new JPanel(functionKeypad);
        
        callButton = new JButton("CALL");
        callButton.setFont(functionFont);
        callButton.setForeground(Color.RED);
        callButton.setBackground(Color.WHITE);
        callButton.setOpaque(true);
        callButton.addActionListener(new functionPadListener());
        functionPanel.add(callButton);
        
        endButton = new JButton("END");
        endButton.setFont(functionFont);
        endButton.setForeground(Color.RED);
        endButton.setBackground(Color.WHITE);
        endButton.setOpaque(true);
        endButton.addActionListener(new functionPadListener());
        functionPanel.add(endButton);
        
        redialButton = new JButton("REDIAL");
        redialButton.setFont(functionFont);
        redialButton.setForeground(Color.RED);
        redialButton.setBackground(Color.WHITE);
        redialButton.setOpaque(true);
        redialButton.addActionListener(new functionPadListener());
        functionPanel.add(redialButton);
        
        deleteButton = new JButton("DELETE");
        deleteButton.setFont(functionFont);
        deleteButton.setForeground(Color.RED);
        deleteButton.setBackground(Color.WHITE);
        deleteButton.setOpaque(true);
        deleteButton.addActionListener(new numPadListener());
        functionPanel.add(deleteButton);
        
        clearButton = new JButton("CLEAR");
        clearButton.setFont(functionFont);
        clearButton.setForeground(Color.RED);
        clearButton.setBackground(Color.WHITE);
        clearButton.setOpaque(true);
        clearButton.addActionListener(new numPadListener());
        functionPanel.add(clearButton);
        
        exitButton = new JButton("EXIT");
        exitButton.setFont(functionFont);
        exitButton.setForeground(Color.RED);
        exitButton.setBackground(Color.WHITE);
        exitButton.setOpaque(true);
        exitButton.addActionListener(new exitButtonListener());
        functionPanel.add(exitButton);
    }
    
    /**
     * This is the class for the action listeners for the call function buttons.
     */
    private class functionPadListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            JButton e = (JButton)evt.getSource();
            if(e.getText().equals("CALL"))
            {
                phone.setPrevNum(phone.getNumber());
                number.setText("Calling " + phone.getNumber());
                changeCallStatus();
            }
            else if(e.getText().equals("END"))
            {
                number.setText("Call Ended");
                phone.setNumber("");
                changeCallStatus();
            }
            else
            {
                if(phone.getPrevNum().equals(""))
                {
                    number.setText("");
                }
                else
                {
                    number.setText("Calling " + phone.getPrevNum());
                    changeCallStatus();
                }
            }
        }
    }
    
    /**
     * This is the class for the action listeners for the delete and clear functions. 
     */
    private class numPadListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            JButton e = (JButton)evt.getSource();
            if(e.getText().equals("DELETE"))
            {
                phone.minusDigit();
            }
            else if(e.getText().equals("CLEAR"))
            {
                phone.clear();
            }
            else
            {
                phone.addDigit(e.getText().charAt(0));
            }
            number.setText(phone.getNumber());
        }
    }
    
    /**
     * This class is for the action listener for the Exit button.
     */
    private class exitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    /** 
     * This method will change the call status to enable or disable buttons depending if in a call state or not in a call state.
     */
    public void changeCallStatus()
    {
        onCall = !onCall;
        if(onCall) {
            disableButtons();
        } else {
            enableButtons();
        }
    }
    
    /**
     * This method is called when the buttons are enabled.
     */
    public void enableButtons()
    {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        starButton.setEnabled(true);
        button0.setEnabled(true);
        poundButton.setEnabled(true);
        callButton.setEnabled(true);
        endButton.setEnabled(false);
        redialButton.setEnabled(true);
        deleteButton.setEnabled(true);
        clearButton.setEnabled(true);
        exitButton.setEnabled(true);
    }
    
    /**
     * This method is called when the buttons are disabled.
     */
    public void disableButtons()
    {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        starButton.setEnabled(false);
        button0.setEnabled(false);
        poundButton.setEnabled(false);
        callButton.setEnabled(false);
        endButton.setEnabled(true);
        redialButton.setEnabled(false);
        deleteButton.setEnabled(false);
        clearButton.setEnabled(false);
        exitButton.setEnabled(false);
    }
}
