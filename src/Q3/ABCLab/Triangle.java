package Q3.ABCLab;

public class Triangle extends NotCircle {
    private double base;


    public Triangle(double h, double b) {
        height = h;
        base  = b;
    }

    public void calcArea() {
        System.out.println(0.5*(base * height));
    }
   public void calcPerimeter() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("Perimeter: " + (hype + base + height)); // right triangle
   }

   public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
}
}
