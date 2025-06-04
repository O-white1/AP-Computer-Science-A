package Q4.Prog702q;

public class Vehicle implements Names {
    private final String name;
    private final int    tires;
    private final double value;

    public Vehicle(String name, int tires, double value) {
        this.name  = name;
        this.tires = tires;
        this.value = value;
    }
    @
    public String getName() {
        return this.name;
    }
    public int getTire() {
        return this.tires;
    }
    public double getValue() {
        return this.value;
    }

}
