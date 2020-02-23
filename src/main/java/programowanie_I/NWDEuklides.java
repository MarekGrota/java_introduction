package programowanie_I;

public class NWDEuklides {
public static void main(String... args) {

    euklidesOdejmowanie(378, 214);
}
    private static void euklidesOdejmowanie(int a, int b){
            int baseA = a;
            int baseB = b;
            int count = 0;

            System.out.println("*********  NWD Euklides  *******");
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
                count++;
            }
        System.out.println("NWD dla liczb " + baseA + " i " + baseB + " to " + a);
        System.out.println("Ilość przebiegów algorytmu: " + count);
        }
    }
