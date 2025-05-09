
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame 
{
	//CardLayout = Layout manager allows to swap between components in the same window.
   //              only one component is visible at a time. 
  //               this component here is panel.
	static CardLayout cardlayout;
	static Container container;//container of panels.
	StartPanel startpanel;
	public static TaskNumberPanel tasknumberPanel; 
	public static Planner planner;
		
//    private Timer RefreshGUI;
	
	 public Main()
	{
	 //Frame.
	 this.setSize(1400, 800);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setLocationRelativeTo(null);
	 
	 ImageIcon icone = new ImageIcon("TaskIcon.png");
	 this.setIconImage(icone.getImage());
		
	 //Card Layout.
	 cardlayout = new CardLayout();
	 container =  getContentPane();// get the content of frame.
	 container.setLayout(cardlayout);
	 
	 //Panel1.
	 startpanel = new StartPanel();
	 
	 //Panel2.
	 tasknumberPanel  = new TaskNumberPanel (); 
	 
	 //Panel3.
	 planner = new Planner();
	 
	 //Switch Buttons.

	 

	  
	 // Add the switch buttons to Panels.
	 

	 
	 
	 //Add Panels to Frame.
	 container.add(startpanel,"Welcome Panel");
	 container.add(tasknumberPanel,"Task No.s");
	 container.add(planner,"Tasks Panel");

	 this.setVisible(true);
	 this.repaint();
	}

	int CurrentPanel = 1;
	// @Override public void actionPerformed(ActionEvent e)   // will delete
	// {
	// 	// if(e.getSource() == SwitchButton1 || e.getSource() == SwitchButton2)		// temp 
	// 	{
	// 		planner.GetDefault();
	// 		CurrentPanel++;
	// 		if(CurrentPanel>3)
	// 		{
	// 			JOptionPane.showMessageDialog(this, "Start Over");
	// 			// parent,title ,message,type of mark.
	// 			// we can use color chooser method to set its color.
	// 			CurrentPanel = 1;
	// 		}
	// 		cardlayout.show(container, "p"+ CurrentPanel);//how to get the next panel.	
	// 	}
	// 	if(e.getSource() == PreviousButton2)
	// 	{

	// 		CurrentPanel--;
	// 		if(CurrentPanel < 1)
	// 		{

	// 		}
	// 		cardlayout.show(container, "p"+ CurrentPanel);//how to get the next panel.	
	// 	}
	// }
	//  this
	public static void changecard(String ChoosedPanel){
		cardlayout.show(container, ChoosedPanel);//how to get the next panel.	
	} 

	public static void main(String[] args) 
	{
		new Main();
	}
}
