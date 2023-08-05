package activities;

public class Activity7 extends BiCycle{
    @Override
    public int applyBrake(int decrement) {
        System.out.println("From Parent Class");
        return super.applyBrake(decrement);
    }

    @Override
    public int speedUp(int increment) {
        System.out.println("From Parent Class");
        return super.speedUp(increment);
    }
}

interface BiCycleParts{
    public static int gears = 4;
    public static int speed = 75;
}

interface BiCycleOperations extends BiCycleParts{
    public int applyBrake(int decrement);
    public int speedUp(int increment);

}

class BiCycle implements BiCycleOperations,BiCycleParts{
    static int speed;

    @Override
    public int applyBrake(int decrement) {
        return speed-=decrement;
    }

    @Override
    public int speedUp(int increment) {
       return speed+=increment;
    }


    public static void main(String[] args) {
        BiCycle obj = new BiCycle();
        speed = BiCycleParts.speed;
        Activity7 obj1 = new Activity7();
        System.out.println(obj1.applyBrake(20));
        System.out.println(obj1.speedUp(10));

    }
}