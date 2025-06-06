import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//JLabel = a GUI display area for a string of text ,an image or both.
//JButton = a GUI button that performs an action when clicked on.

public class StartPanel extends JPanel{    // The First panel.
    
    private JButton StartButton = new JButton();
    JLabel Welcome;
    JLabel ImageOne;
    JLabel ImageTwo;
    ImageIcon backgroundPath = new ImageIcon("backgroundImg.jpg");
    private JLabel img = new JLabel(new ImageIcon(backgroundPath.getImage().getScaledInstance(1400, 800, Image.SCALE_SMOOTH)));
        
    public StartPanel(){
        this.setLayout(null);   //Absolute layout
        ImageOne = new JLabel();
        ImageIcon ImageOnePath =new ImageIcon("photo_2025-04-18_20-16-50.jpg");
        ImageOne.setBounds(900,500,510,510);
        ImageOne.setIcon(ImageOnePath);
        ImageTwo = new JLabel();
        ImageIcon ImageTwoPath =new ImageIcon("photo_2025-04-18_20-20-51.jpg");
        ImageTwo.setBounds(810,90,700,600);
        ImageTwo.setIcon(ImageTwoPath);
        Welcome = new JLabel ();
        Welcome.setBounds(270, 100, 800, 100);
        Welcome.setText("Welcome To Your Daily Planner!.");
        Welcome.setFont(new Font("MV Boli",Font.PLAIN ,50));
        Welcome.setForeground(Color.WHITE);// color of font .
        StartButton.setBounds(450, 425, 400, 150);
        StartButton.setText("Start Planning.");
        StartButton.setFont(new Font("MV Boli",Font.BOLD ,40));
        StartButton.setBackground(Color.white);
        StartButton.setFocusable(false);
        StartButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Main.changecard("Task No.s");
        }});
        this.add(StartButton, 0);
        this.add(Welcome, 0);
        img.setSize(1400,800);
        img.setLocation(0,0);
        this.add(img, -1);
    }
}