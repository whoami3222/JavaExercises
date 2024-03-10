import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    MiFrame(){

        ImageIcon icon  = new ImageIcon("bmw.jpg");
        
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,100,250,150);
        button.addActionListener(this);
        button.setText("Im a button");
        button.setFocusable(false);
        //button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit ouf of application(normally hides on close)
        this.setSize(500,500);//sets x dimension and y dimension of our frame
        this.setVisible(true); //make frame visible
        this.setLayout(null);
        this.add(button);
        this.add(label);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
           // System.out.println("poo");
           button.setEnabled(false);
           label.setVisible(true);
        }
    }
}
