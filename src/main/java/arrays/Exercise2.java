package arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Ala",
                "Ola",
                "Andrzej",
                "Brunhilda",
                "Genowefa",
                "Bożydar",
                "Gniewomir",
                "Sławomir",
                "Mścisław",
                "Stanisław",
                "Bronisław",
                "Wiercisław",
                "Wendzisław",
                "Petronela",
                "Kunegunda"
        };
        /*
        Zad 1: wypisz imiona żeńskie
        Zad 2: wypisz imiona żeńskie nie dłużesze niż 3 znaki
        Zad 3: wypisz imiona słowiańskie (kończące się na "sław" lub "mir"
        Zad 4: znajdź najdłuższe imię
         */
        System.out.println("Imiona żeńskie to: ");
        for (String name : names) {
            if (name.endsWith("a")) {
                System.out.println(name);
            }

        }
        System.out.println();
        System.out.println("Imiona żeńskie 3 znakowe to: ");
        for (String name : names) {
            if (name.endsWith("a") && name.length() == 3) {

                System.out.println(name);

            }

        }
        System.out.println();
        System.out.println("Imiona słowiańskie kończące się na sław lub mir to: ");

        for (String name : names) {
            if (name.endsWith("sław") || name.endsWith("mir")) {
                System.out.println(name);
            }
        }
        System.out.println();
        System.out.println("Najdłuższe imię to: ");
        int max = 0;
        for (String name : names) {
            if (max < name.length()) {
                max = name.length();
            }
        }
        for (String name : names) {
            if (max == name.length()) {
                System.out.println(name);
            }
        }
        System.out.println(
        );
        System.out.println("###############################");

        for (int i = 0; i < names.length; i++) {
            if (names[i].endsWith("a")) {
                continue;
            }
            System.out.println(names[i]);
        }
        System.out.println();
        System.out.println("#########################################");
        for (String name: names) {
            if (name.endsWith("mir")) {
                break;
            }
            System.out.println(name);
        }
    }
}
