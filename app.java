import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.ArrayList;
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
/* 
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
*/
/*     Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= columns; j++){

                System.out.print(symbol);
            }
        }
*/    
        // array = used to store multiple values  in a single variable
        //String[] cars = {"Camaro","BMW","Mercedes","Audi"};

        //cars[0] = "Mustang";

       // System.out.println(cars[1]);
/* 
       String[] cars = new String[3];

       cars[0] = "Camaro";
       cars[1] = "Corvette";
       cars[2] = "Tesla";

       //System.out.println(cars[2]);

       for(int i=0;i<cars.length;i++){
        System.out.println(cars[i]);
       }

*/

       //2d array an array of array


/* 
       String[][] cars = new String[3][3];

       cars[0][0] = "Camaro";
       cars[0][1] = "Corvette";
       cars[0][2] = "Silverado";
       cars[1][0] = "Mustang";
       cars[1][1] = "BMW";
       cars[1][2] = "Ranger";
       cars[2][0] = "Mercedes";
       cars[2][1] = "Ferrari";
       cars[2][2] = "Audi";

       for(int i=0; i<cars.length;i++){
        System.out.println();
        for(int j = 0; j<cars[i].length;j++){
            System.out.print(cars[i][j]+" ");
        }
       }

*/

       //String name = "David";

       //boolean result = name.equalsIgnoreCase("david");
       //int result = name.length();
       //char result = name.charAt(0);
       //int result = name.indexOf("D");
       //boolean result = name.isEmpty();
       //String result = name.toUpperCase();
       //String result = name.toLowerCase();
       //String result = name.trim();
       //String result = name.replace('d', 'g');
       

       //System.out.println(result);


       //wrapper class


       //primitive //wrapper
       //boolean   Boolean
       //char      Character
       //int        Integer
       //double     Double
/* 
       Boolean a = true;
       Character b = '@';
       Integer c = 123;
       Double d = 3.14;
       String e = "Bro";

       if(b=='@'){
        System.out.println("This is true");
       }
       */


       //arraylist
/* 
       ArrayList<String> food = new ArrayList<String>();

       food.add("pizza");
       food.add("hamburger");
       food.add("hotdog");

       food.set(0, "sushi");
       food.remove(2);
       food.clear();


       for(int i = 0; i<food.size();i++){
        System.out.println(food.get(i));
       }
       System.out.println(food);

       */
      //2d arraylist

       

/* 
       ArrayList<String> bakeryList = new ArrayList<>();
       bakeryList.add("pasta");
       bakeryList.add("garlic bread");
       bakeryList.add("donuts");

       ArrayList<String> produceList = new ArrayList<>();
       produceList.add("tomatoes");
       produceList.add("zucchini");
       produceList.add("peppers");

       ArrayList<String> drinksList = new ArrayList<>();
       drinksList.add("soda");
       drinksList.add("coffee");
       

       ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
       groceryList.add(bakeryList);
       groceryList.add(produceList);
       groceryList.add(drinksList);
       
       System.out.println(groceryList.get(0).get(0));
*/

       //for-each

      // String[] animals = {"cat","dog","rat","bird"};
/* *
       ArrayList<String> animals = new ArrayList<String>();

       animals.add("cat");
       animals.add("dog");
       animals.add("rat");
       animals.add("bird");

       for(String i : animals){
            System.out.println(i);
       }
       */

      // String name = "David";
      // int age = 21;
       //hello(name,age);

   // }


       //method
   // static void hello(String name, int age){
        //System.out.println("Hello "+name+ " you are "+age+" years old");


        int x = 3;
        int y = 4;

    
        System.out.println(add(x, y));

    }
    static int add(int x, int y ){
        int z = x + y;
        return z;

    }
}
