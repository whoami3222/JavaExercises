public class car  extends Vehicle{
    
    private String make;
    private String model;
    private int year;
    String color = "black";
    double price =  12000.00;
    int wheels = 4;
    int doors = 4;
    //public String toString(){

     //   return make + "\n"+model+"\n"+color+"\n"+year;
   // }

    String name;

    // @Override
    // void go(){
    //     System.out.println("The driver is driving the car");
    // }


    car(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
      
   }
   car(car x){
        this.copy(x);
   }

   public String getMake(){
        return make;

   }

   public String getModel(){
        return model;
   }

   public int getYear(){
        return year;
   }

   public void setMake(String make){
        this.make = make;
   }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }
}
