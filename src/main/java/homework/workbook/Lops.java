package homework.workbook;

public class Lops {
    public static void main(String[] args) {

        //Korzystając z pęli wypisz liczby od -20 do 20.
        System.out.println("Liczby z zakresu od - 20 do 20:");
        for (int i = -20; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("6 pierwszych liczb z powyższego zbioru:");

        //Następnie wypisz 6 pierwszych liczb

        for (int i = -20; i < -14; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("6 ostatnich liczb z zakresu od -20 do 20:");

        for (int i = 15; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Liczby parzyste z zakresu <-20,20>");
        for (int i = -20; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Liczby z zakresu <-20, 20> po za liczbą 5.");

        for (int i = -20; i <= 20; i++) {
            if (i != 5) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Wszystkie liczby z zakresu <-20, 7>.");
        for (int i = -20; i <= 7; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
        System.out.println("Liczby podzielne przez 3 z zakresu <-20, 20>");
        for (int i = -20; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        int sum = 0;
        for (int i = -20; i <= 20; i++) {
            sum += i;
        }
        System.out.print("Suma wszystkich liczb to: " + sum);
        System.out.println("\n");
        System.out.println("Suma liczb większych lub równych 4 to: ");
        int sum2 = 0;
        for (int i = -20; i <= 20; i++) {
            if (i >= 4) {
                sum2 += i;
            }
        }
        System.out.print(sum2 + " ");

        System.out.println("\n");
        System.out.println("Potęga druga dla zbioru liczb <-20, 20>.");

        for (int i = -20; i <= 20; i++) {
            System.out.println(" i= " + i + ", " + i + "^2= " + i*i);
        }
        System.out.println("\n");
        System.out.println("Modulo 10 dla liczb z zakresu <-20, 20>");
        float modulo = 0F;
        for (float i = -20; i <= 20; i++) {
            modulo = i / 10;
                System.out.println(i + " % 10 = " + modulo);
        }
        System.out.println("\n");
    }
}
