import java.util.Scanner;

import javax.annotation.processing.FilerException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class app {
   
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
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

/* 
        int x = 3;
        int y = 4;

    
        System.out.println(add(x, y));

    }
    static int add(int x, int y ){
        int z = x + y;
        return z;
*/

//overloaded methods
/*
        double x = add(1.0, 2.0,3.0,4.0);

    }
    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b,int c ){
        System.out.println("This is overloaded method #2");

        return a+b+c;
    }
    static int add(int a, int b,int c, int d){
        System.out.println("This is overloaded method #3");

        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static double add(double a, double b,double c ){
        System.out.println("This is overloaded method #2");

        return a+b+c;
    }
    static double add(double a, double b,double c, double d){
        System.out.println("This is overloaded method #3");

        return a+b+c+d;
         */
        //System.out.printf("This is a format string %d", 123);
/* 
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = -1000;

        //conversion characters
        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        //[width]
        System.out.printf("Hello %10s",myString);

        //[precision]
        System.out.printf("You have this much money %.2f",myDouble);

        //[flags]
        System.out.printf("\nYou have this much money %,f",myDouble);

        */

       // final double PI = 3.14159;
      
        //System.out.println(PI);


        //object
/*
       car myCar1 =  new car();
       car myCar2 =  new car();

       System.out.println(myCar1.model);
       System.out.println(myCar1.make);

       //myCar.drive();
       //myCar.brake();
       System.out.println();
       System.out.println(myCar2.model);
       System.out.println(myCar2.make);
        */

        //constructor
/* 
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Tom",23 , 90);

        System.out.println(human2.age);
        human2.eat();
        human1.drink();
*/

        //DiceRoller diceRoller = new DiceRoller();

        //overloaded constructors

        /*

        Pizza pizza = new Pizza("thicc crust", "tomato");
        
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        */

       // car car = new car();
        //System.out.println(car.toString());
       // System.out.println(car);


        // array of objects

        //int[] numbers = new int[3];
       // char[] characters = new char[4];
        //String[] strings = new String[5];

       // Food[] refrigerator = new Food[3];
/* 
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refrigerator = {food1,food2,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
*/

// object passing
/*
        Garage garage = new Garage();

        car car = new car("BMW");
        car car2 = new car("Tesla");

        garage.park(car);
        garage.park(car2);
        */

        //static = modifier
       // Friend friend1 = new Friend("Spongebob");  
       // Friend friend2 = new Friend("Patrick");   
       // Friend friend3 = new Friend("Squidward"); 
//Friend friend4 = new Friend("Sandy");

       // Friend.displayFriends();  

        
       // Math.round(a);

       //inheritance
/* 
       car car = new car();

       car.go();

       Bicycle bike = new Bicycle();

       bike.stop();

       System.out.println(car.speed);
       System.out.println(bike.speed);

       System.out.println(car.doors);
       System.out.println(bike.pedals);
*/

    //method overriding
        /*Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();
        */

        //super 

        /*Hero hero1 = new Hero("Batman",42,"$$$");
        Hero hero2 = new Hero("Superman",33,"everything");



        System.out.println(hero2.toString());
        System.out.println(hero1.toString());
*/
        //Vehicle vehicle = new Vehicle();
        /*car car = new  car("BMW","f30",2008);
        
        System.out.println(car.getMake());

        car.go();

        car.setYear(2022);

        System.out.println(car.getYear());
*/
        //copy objects
        /*car car1 = new car("BMW", "f30", 2012);
        //car car2 = new car("Mercedes", "C300", 2015);
        
       // car2.copy(car1);

       car car2 = new car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
*/

        //interface = a template than can be applied to a class
        /*Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk  hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
        */

        //polymorphism

        // Car1 car = new Car1();
        // Bicycle bicycle = new Bicycle();
        // Boat boat = new Boat();

        // Vehicle[] racers = {car,bicycle,boat};

        // for(Vehicle x: racers){
        //     x.go();

        // }
        
        // Scanner scanner = new Scanner(System.in);
        // Animal animal;

        // System.out.println("What animal do you want?:");
        // System.out.print("(1=Dog) or (2=Cat):");
        // int choice = scanner.nextInt();

        // if(choice==1){
        //     animal = new Dog();
        //     animal.speak();
        // }else if(choice==2){
        //     animal = new Cat();
        //     animal.speak();
        // }else{
        //     animal= new Animal();
        //     System.out.println("That choice was invalid");
        //     animal.speak();
        // }
    //     Scanner scanner = new Scanner(System.in);
    //     try {
            

    //         System.out.println("Enter a whole number to divide: ");
    //         int x = scanner.nextInt();

    //         System.out.println("Enter a whole number to divide by: ");
    //         int y = scanner.nextInt();

    //         int z = x/y;
    //         System.out.println("Result: "+z);
    // }

    // catch(ArithmeticException e){
    //     System.out.println("You can't divide by 0!!");
    // }
    // catch(InputMismatchException e){
    //     System.out.println("PLEASE ENTER A NUMBER!!");
    // }
    // catch(Exception e){
    //     System.out.println("Something went wrong!");
    // }
    // finally{
    //     System.out.println("This will always print");
    //     scanner.close();
    // }
    
// 

        // File file = new File("secret_message.txt");

        // if (file.exists()) {
        //     System.out.println("That file exists :O! ");
        //     System.out.println(file.getPath());
        //     System.out.println(file.getAbsolutePath());
        //     System.out.println(file.isFile());
        // }else{
        //     System.out.println("That file doesn't exist");
        // }


    // try {
    //     FileWriter writer = new FileWriter("poem.txt");
    //     writer.write("Roses are red\nViolets are blue\nMy name is Dude");
    //     writer.append("\n(A poem by Me)");
    //     writer.close();
    // }
    //  catch (IOException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }

    //  READER
    // try {
    //     FileReader reader = new FileReader("art.txt");
    //     int data = reader.read();
    //     while(data != -1) {
    //         System.out.print((char)data);
    //         data = reader.read();

    //     }
    //     reader.close();

        
    // } catch (FileNotFoundException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // } catch (IOException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }
    // Scanner scanner = new Scanner(System.in);

    // File file = new File("Putting On The Ritz - Freedom Trail Studio.wav");
    // AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    // Clip clip = AudioSystem.getClip();
    // clip.open(audioStream);

    
    // String response = "";

    // while (!response.equals("Q")) {
    //     System.out.println("P = play, S = stop, R = reset, Q = quit");
    //     System.out.println("Enter your choice: ");

    //     response = scanner.next();
    //     response = response.toUpperCase();
        
    //     switch (response) {
    //         case ("P"): clip.start();
    //             break;
    //         case ("S"): clip.stop();
    //             break;
    //         case ("R"): clip.setMicrosecondPosition(0);
    //             break;
    //         case ("Q"): clip.close();
    //             break;
    //         default:
    //             System.out.println("Not a valid response");
    //     }
    // }
    // System.out.println("BYEE");

   //JFrame

    // JFrame frame = new JFrame();//creates an instance of a frame
    // frame.setTitle("JFrame"); //sets title of frame
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit ouf of application(normally hides on close)
    // frame.setResizable(false);//prevent frame from being resized
    // frame.setSize(420,420);//sets x dimension and y dimension of our frame
    // frame.setVisible(true); //make frame visible

    // ImageIcon image = new ImageIcon("bmw.jpg"); //create an image icon

    // frame.setIconImage(image.getImage());//change icon of frame
    // frame.getContentPane().setBackground(new Color(255,173,173)); //change color of background
    

    //new MyFrame();

    //JLabel
    
    // ImageIcon image = new ImageIcon("bmw.jpg");
    // Border border = BorderFactory.createLineBorder(Color.green,3);
    
    // JLabel jLabel = new JLabel(); // create a label
    // jLabel.setText("Bro do you even code?");//set text of label
    // jLabel.setIcon(image);
    // jLabel.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER or RIGHT of imageicon
    // jLabel.setVerticalTextPosition(JLabel.TOP);
    // jLabel.setForeground(new Color(250));
    // jLabel.setFont(new Font("MV Boli",Font.PLAIN,20));
    // jLabel.setIconTextGap(0);
    // jLabel.setBackground(Color.green);
    // jLabel.setOpaque(true);
    // jLabel.setBorder(border);
    // jLabel.setVerticalAlignment(JLabel.CENTER);
    // jLabel.setHorizontalAlignment(JLabel.CENTER);
    // //jLabel.setBounds(100,0,900,600);

    // JFrame frame = new JFrame();//creates an instance of a frame
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit ouf of application(normally hides on close)
    // //frame.setSize(1100,600);//sets x dimension and y dimension of our frame
    // frame.setVisible(true); //make frame visible
    // frame.add(jLabel);
    // //frame.setLayout(null);
    // frame.pack();


    //JPanel

    // ImageIcon icon = new ImageIcon("bmw.jpg");

    // JLabel label = new JLabel();
    // label.setText("Hi");
    // label.setIcon(icon);
    

    // JPanel redPanel = new JPanel();
    // redPanel.setBackground(Color.red);
    // redPanel.setBounds(0,0,250,250);

    // JPanel bluePanel = new JPanel();
    // bluePanel.setBackground(Color.blue);
    // bluePanel.setBounds(250,0,250,250);

    // JPanel greenPanel = new JPanel();
    // greenPanel.setBackground(Color.green);
    // greenPanel.setBounds(0,250,500,250);

    // JFrame frame = new JFrame();//creates an instance of a frame
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit ouf of application(normally hides on close)
    // frame.setSize(1100,600);//sets x dimension and y dimension of our frame
    // frame.setVisible(true); //make frame visible
    // frame.setLayout(null);
    // greenPanel.add(label);
    // frame.add(redPanel);
    // frame.add(bluePanel);
    // frame.add(greenPanel);
    //frame.pack();


    //JButton

    //new MiFrame();
    


    //BorderLayout
    

    // Integer[] intArray = {1,2,3,4,5};
    // Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
    // Character[] charArray = {'H','E','L','L','O'};
    // String[] stringArray = {"B","Y","E"};

    // displayArray(intArray);
    // displayArray(stringArray);
    // displayArray(charArray);
    // displayArray(doubleArray);

//     System.out.println(getFirst(intArray));
//     System.out.println(getFirst(doubleArray));
//     System.out.println(getFirst(charArray));
//     System.out.println(getFirst(stringArray));
    

// }
// public static <Thing> void displayArray(Thing[] array) {
    

//     for(Thing x: array){
//         System.out.println(x+" ");
//     }
//     System.out.println();
// }

// public static <T> T getFirst(T[] array){
//     return array[0];
// }

// public static void displayArray(Double[] array) {
    

//     for(Double x: array){
//         System.out.println(x+" ");
//     }
//     System.out.println();
// }

// public static void displayArray(Character[] array) {
    

//     for(Character x: array){
//         System.out.println(x+" ");
//     }
//     System.out.println();
// }

// public static void displayArray(String[] array) {
    

//     for(String x: array){
//         System.out.println(x+" ");
//     }
//     System.out.println();
// }

//     Player player = new Player();
//     Enemy enemy = new Enemy();
//     Item item = new Item();
//     Tree tree = new Tree();


//     draw(player);
//     draw(enemy);
//     draw(item);
//     draw(tree);


// }

// public static <T> void draw(T x){
//     x.draw();

    MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1,9);
    MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14,1.01);
    MyGenericClass <Character, Character> myCharacter = new MyGenericClass<>('@','$');
    MyGenericClass <String, Character> myString = new MyGenericClass<>("Hello",'!');

    ArrayList<String> myFriends = new ArrayList<>();

    System.out.println(myInt.getValue());
    System.out.println(myDouble.getValue());
    System.out.println(myCharacter.getValue());
    System.out.println(myString.getValue());
}
}
