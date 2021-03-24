/*
1. Write a java program to find Area and Perimeter of different shapes using polymorphism concept.
 */
package labmanual.week6;

import java.util.Scanner;

public class Q1 {
    // area of the circle
    public Double getArea(Double radius) {
        return Math.PI * radius * radius;
    }

    // area of the triangle
    public Double getArea(float base, float height) {
        return 0.5 * base * height;
    }

    // area of the rectangle
    public Double getArea(Double length, Double breadth) {
        return length * breadth;
    }

    // area of the square
    public float getArea(float side) {
        return side * side;
    }

    // perimeter of the circle
    public Double getPerimeter(Double radius) {
        return Math.PI * radius * radius;
    }

    // perimeter of the triangle
    public Double getPerimeter(Double a, Double b, Double c) {
        return a + b + c;
    }

    // perimeter of the rectangle
    public Double getPerimeter(Double length, Double breadth) {
        return 2 * (length + breadth);
    }

    //perimeter of the square
    public float getPerimeter(float side) {
        return 4 * side;
    }
}

class Q1Demo {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int option;
        Double radius;
        float height;
        float breadth;
        Double a, b, c, l;
        float side;
        while (true) {
            System.out.print("0.exit\n1. Area of the circle\n2. Perimeter of the circle\n3. Area of the triangle\n4. Perimter of the triangle\n5. Area of the rectangle\n6. Perimeter of the rectangle\n7. Area of the square\n8. Perimeter of the square\n");
            option = sc.nextInt();
            switch (option) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    radius = sc.nextDouble();
                    System.out.println("The area of the circle is: " + q1.getArea(radius));
                    break;
                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    radius = sc.nextDouble();
                    System.out.println("The perimeter of the circle is: " + q1.getPerimeter(radius));
                    break;
                case 3:
                    System.out.print("Enter the height of the triangle: ");
                    height = sc.nextFloat();
                    System.out.print("Enter the breadth of the triangle: ");
                    breadth = sc.nextFloat();
                    System.out.println("The area of the triangle is: " + q1.getArea(breadth, height));
                    break;
                case 4:
                    System.out.print("Enter the side length of the side a of the triangle: ");
                    a = sc.nextDouble();
                    System.out.print("Enter the side length of the side b of the triangle: ");
                    b = sc.nextDouble();
                    System.out.print("Enter the side length of the side c of the triangle: ");
                    c = sc.nextDouble();
                    System.out.println("The perimeter of the triangle is: " + q1.getPerimeter(a, b, c));
                    break;
                case 5:
                    System.out.print("Enter the length of the rectangle: ");
                    l = sc.nextDouble();
                    System.out.print("Enter the height of the rectangle: ");
                    b = sc.nextDouble();
                    System.out.println("The area of the triangle is: " + q1.getArea(l, b));
                    break;
                case 6:
                    System.out.print("Enter the length of the rectangle: ");
                    l = sc.nextDouble();
                    System.out.print("Enter the breadth of the rectangle: ");
                    b = sc.nextDouble();
                    System.out.println("The perimeter of the rectangle is: " + q1.getPerimeter(l, b));
                    break;
                case 7:
                    System.out.print("Enter the length of the square: ");
                    side = sc.nextFloat();
                    System.out.println("The area of the square is: " + q1.getArea(side));
                    break;
                case 8:
                    System.out.print("Enter the length of the square: ");
                    side = sc.nextFloat();
                    System.out.println("The perimeter of the square is: " + q1.getPerimeter(side));
                    break;
                default:
                    System.out.println("Please select correct option");
            }
        }
    }
}