package activities;

public class Activity12{

    public static void main(String[] args) {
//        int num1 = 3;
//        int num2 = 5;
        Addable a1 = (num1, num2) -> num1+num2;
        System.out.println(a1.add(5,6));
        Addable a2 = (num1, num2) ->{
            return num1+num2;
        };

        System.out.println(a2.add(10,11));

    }


}

interface Addable{
    public int add(int num1, int num2);

}