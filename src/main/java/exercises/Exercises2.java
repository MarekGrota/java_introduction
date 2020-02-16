package exercises;

public class Exercises2 {

    public static void main(String[] args) {

        User[] users = new User[]{
                new User("Kazik", "Górny", 22),
                new User("Stasia", "Dolna", 28),
                new User("Janeczek", "Kowalczewski", 5),
                new User("Mietek", "Nowak", 65),
        };
        double ageSum = 0;
        double average = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Element " + i + " :" + users[i].getName() + " " + users[i].getLastname() + ", " + users[i].age);
        }
        for (int j = 0; j <= 3; j++) {
            ageSum += users[j].age;
            average = ageSum / j;
        }
        System.out.println();
        System.out.println("Sredni wiek użytkowników to: " + average);
    }
}
