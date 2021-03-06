package classes.basics.exercises;

import classes.basics.User;

public class Test {

    public static void main(String[] args) {

        Point point1 = new Point(3.0D, 1.0D);
        Point point2 = new Point(4.0D, 7.0D);

        User user = new User("Janek", "Kowalski", 23);
        user.name = "Andrzej";
        user.introduce();

        double distance = Point.distance(point1,point2);
        System.out.println("Odległość między punktami wynosi: " + distance);

        distance = point1.distanceTo(point2);
        System.out.println(distance);

        distance = point2.distanceTo(point1);
        System.out.println(distance);

        PointCollection pointCollection = new PointCollection();
        pointCollection.addPoints(point1);
        pointCollection.addPoints(point2, point1);
        pointCollection.addPoints(new Point[] {point1,point2});
        pointCollection.addPoints(new Point(5.0D, 7.0D));
        pointCollection.printAllPoints();
        pointCollection.printStats();
    }

}
