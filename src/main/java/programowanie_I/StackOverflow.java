package programowanie_I;

public class StackOverflow {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        a();
    }
}
