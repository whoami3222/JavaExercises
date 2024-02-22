import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
   
    public static void main(String[] args) {
        
        /* 
        System.out.println("\tI love pizza");
        System.out.println("\"It's really good\"");
        
        // This is a comment

        String x = "water";
        String y = "Kool-aid";
        String temp;

        temp = x;
        x=y;
        y=temp;
        
        System.out.println("x:  "+x);
        System.out.println("y:  "+y);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        scanner.nextLine(); // clears the memory from \n
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);
    
    */

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+ " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+ " cm tall");
    }
}
