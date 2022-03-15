import java.util.Scanner;

public class CircleWithException {
    private final static double PI = Math.PI;
    private double radius;

    public CircleWithException() {

    }

    public CircleWithException(double radius) throws Exception {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
        else if (radius > 1000) {
            throw new Exception("Radius cannot be bigger than 1000");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getArea() throws Exception {
        double area = 0;
        if (PI * radius * radius > 1000) {
            throw new Exception("Area cannot be bigger than 1000");
        }
        else {
            area = PI * radius * radius;
        }
        return area;
    }

    public static void main(String[] args) {
        CircleWithException Circle = new CircleWithException();
        Scanner in = new Scanner(System.in);

        try(in) {
            System.out.print("Enter radius: ");
            double radius = in.nextDouble();

            Circle.setRadius(radius);

            double area = Circle.getArea();
            double diameter = Circle.getDiameter();

            System.out.printf("Radius of the circle is %.2f\n", radius);
            System.out.printf("Area of the circle is %.2f\n", area);
            System.out.printf("Diameter of the circle is %.2f\n", diameter);

        } catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
