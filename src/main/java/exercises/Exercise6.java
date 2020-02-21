//package exercises;
//
//public class Exercise6 {
//    public static void main(String[] args) {
//
//        User [] users = new User [] {
//                new User("Kazik","Górny", 22 ),
//                new User("Stasia", "Dolna", 28),
//                new User("Janeczek", "Kowalczewski", 5),
//                new User("Mietek", "Nowak", 65),
//        };
//        int maxLenght = 0;
//        int maxIndex = 0;
//        for (int i = 0; i<=3; i++) {
//            System.out.println("Element " + i + " :" + users[i].getName() + " " + users[i].getLastname() + ", " + users[i].age);
//        }
//        for (int j = 0; j<=3; j++) {
//
//            int nameLenght = users[j].getName().length();
//            int lastnameLenght = users[j].getLastname().length();
//            int sum = nameLenght + lastnameLenght;
//
//            if (sum > maxLenght) {
//                maxLenght = sum;
//                maxIndex = j;
//            }
//
//        }
//        System.out.println("User z najdłuższą ilością znaków w imieniu i nazwisku to: " + users[maxIndex].getName() + " " + users[maxIndex].getLastname() +  " z ilością " + maxLenght + " znaków.");
//
//    }
//}
package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        UserExtended [] users = new UserExtended[100];
        int usersCount = 0;

        String line = null;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj dane użytkownika [name lastname dayofbirth]");
            line = scanner.nextLine();
            if (!line.startsWith("exit")) {
                UserExtended newUser = parseUser(line);
                users[usersCount] = newUser;
                usersCount++;
            }
        } while (!line.startsWith("exit"));

        for (int i = 0; i < usersCount; i++) {
            System.out.println(users[i]);
        }
    }

    private static UserExtended parseUser(String line) {
        // "Adam Kowalski 1968/05/13"
        String [] splittedData = line.split(" ");
        String name = splittedData[0];
        String lastname = splittedData[1];
        LocalDate dayOfBirth = parseDate(splittedData[2]);
        return new UserExtended(name, lastname, dayOfBirth);
    }

    private static LocalDate parseDate(String dateText) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return LocalDate.parse(dateText, formatter);
    }

}