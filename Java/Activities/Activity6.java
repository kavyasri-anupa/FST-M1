package activities;

import java.time.Month;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Activity6 {

    public static void main(String[] args) {
        List<String> Passengers = new ArrayList<>() ;
        Passengers.add("Passenger1");
        Passengers.add("Passenger2");
        Passengers.add("Passenger3");
        Passengers.add("Passenger4");
        Passengers.add("Passenger5");
        Plane plane1 = new Plane();
        int takeOffYear = 2023;
        Month month = Month.of(3);
        int day = 22;
        plane1.setLastTimeTookOf(LocalDate.of(takeOffYear,month,day));
        plane1.setLastTimeLanded(LocalDate.now());
        plane1.setMaxPassengers(Passengers.size());
        plane1.setPassengers(Passengers);
        System.out.println(plane1.getLastTimeLanded());
        System.out.println(plane1.getLastTimeTookOf());
        System.out.println(plane1.getMaxPassengers());
        System.out.println(plane1.getPassengers());
    }

}

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private LocalDate lastTimeTookOf;
    private LocalDate lastTimeLanded;

    public void setLastTimeLanded(LocalDate lastTimeLanded) {
        this.lastTimeLanded = lastTimeLanded;
    }

    public void setLastTimeTookOf(LocalDate lastTimeTookOf) {
        this.lastTimeTookOf = lastTimeTookOf;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setPassengers(List<String> passengers) {
        this.passengers = passengers;
    }

    public LocalDate getLastTimeLanded() {
        return lastTimeLanded;
    }

    public LocalDate getLastTimeTookOf() {
        return lastTimeTookOf;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
