package homework.workbook;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println("Aktualna godzina: " + LocalTime.now());
        System.out.println("Dziś jest " + LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfMonth() + " dzień tygodnia.");
        System.out.print(LocalDate.now().getMonthValue() + " miesiąc roku ");
        System.out.print(", czyli " + LocalDate.now().getMonth() + ".");
        System.out.println();

        if (LocalTime.now().getHour() <= 6) {
            System.out.println("Jest poranek.");
        } else {
            if (LocalTime.now().getHour() < 12 && LocalTime.now().getHour() > 6) {
                System.out.println("Jest przedpołudnie.");
            } else {
                if (LocalTime.now().getHour() > 12 && LocalTime.now().getHour() < 18) {
                    System.out.println(" Jest popołudnie.");
                } else {
                    if (LocalTime.now().getHour() > 18 && LocalTime.now().getHour() < 22) {
                        System.out.println("Jest wieczór.");
                    } else {
                        System.out.println("Jest noc.");
                    }
                }
            }
        }

        switch (LocalDate.now().getDayOfWeek()) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("\nDziś jest dzień wolny od pracy!");
                break;
            default:
                System.out.println("\nDziś jest dzień pracujący.");
        }
        System.out.println("Aktualna pora roku: ");
        switch (LocalDate.now().getMonth()) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.print("\t ZIMA!");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.print("\t WIOSNA!");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.print("\t LATO!");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.print("\t JESIEN");
        }
        if (LocalDate.now().getDayOfMonth() <= 10) {
            System.out.println("\nNiedługo wypłata!");
        } else {
            System.out.println("\n Niestety już po wypłacie...");
        }
    }

}
