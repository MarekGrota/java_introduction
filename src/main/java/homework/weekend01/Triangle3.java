package homework.weekend01;

import java.util.Scanner;

public class Triangle3 {

        public static void main(String[] args) {

            int linesOfStars;
            int n = 0;
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Podaj liczbę całkowitą różną od 0: ");
                linesOfStars = scanner.nextInt();
            } while (linesOfStars == 0);

            while (linesOfStars > 0) {

                for (int i = 0; i < n; i++) {
                    System.out.print(' ');
                }
                for (int j = 0; j < linesOfStars; j++) {
                    System.out.print('*');
                }

                System.out.println();
                linesOfStars--;
                n++;
           }

        }

    }