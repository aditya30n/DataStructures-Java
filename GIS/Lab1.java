package GIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class Lab1 extends JPanel implements KeyListener, ActionListener{
	JPanel jpButton = new JPanel();
	JButton btnOrange = new JButton("Orange");
	JButton btnGray = new JButton("Gray");
	JButton btnGreen = new JButton("Green");
	JPanel jpText = new JPanel();
	JLabel lblText = new JLabel("Enter Text");
	JTextField tf = new JTextField(30);	
	JPanel jpRadio = new JPanel();
	JRadioButton rdSdsu = new JRadioButton("SDSU");
	JRadioButton rdUcsd = new JRadioButton("UCSD");
	JLabel lblImages = new JLabel();	
	JTabbedPane tp = new JTabbedPane();
	
	public Lab1() {		
	    JPanel jpButton = tab1();
		tp.addTab("Buttons",jpButton);
		JPanel jpText = tab2();
		tp.addTab("Text",jpText);
		JPanel jpRadio = tab3();
		tp.addTab("Radio",jpRadio);		               
		add(tp);
        setLayout(new GridLayout(1,1));
        setAlignmentY(LEFT_ALIGNMENT);
		
	}
    public JPanel tab1(){
    	btnOrange.addActionListener(this);
    	btnOrange.setBackground(Color.orange);
        btnGray.addActionListener(this);
        btnGray.setBackground(Color.gray);
        btnGreen.addActionListener(this);
        btnGreen.setBackground(Color.GREEN);
        jpButton.add(lblImages,BorderLayout.WEST);
        jpButton.add(btnOrange);
        jpButton.add(btnGray);
        jpButton.add(btnGreen);
		return jpButton;
	}
        
   public JPanel tab2() {
	   tf.addKeyListener((KeyListener) this);
	   tf.setBorder(BorderFactory.createLineBorder(Color.yellow));
	   jpText.add(lblText);
	   jpText.add(tf);       
	   return jpText;
	}
    
   public JPanel tab3(){               
	   ButtonGroup g = new ButtonGroup();
	   g.add(rdSdsu);
	   g.add(rdUcsd);
       rdSdsu.addActionListener(this);
       rdUcsd.addActionListener(this);
       jpRadio.add(rdSdsu);
       jpRadio.add(rdUcsd);
       jpRadio.add(lblImages,BorderLayout.WEST);            
       return jpRadio;
	}
	        
    public static void main(String[] args) {
		JFrame frame = new JFrame("Lab 1 Aditya");
		frame.getContentPane();
		frame.addWindowListener(new WindowAdapter() {	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
				
		frame.add(new Lab1() {
	                    
	        public void actionPerformed(ActionEvent e) {
	            if(e.getSource()==btnOrange)
	            {
	               jpButton.setBackground(Color.orange);
	            }
	            else if(e.getSource()==btnGray)
	            {
	               jpButton.setBackground(Color.gray);
	            }
	            else if(e.getSource()==btnGreen)
	            {
	               jpButton.setBackground(Color.green);
	            }
	            if(e.getSource()==rdSdsu)
	            {
	            	ImageIcon pic = new ImageIcon("F:\\Android\\GIS\\sdsu_tx700.jpg");
	                lblImages.setIcon(pic);	               
	              } 
	            else if(e.getSource()==rdUcsd)
	            {
	               ImageIcon pic = new ImageIcon("F:\\Android\\GIS\\ucsd.jpg");
	               lblImages.setIcon(pic);              
	            }       
	        }   
	        
			public void keyPressed(KeyEvent e) {
			}
			public void keyTyped(KeyEvent e) {           
			}
		    public void keyReleased(KeyEvent e) {     
		        String t = tf.getText();
		        lblText.setText(t);		        
		    }  
      });
    frame.setLayout(new GridLayout());	
	frame.setVisible(true);
	frame.setSize(800, 600);
	frame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	}
}