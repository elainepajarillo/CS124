//Elaine Pajarillo 
// CMSC 127 - Aug. 30, 2024

public class Triangle {
        
    private double height = 1.0;
    private double base = 1.0;

    // setter height with conditions 
    public void setHeight(double height) {
        if (height > 0.0 && height < 20.0) {
            this.height = height;
        } else {
            System.out.println("Error! The height must be between 0.0 and 20.0.");
        }
    }

    // Getter height
    public double getHeight() {
        return height;
    }

    // Setter base with conditions
    public void setBase(double base) {
        if (base > 0.0 && base < 20.0) {
            this.base = base;
        } else {
            System.out.println("Error! The base must be between 0.0 & 20.0");
        }
    }

    // Getter for base
    public double getBase() {
        return base;
    }

    // area of the triangle
    public double area() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // Set values (valid)
        triangle.setHeight(10.0);
        triangle.setBase(5.0);

        System.out.println("The area of the triangle is: " + triangle.area());

        // Set values (invalid)
        triangle.setHeight(25.0);  // Should print error message 
        triangle.setBase(-5.0);    // should print an error message
        
        triangle.setHeight(-8.0);  // Should print error message 
        triangle.setBase(25.0);    // should print an error message
    }


}

