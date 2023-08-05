package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car carobj = new Car(4,4);
        carobj.make = 2014;
        carobj.color = "Black";
        carobj.transmission = "manual";
        carobj.displayCharactersticis();
        carobj.accelerate();
        carobj.brake();
    }
}

class Car{
    String color;
    String transmission;
    int make ;
    int tyres;
    int doors;
    Car(int doors, int tyres){
        this.doors = doors;
        this.tyres = tyres;
    }
    public void displayCharactersticis(){
        System.out.println("Doors: "+ doors);
        System.out.println("Tyres:"+ tyres);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}
