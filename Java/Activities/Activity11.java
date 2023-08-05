package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer,String> colours=new HashMap<Integer,String>();
        colours.put(1,"Red");
        colours.put(2,"Blue");
        colours.put(3,"Lavender");
        colours.put(4,"Purple");
        colours.put(5,"Black");
        colours.remove(2);
        System.out.println("Green exists? "+ colours.containsValue("Green"));
        System.out.println(colours.size());
    }
}
