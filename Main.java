import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{

	//CardLayout = Layout manager allows to swap between components in the same window.
	//              only one component is visible at a time. 
	//               this component here is panel.

	static CardLayout cardlayout = new CardLayout();
	static Container container = new Container();
	StartPanel startpanel;
	public static TaskNumberPanel tasknumberPanel;
	public static Planner planner = new Planner();

	public Main(){
		//Frame.
		this.setSize(1400, 800);
		this.setTitle("  || O6U Project");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		ImageIcon icone = new ImageIcon("TaskIcon.png");
		this.setIconImage(icone.getImage());

		//Card Layout.
		container = getContentPane();
		container.setLayout(cardlayout);

		//Panel1.
		startpanel = new StartPanel();

		//Panel2.
		tasknumberPanel = new TaskNumberPanel();

		//Add Panels to Frame.
		container.add(startpanel,"Welcome Panel");
		container.add(tasknumberPanel,"Task No.s");
		container.add(planner,"Tasks Panel");
		
		this.setVisible(true);
		this.repaint();
	}


	public static void changecard(String ChoosedPanel){
		cardlayout.show(container, ChoosedPanel);	//how to get the next panel.	
	} 

	public static void main(String[] args){
		new Main();
	}
}
