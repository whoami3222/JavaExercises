public class car  extends Vehicle{
    
    String make = "BMW";
    String model = "F10";
    int year = 2012;
    String color = "black";
    double price =  12000.00;
    int wheels = 4;
    int doors = 4;
    public String toString(){

        return make + "\n"+model+"\n"+color+"\n"+year;
    }

    String name;

    @Override
    void go(){
        System.out.println("The driver is driving the car");
    }
    //car(String name){
     //   this.name = name;
   // }
}
