// Write your code here

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestWedding{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month of wedding ");
        int monthOfWedding = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter day of wedding ");
        int dayOfWedding = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter year of wedding ");
        int yearOfWedding = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter first name of bride >> ");
        String brideFirstName = scanner.nextLine();

        System.out.print("Enter last name of bride >> ");
        String brideLastName = scanner.nextLine();

        System.out.print("Enter first name of groom >> ");
        String groomFirstName = scanner.nextLine();

        System.out.print("Enter last name of groom >> ");
        String groomLastName = scanner.nextLine();

        System.out.print("Enter location of wedding >> ");
        String weddingLocation = scanner.nextLine();
        scanner.close();


        Person bride = new Person(brideFirstName, brideLastName);
        Person groom = new Person(groomFirstName, groomLastName);

        Couple couple = new Couple(bride, groom);

        LocalDate weddingDate = LocalDate.of(yearOfWedding, monthOfWedding, dayOfWedding);

        Wedding wedding = new Wedding(couple, weddingDate, weddingLocation);

        System.out.println(bride.getLastName() + "/" + groom.getLastName() + " " + "Wedding");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String strWeddingDate = formatter.format(wedding.getWeddingDate());


        System.out.println("Date: " + strWeddingDate+ "   Location: " + wedding.getLocation());
        System.out.println("Bride: " + bride.getFirstName() + " " + bride.getLastName());
        System.out.println("Groom: " + groom.getFirstName() + " " + groom.getLastName());

    }
}