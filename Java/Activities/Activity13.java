package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        ArrayList list = new ArrayList<>();
        Random indexGen = new Random();
        for (int i = 0; i<=5; i++){
            input = scan.nextInt();
            list.add(input);
        }
        int index= indexGen.ints(0,5).findFirst().getAsInt();
        System.out.println(list.get(index));
    }
}


