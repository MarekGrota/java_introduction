package exercises;

public class Exercise3 {
    public static void main(String[] args) {

        User[] users = new User[]{
                new User("Kazik", "Górny", 22),
                new User("Stasia", "Stankiewicz", 28),
                new User("Kasia", "Kowalczewski", 5),
                new User("Mietek", "Nowak", 65),
        };

        for (int i = 0; i < users.length; i++) {
            System.out.println("Element " + i + " :" + users[i].getName() + " " + users[i].getLastname() + ", " + users[i].age);
        }
        System.out.println();
        System.out.println("Użytkownicy, któych imię i nazwisko zaczyna się na tę samą literę to:");
        for (int j = 0; j < users.length; j++) {
            if (users[j].getName().charAt(0) == users[j].getLastname().charAt(0)) {
                System.out.println(users[j].getName() + " " + users[j].getLastname());
            }

        }
    }
}

