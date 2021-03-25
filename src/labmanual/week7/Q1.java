/*
1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
and volume of square ,circle ,cube and sphere.
 */
package labmanual.week7;

import java.util.Scanner;

abstract class Shape {
    abstract Double getArea(Double x);
    abstract Double getVolume(Double x);
}

class Square extends Shape {

    @Override
    Double getArea(Double x) {
        return x * x;
    }

    @Override
    Double getVolume(Double x) {
        return 0.0;
    }
}

class Circle extends Shape {
    @Override
    Double getArea(Double x) {
        return Math.PI * x * x;
    }

    @Override
    Double getVolume(Double x) {
        return 0.0;
    }
}

class Cube extends Shape {
    @Override
    Double getArea(Double x) {
        return 6 * x * 2;
    }

    @Override
    Double getVolume(Double x) {
        return x * x * x;
    }
}

class Sphere extends Shape {
    @Override
    Double getArea(Double x) {
        return 4 * Math.PI * x * x;
    }

    @Override
    Double getVolume(Double x) {
        return 4/3 * Math.PI * x * x * x;
    }
}

public class Q1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        Double radius;
        Double side;
        while (true) {
            System.out.println("1.Area of the square and Volume of the square\n2.Area of the circle and Volume of the circle\n3.Area of the cube and Volume of the cube\n4.Area of the sphere Volume of the sphere\n5.exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the side length of the square: ");
                    side = sc.nextDouble();
                    System.out.println("The area of the square is: " + new Square().getArea(side));
                    System.out.println("The volume of the square is: " + new Square().getVolume(side));
                    break;
                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    radius = sc.nextDouble();
                    System.out.println("The area of the circle is: " + new Circle().getArea(radius));
                    System.out.println("The volume of the cirlce is: " + new Circle().getVolume(radius));
                    break;
                case 3:
                    System.out.print("Enter the radius of the sphere: ");
                    radius = sc.nextDouble();
                    System.out.println("The surface area of the sphere is: " + new Sphere().getArea(radius));
                    System.out.println("The volume of the sphere is: " + new Sphere().getVolume(radius));
                    break;
                case 4:
                    System.out.print("Enter the side length of the cude: ");
                    side = sc.nextDouble();
                    System.out.println("The surface area of the cube is: " + new Cube().getArea(side));
                    System.out.println("The volume of the cubde is: " + new Cube().getVolume(side));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please select correct option");
            }
        }
    }
}
