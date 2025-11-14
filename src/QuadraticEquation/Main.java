package QuadraticEquation;

import java.util.Scanner;
class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        return (discriminant < 0) ? Double.NaN : (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        return (discriminant < 0) ? Double.NaN : (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a, b, c with spaces: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            double discriminant = equation.getDiscriminant();
            System.out.println("The discriminant is: " + discriminant);
            if (discriminant > 0) {
                System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
            } else if (discriminant == 0) {
                System.out.println("The equation has one root: " + equation.getRoot1());
            } else {
                System.out.println("The equation has no real roots");
            }
        }
    }


