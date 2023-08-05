package activities;

public class Activity8 {
    public static void main(String[] args) {
        CustomException obj = new CustomException("This is custom exception");
        System.out.println(obj.getMessage());
    }
}

class CustomException extends Exception{
    private String message;
    CustomException(String msg){
        this.message = msg;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
