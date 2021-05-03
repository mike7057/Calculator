//MemoryPlus
//Michael Olvera
//SP21-CPSC-24500-001

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;

import java.util.ArrayList;




class CalculatorFrame extends JFrame implements ActionListener {
    public JTextArea display; 
    public String currentDisplay = "";

    public CalculatorFrame() {
        setBounds (200,200,500,600); // Sets bounds of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets JFrame to exit when window is closed

        Container contentPane = getContentPane(); 
        contentPane.setLayout(new BorderLayout());


        display = new JTextArea();
        Font displayFont = display.getFont().deriveFont(Font.PLAIN, 70f); // Font size for calculator display
        //field.setText("Hello");
        display.setFont(displayFont); // Sets font used by display
        display.setEditable(false); // Disables editing of text field used for current number

        contentPane.add(display, BorderLayout.NORTH); //Adds display to contentpane on northern section of borderlayout

        JPanel myButtonPanel = new JPanel(); // Created JPanel of myButtonPanel
        contentPane.add(myButtonPanel, BorderLayout.CENTER); // Added mybuttonPanel to contentPane
        myButtonPanel.setLayout(new GridLayout(5,4)); // Set grid layout to myButtonPanel

        ArrayList<JButton> buttonList = new ArrayList<JButton>(16); //Creating jbuttons needed for calculator and adding them to buttonList
            buttonList.add(new JButton("CE"));
            buttonList.add(new JButton("C"));
            buttonList.add(new JButton(""));
            buttonList.add(new JButton("÷"));
            buttonList.add(new JButton("7"));
            buttonList.add(new JButton("8"));
            buttonList.add(new JButton("9"));
            buttonList.add(new JButton("x"));
            buttonList.add(new JButton("4"));
            buttonList.add(new JButton("5"));
            buttonList.add(new JButton("6"));
            buttonList.add(new JButton("-"));
            buttonList.add(new JButton("1"));
            buttonList.add(new JButton("2"));
            buttonList.add(new JButton("3"));
            buttonList.add(new JButton("+"));
            buttonList.add(new JButton("+/-"));
            buttonList.add(new JButton("0"));
            buttonList.add(new JButton("."));
            buttonList.add(new JButton("="));
            

        for(JButton b : buttonList){
            b.addActionListener(this); //Adds action listener to each button
            myButtonPanel.add(b); //Adds each button to buttonPanel
            Font buttonFont = b.getFont().deriveFont(Font.PLAIN, 50f); // Sets font size of font used for buttons
            b.setFont(buttonFont); //Sets buttons to buttonFont size 50
            
        }
    }

    public void actionPerformed(ActionEvent e) {
        String pressed = e.getActionCommand();

        if (pressed.matches("[0-9.]")) { // Checks to see if String coming in is a number or decimal
            currentDisplay = currentDisplay + pressed; //Adds button that was pressed to the string currentDisplay
            //System.out.println("currentDisplay = " + currentDisplay);
            display.setText(currentDisplay); //Sets JTextAreas text to match the string of currentDisplay
            
            

        } else if (pressed.matches("[÷x-+]")){ // If a symbol is pressed such as +-*/
            Integer inputInt = Integer.valueOf(pressed); // Converts String into Int of numbers
            System.out.println(inputInt);
        } else { // If clear or something similar is pressed

        }

        System.out.println(pressed);
        //StringHolder.inputValue = pressed; //Saves string in pressed to sharedValue in StringHolder.Java
        //Display.printNumber();
        
        
        
        
        
        
        
        
        
    }
}

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Its time for the Calculator");
        
        CalculatorFrame myCalculatorFrame = new CalculatorFrame();
        myCalculatorFrame.setVisible(true);
    }
}