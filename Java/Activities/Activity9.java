package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Name1");
        myList.add("Name2");
        myList.add("Name3");
        myList.add("Name4");
        myList.add("Name5");

        for (String name: myList ) {
            System.out.println(name);
        }
        System.out.println("3rd Name:"+myList.get(2));
        System.out.println("Name2 exists? "+myList.contains("Name2"));
        System.out.println("Total names : "+myList.size());
        myList.remove("Name4");
        System.out.println("After removing 1 name: "+myList.size());
    }
}
