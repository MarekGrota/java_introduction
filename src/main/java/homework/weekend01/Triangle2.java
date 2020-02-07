package homework.weekend01;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (n == 0) {
            System.out.println("Podaj liczbę całkowitą różną od 0: ");
            n = scanner.nextInt();
       }

       triangle (n);

        }

        public static void lines (int n, char ch) {
            for (int i=0; i<n; i++) {
                System.out.print(ch);
            }
        }
        public static void triangle (int n) {
            for (int i=0; i<n; i++) {

                lines(i,' ');
                lines(n-i,'*');
                System.out.println();
            }
        }
}