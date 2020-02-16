package exercises;

import java.util.Arrays;

public class Exercises1 {
    public static void main(String[] args) {

        User [] users = new User [] {
                new User("Kazik","Górny", 22 ),
                new User("Stasia", "Dolna", 28),
                new User("Janeczek", "Kowalczewski", 5),
                new User("Mietek", "Nowak", 65),
        };
        int maxLenght = 0;
        int maxIndex = 0;
        for (int i = 0; i<=3; i++) {
            System.out.println("Element " + i + " :" + users[i].getName() + " " + users[i].getLastname() + ", " + users[i].age);
        }
        for (int j = 0; j<=3; j++) {

            int nameLenght = users[j].getName().length();
            int lastnameLenght = users[j].getLastname().length();
            int sum = nameLenght + lastnameLenght;

            if (sum > maxLenght) {
                maxLenght = sum;
                maxIndex = j;
            }

        }
        System.out.println("User z najdłuższą ilością znaków w imieniu i nazwisku to: " + users[maxIndex].getName() + " " + users[maxIndex].getLastname() +  " z ilością " + maxLenght + " znaków.");

        }
    }
