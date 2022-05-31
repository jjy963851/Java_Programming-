package CSCI1010L;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MyAppGUI extends JFrame implements ActionListener{

	 private JFrame f;  
	 private JTextField text; 
	 private JTextField textState;
	 private JButton btnProcess;
	 private JButton btnReset;
	 private JButton btnExit;
	 private JRadioButton cityButton;
	 private JRadioButton zipButton;
	 
	 private JLabel Option;
	 private JLabel USCities;
	 private JLabel States;
	 
	 private JScrollPane Scroller;
	 
	 public MyAppGUI() {
		 setup();
	 }


	private void setup() {
		
		f = new JFrame("JaeYong Chang Screen");
    	text = new JTextField("");
	    text.setBounds(40,40, 300,200); 
		JScrollPane Scroller = new JScrollPane(text);
		Scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		text.add(Scroller);
		f.getContentPane().add(BorderLayout.CENTER,text);
		f.getContentPane().add(BorderLayout.SOUTH,text);
	
		f.getContentPane().add(text);
	   
	    
	  
		
	    btnProcess = new JButton("Process");
	    btnReset = new JButton("Reset");
	    btnExit = new JButton("Exit");
	    
	    cityButton = new JRadioButton("Select by Zip",false);
	    zipButton = new JRadioButton("Select by City",false);
	   
	    USCities = new JLabel("only for US Cities");
	    States = new JLabel("State");
	    Option = new JLabel("Option");
	    
	    btnProcess.setBounds(50, 450, 100, 50);
	    btnReset.setBounds(150, 450, 100, 50);
	    btnExit.setBounds(250, 450, 100, 50);
	    cityButton.setBounds(80,320,150,50);
	    zipButton.setBounds(80,300,150,50);;
	    USCities.setBounds(250,300,300,100);
	    States.setBounds(250, 350, 100, 100);
	    textState = new JTextField("");
	    textState.setBounds(300,400,100,20);
	    Option.setBounds(60,250,100,100);
	    
	    btnProcess.addActionListener(this);
	    btnReset.addActionListener(this);
	    btnExit.addActionListener(this);
	    cityButton.addActionListener(this);
	    zipButton.addActionListener(this);
	    
	    
	    f.add(btnProcess);
	    f.add(btnReset);
	    f.add(btnExit);
	    f.add(cityButton);
	    f.add(zipButton);
	    f.add(USCities);
	    f.add(States);
	    f.add(Option);
	    f.add(textState);
	   
	    f.add(text);
	    f.setSize(400,550);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    
	   
	  
	    
	    
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//String ac = e.getActionCommand();
		String ac = e.getActionCommand();
		if(e.getSource().equals(this.btnProcess)) {
			  this.text.setText("Change applied");
		}
		
		else if(e.getSource().equals(this.btnReset)) {
				this.text.setText("");

		}else if(e.getSource().equals(this.btnExit)) {
				System.exit(NORMAL); //this is how to turn off the program 

		}
		}
	public void reset() {
		
		
	}
		
	}


