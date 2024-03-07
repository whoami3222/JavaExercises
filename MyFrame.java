import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame  extends JFrame{
    MyFrame(){
        
    
    JFrame frame = new JFrame();//creates an instance of a frame
    this.setTitle("JFrame"); //sets title of frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit ouf of application(normally hides on close)
    this.setResizable(false);//prevent frame from being resized
    this.setSize(420,420);//sets x dimension and y dimension of our frame
    this.setVisible(true); //make frame visible

    ImageIcon image = new ImageIcon("bmw.jpg"); //create an image icon

    this.setIconImage(image.getImage());//change icon of frame
    this.getContentPane().setBackground(new Color(255,173,173)); //change color of background
    }
}
