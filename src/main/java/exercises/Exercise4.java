package exercises;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User[] users = new User[4];
                for (int i = 0; i < users.length; i++) {
                    System.out.println("Podaj dane " + (i+1) + " użytkownika oddzielone spacją [imię, nazwisko, wiek]: ");
                    String userText = scanner.nextLine();

                    String [] userData = userText.split(" ");
                    int age = Integer.valueOf(userData[2]);
                    User newUser = new User(userData[0], userData[1], age);
                    users[i] = newUser;
                }
        System.out.println(" Podałeś następujących użytkowników: ");
                for (int i = 0; i < users.length; i++) {
                    System.out.println(users[i].getName() + " " + users[i].getLastname() + " " +  users[i].getAge());
                }



    }
}
