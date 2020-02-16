package homework.workbook;

public class
Dice {
    public static void main(String[] args) {
        int result = (int) (Math.random() * 6 + 1);
        System.out.println(result);
        switch (result) {
            case 1:
            case 3:
            case 5:
                System.out.println("Wyrzucono nieparzystą liczbę oczek!");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("Wyrzucono parzystą liczbę oczek!");
                break;
        }
        if (result ==6 ) {

            System.out.println(" *****    Wygrałeś!   *****");
        }
    }
}
