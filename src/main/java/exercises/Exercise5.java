package exercises;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scranner = new Scanner(System.in);
        System.out.println("Podaj datę urodzenia: ");
        String birthday = scranner.nextLine();

        LocalDate currentTime = LocalDate.now();
        String format = "yyyy/MM/dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate birthDayParsed = LocalDate.parse(birthday, formatter);

        Period period = Period.between(birthDayParsed, currentTime);
        int yearsBetweenToDates = period.getYears();
        System.out.println("Twój wiek to: " + yearsBetweenToDates);
    }
}
