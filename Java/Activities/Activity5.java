package activities;

public class Activity5 {
    public static void main(String[] args) {
        MyBook myBookObj = new MyBook();
        myBookObj.setTitle("And then there were none");
        String book = myBookObj.getTitle();
        System.out.println(book);
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    abstract String getTitle();
}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        title = s;
    }
    @Override
    String getTitle() {
        return title;
    }
}