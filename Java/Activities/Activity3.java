package activities;

public class Activity3 {
    static double planet_secs = 31557600;

    public static void main(String[] args) {
        calculateAge("Earth",1000000000);

    }
    public static void calculateAge(String Planet, int seconds){
        switch (Planet){
//            double palnet_secs = 31557600;
            case "Earth":
                planet_secs = 31557600;
                break;
            case "Mercury":
                planet_secs = 0.2408467*31557600;
                break;
            case "Venus":
                planet_secs = 0.61519726*31557600;
                break;
            case "Mars":
                planet_secs = 1.8808158*31557600;
                break;
            case "Jupiter":
                planet_secs = 11.862615*31557600;
                break;
            case "Saturn":
                planet_secs = 29.447498*31557600;
                break;
            case "Uranus":
                planet_secs = 84.016846*31557600;
                break;
            case "Neptune":
                planet_secs = 164.79132*31557600;
                break;

        }
        double age = seconds/planet_secs;
        System.out.printf("You are %.2f "+Planet+"-years old", age);

    }
}
