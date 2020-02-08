package inheritance.figure;

public class Triangle implements Figure {

    private double h;
    private double a;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double area() {
        return (a * h)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "h=" + h +
                ", a=" + a +
                '}';
    }
}
