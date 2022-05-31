import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalculatorUI extends JFrame implements ActionListener{

    
    // JFrame 
    private static JFrame frame; 
  
    // Add all JButton objects 
    private static JButton bOne; 
    private static JButton bTwo;
    private static JButton bThree;
    private static JButton bFour;
    private static JButton bFive;
    private static JButton bSix;
    private static JButton bSeven;
    private static JButton bEight;
    private static JButton bNine;
    private static JButton bPlus;
    private static JButton bMinus;
    private static JButton bSlash;
    private static JButton bZero;
    private static JButton bDot;
    private static JButton bEqual;
    private static JButton bStar;
    
    
  
    // text area 
    private static JTextArea tDisplay; 
    
    private int op1 = 0; // Operand 1
    private int op2 = 0; // Operand 2
    private int result = 0; // Result of the operation
    private int opCount = 0; // Number of operands entered 
    private int operator; // 1 = add; 2 = subtract; 3 = multiply; 4 = divide

public static void main(String[] args) {  
        
/*----------SECTION A: WINDOW FRAME - DON'T MODIFY THIS SECTION---*/
        frame = new JFrame();//creating instance of JFrame  
         //Set the frame dimensions and parameters
        frame.setSize(400,500);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
         
 
 /* button objects. Add the GUI objects to the frame object. Use the 
 * following codes for other digits and operations. 
         */
        // create a text area, specifying the rows and columns 
        tDisplay = new JTextArea("Display Results");
        tDisplay.setBounds(20, 20, 340, 40);
        tDisplay.setVisible(true);
        tDisplay.setLineWrap (true);
        tDisplay.setEditable (true);
/*-----------------END SECTION A------------------------------------*/
        
/*--------------SECTION B: CREATE BUTTONS---------------------------*/
        
        //Ceate the button object for digit '1' as shown on the document.
        JButton bOne=new JButton("1");//creating instance of JButton for digit 1  
        //Set the position and dimensions of the button object
        bOne.setBounds(30,100,60, 35);//x axis, y axis, width, height  
        JButton bTwo=new JButton("2");
        bTwo.setBounds(90,100,60,35);
        JButton bThree=new JButton("3");
        bThree.setBounds(150,100,60,35);
        JButton bPlus=new JButton("+");
        bPlus.setBounds(270,100,60,35);
        
        JButton bFour=new JButton("4");
         bFour.setBounds(30,160,60,35);
        JButton bFive=new JButton("5");
        bFive.setBounds(90,160,60,35);
        JButton bSix=new JButton("6");
        bSix.setBounds(150,160,60,35);
        JButton bMinus=new JButton("-");
        bMinus.setBounds(270,160,60,35);
        JButton bSeven=new JButton("7");
        bSeven.setBounds(30,220,60,35);
        JButton bEight=new JButton("8");
        bEight.setBounds(90,220,60,35);
        JButton bNine=new JButton("9");
        bNine.setBounds(150,220,60,35);
        JButton bSlash=new JButton("/");
        bSlash.setBounds(270,220,60,35);
        JButton bZero=new JButton("0");
        bZero.setBounds(30,280,60,35);
        JButton bDot=new JButton(".");
        bDot.setBounds(90,280,60,35);
        JButton bEqual=new JButton("=");
        bEqual.setBounds(150,280,60,35);
        JButton bStar=new JButton("*");
        bStar.setBounds(270,280,60,35);
        //Create button object for digit '2' as shown on the document.
        //Set the position and dimensions of the button object
    
        //Create button object for digit '3' as shown on the document.
        //Set the position and dimensions of the button object
    
        
//Create all other buttons
/*-------------------END CREATE BUTTON SECTION-----------------------*/
/*--------SECTION C: ADD BUTTONS TO THE FRAME -----------------------*/
        //Add all the GUI objects to the frame 
        frame.add(bOne);
        frame.add(bTwo);
        frame.add(bThree);
        frame.add(bPlus);
        frame.add(bFour);
        frame.add(bFive);
        frame.add(bSix);
        frame.add(bMinus);
        frame.add(bSeven);
        frame.add(bEight);
        frame.add(bNine);
        frame.add(bSlash);
        frame.add(bZero);
        frame.add(bDot);
        frame.add(bEqual);
        frame.add(bStar);
        
        
        frame.add(tDisplay);
        frame.setVisible(true);//making the frame visible 
        
        CalculatorUI calac = new CalculatorUI();
        //add here button bone.addaction listner
        bOne.addActionListener(calac);
        bTwo.addActionListener(calac);
        bThree.addActionListener(calac);
        bFour.addActionListener(calac);
        bFive.addActionListener(calac);
        bSix.addActionListener(calac);
        bSeven.addActionListener(calac);
        bEight.addActionListener(calac);
        bNine.addActionListener(calac);
        bSlash.addActionListener(calac);
        bZero.addActionListener(calac);
        bDot.addActionListener(calac);
        bEqual.addActionListener(calac);
        bStar.addActionListener(calac);
        bMinus.addActionListener(calac);
        bPlus.addActionListener(calac);
        
/*-------------------END SECTION C ----------------------------------*/

    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String ac = e.getActionCommand();
        if(opCount == 0) {
            tDisplay.setText("");
        }
        tDisplay.append(ac);
        if(ac.equals("=")) {
        opCount = 0;
        if(operator == 1) {
        //addition operation
        result = op1 + op2;
        tDisplay.append(Integer.toString(result));
        }
        
        else if(operator == 2) {
        //Add codes for the subtraction 
         result = op1 - op2;
         tDisplay.append(Integer.toString(result));
        }
        // Add "else if" code blocks to include 
        else if(operator == 3){
        
        result = op1*op2;
        tDisplay.append(Integer.toString(result));
        }
        else if(operator ==4) {
            
        result = op1/op2;
        tDisplay.append(Integer.toString(result));
        }
        }
        else if(ac.equals("+")) {
        operator = 1;
        
        }
        
        else if(ac.equals("-")) {
        operator = 2;
        }
        else if(ac.equals("*")) {
        operator = 3;
        }
        else if(ac.equals("/")) {
        operator = 4;
        }
    
        else  {
            int value = Integer.valueOf(ac);
        if(opCount < 1) {
            op1 = value;
            opCount = 1;
        }
        else if(opCount >= 1) {
            op2 = value;
            opCount = 2;
        }
        
    }
    
}
    
}

