import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class app {
   
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
/* 
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+ " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+ " cm tall");
        */

        //double x = 3.14;
        //double y = 10;

        //double z = Math.max(x,y);
        //double c = Math.abs(y);
        //double c = Math.sqrt(y);
        //double c = Math.round(x);
        //double c = Math.floor(x);
        //double c = Math.ceil(x);

        //System.out.println(z);
        //System.out.println(c);


       /*  double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z= Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+z);
        scanner.close();
*/

/* 
        Random random = new Random();
        
        //int x = random.nextInt(6)+1;
        double y = random.nextDouble(6)+1;
        boolean z = random.nextBoolean();
        System.out.println(z);
        */
/* 
        int age = 12;

        if(age>=75){
            System.out.println("Boomer!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age>=13){

            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are not an adult!");
        }
         */
/* 
         String day = "pizza";

         switch(day){
            case "Sunday": System.out.println("It is Sunday");
            break;
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            default: System.out.println(day+" is not a day");
            
         }
         */
        /* 
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("Enter your name:  ");
            name = scanner.nextLine();
        }while(name.isBlank());

        scanner.close();
        System.out.println("Hello "+name);
        */

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}
