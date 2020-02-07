package homework.weekend01;

import java.util.Scanner;

public class ChessBoard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n == 0) {
            System.out.println("Podaj liczbę całkowitą będącą rozmiarem szachownicy: ");
            n = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i % 2 == 0) ^ (j % 2 == 0)) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}