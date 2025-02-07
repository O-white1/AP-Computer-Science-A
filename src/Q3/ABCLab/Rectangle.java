package Q3.ABCLab;

public class Rectangle extends NotCircle {
    private double width;


    public Rectangle(double h, double w) {
        height = h;
        width  = w;

    }

    public void calcArea() {
        System.out.println(width * height);
    }
    public void calcPerimeter() {
        System.out.println((2*height) + (2*width));
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
