package CSCI1010;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;  

public class TicTacToe extends JFrame implements ActionListener{

	/** 
	* Attributes
	*
	*/
	private final String pattern1 = "xxx";
	private final String pattern2 = "ooo";
	
	private String array[][] = new String[3][3];

    private JFrame f;  
    private JTextField text; 
    private JTextField textCell00; 
    private JTextField textCell01; 
    private JTextField textCell02; 
    private JTextField textCell10; 
    private JTextField textCell11; 
    private JTextField textCell12; 
    private JTextField textCell20; 
    private JTextField textCell21; 
    private JTextField textCell22; 

    private JButton btnAccept;
    private JButton btnReset;
    private JButton btnExit;
    private JButton btnBOT;
		
	/**
	*	Default Constructor	
    */
	public TicTacToe () {
    	setup();
    }
    
	/**
	*	Setup vairious GUI controllers
	*/
    public void setup() {
		// TODO Auto-generated constructor stub
    	f = new JFrame("Tic-Tac-Toe");
    	text = new JTextField("");
	    text.setBounds(50,60, 300,50); 
	  
	    textCell00 = new JTextField("");
	    textCell01 = new JTextField("");
	    textCell02 = new JTextField("");
	    textCell10 = new JTextField("");
	    textCell11 = new JTextField("");
	    textCell12 = new JTextField("");
	    textCell20 = new JTextField("");
	    textCell21 = new JTextField("");
	    textCell22 = new JTextField("");

	    textCell00.setBounds(125,150,50,50);
	    textCell01.setBounds(175,150,50,50);
	    textCell02.setBounds(225,150,50,50);
	    textCell10.setBounds(125,200,50,50);
	    textCell11.setBounds(175,200,50,50);
	    textCell12.setBounds(225,200,50,50);
	    textCell20.setBounds(125,250,50,50);
	    textCell21.setBounds(175,250,50,50);
	    textCell22.setBounds(225,250,50,50);

	    btnAccept = new JButton("Accept");
	    btnReset = new JButton("Reset");
	    btnExit = new JButton("Exit");
	    btnBOT = new JButton("BOT");
		
	    btnAccept.setBounds(50, 350, 100, 50);
	    btnReset.setBounds(150, 350, 100, 50);
	    btnExit.setBounds(250, 350, 100, 50);
	    btnBOT.setBounds(50, 400, 300, 50);
	   
	    btnAccept.addActionListener(this);
		//Add actionListener to the other buttons


	    f.add(text); 
	    f.add(textCell00);
		//Add other text cells to the frame
		
	    f.add(btnAccept);
	    //add other buttons to the frame

	    f.setSize(400,550);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    
	    this.reset();
    }

	/**
	 * @return the text
	 */
	public JTextField getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(JTextField text) {
		this.text = text;
	}
	
	/**
	*	Event Action Listener
	*/
	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		if(e.getSource().equals(this.btnAccept)) {

		}else if(e.getSource().equals(this.btnReset)) {

		}else if(e.getSource().equals(this.btnExit)) {

		}else if(e.getSource().equals(this.btnBOT)) {

		}		
	}  

	private boolean[] matchPattern() {
		boolean result[] = {false, false};
		boolean done = false;
				
		return result;
	}

	
	private void reset() {

	}

	private boolean arrayfull() {
		boolean result = false;

		return result;	
	}
	
	private void processUserInput() {

	}

	private void callBot() {

	}
	
}
