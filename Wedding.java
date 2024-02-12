// Write your code here

import java.time.LocalDate;

public class Wedding{
    LocalDate weddingDate;
    Couple couple;
    String location;

    public Wedding(){}
    public Wedding(Couple couple, LocalDate weddingDate, String location){
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    public LocalDate getWeddingDate() {return weddingDate;}
    public Couple getCouple() {return couple;}
    public String getLocation() {return location;}
}