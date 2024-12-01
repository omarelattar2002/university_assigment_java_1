package implementing_class_arrays;

import java.util.Scanner;

// Class for Rectangle to calculate its area
class Rectangle {
    private double length; // Length of the rectangle
    private double width;  // Width of the rectangle

    // Constructor to initialize rectangle dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

// Class for Cylinder to calculate its volume
class Cylinder {
    private double height; // Height of the cylinder
    private double radius; // Radius of the cylinder
    private final double pi = 3.1416; // Constant for Pi

    // Constructor to initialize cylinder dimensions
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Method to calculate the volume of the cylinder
    public double getCylinderVolume() {
        return pi * (radius * radius) * height;
    }
}

// Class for Sphere to calculate its volume
class Sphere {
    private double radius; // Radius of the sphere
    private final double pi = 3.1416; // Constant for Pi

    // Constructor to initialize sphere radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate the volume of the sphere
    public double getSphereVolume() {
        // Formula: 4/3 * Pi * r^3
        return (4.0 / 3.0) * pi * (radius * radius * radius);
    }
}

// Class for Cube to calculate its volume
class Cube {
    private double length; // Length of a side of the cube

    // Constructor to initialize cube side length
    public Cube(double length) {
        this.length = length;
    }

    // Method to calculate the volume of the cube
    public double getCubeVolume() {
        return length * length * length;
    }
}



// Main class to handle user input and interact with shape classes
public class Main {
    public static void main(String[] args) {
        // Prompt user for the shape they want to calculate
        System.out.println("What would you like to choose? (cube, rectangle, sphere, cylinder): ");
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        String choice = scanner.nextLine().toLowerCase(); // Convert choice to lowercase for comparison

        try {
            // Handle rectangle area calculation
            if (choice.equals("rectangle")) {
                System.out.println("Please enter the length of the rectangle: ");
                double length = scanner.nextDouble(); // User input for length
                System.out.println("Please enter the width of the rectangle: ");
                double width = scanner.nextDouble(); // User input for width
                Rectangle rectangle = new Rectangle(length, width); // Create Rectangle object
                double result = rectangle.calculateArea(); // Calculate area
                System.out.println("The area of the rectangle is: " + result);

            // Handle cube volume calculation
            } else if (choice.equals("cube")) {
                System.out.println("Please enter the length of one edge of the cube: ");
                double length = scanner.nextDouble(); // User input for edge length
                Cube cube = new Cube(length); // Create Cube object
                double result = cube.getCubeVolume(); // Calculate volume
                System.out.println("The volume of the cube is: " + result);

            // Handle sphere volume calculation
            } else if (choice.equals("sphere")) {
                System.out.println("Please enter the radius of the sphere: ");
                double radius = scanner.nextDouble(); // User input for radius
                Sphere sphere = new Sphere(radius); // Create Sphere object
                double result = sphere.getSphereVolume(); // Calculate volume
                System.out.println("The volume of the sphere is: " + result);

            // Handle cylinder volume calculation
            } else if (choice.equals("cylinder")) {
                System.out.println("Please enter the radius of the cylinder: ");
                double radius = scanner.nextDouble(); // User input for radius
                System.out.println("Please enter the height of the cylinder: ");
                double height = scanner.nextDouble(); // User input for height
                Cylinder cylinder = new Cylinder(height, radius); // Create Cylinder object
                double result = cylinder.getCylinderVolume(); // Calculate volume
                System.out.println("The volume of the cylinder is: " + result);

            // Handle invalid shape choice
            } else {
                System.out.println("Invalid choice. Please select from cube, rectangle, sphere, or cylinder.");
            }
        } catch (Exception e) {
            // Handle invalid numeric input
            System.out.println("Invalid input. Please ensure you enter valid numbers for dimensions.");
        } finally {
            scanner.close();
        }
    }
}
