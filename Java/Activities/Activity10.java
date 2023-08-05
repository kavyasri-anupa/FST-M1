package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Obj1");
        hs.add("Obj2");
        hs.add("Obj3");
        hs.add("Obj4");
        hs.add("Obj5");
        hs.add("Obj6");
        System.out.println("Size of hash set: "+hs.size());
        hs.remove("Obj3");
        hs.remove("Obj7");
        System.out.println("Contains Obj4? "+ hs.contains("Obj4"));
        System.out.println(hs.toString());
    }
}
