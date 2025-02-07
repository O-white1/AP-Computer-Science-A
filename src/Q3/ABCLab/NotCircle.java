package Q3.ABCLab;

public abstract class NotCircle implements Shape {
    protected double height;


    public abstract double getHeight();
    public abstract void setHeight(double height);

    public void printClass() {
        System.out.println(this.getClass().getSimpleName());
    }
}
