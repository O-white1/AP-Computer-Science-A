package Q3.Farm;

public abstract class Animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;
    public Animal(String name, int weight, int numCorn, int numHayBales) {
        myName = name;
        myWeight = weight;
        myNumCorn = numCorn;
        myNumHayBales = numHayBales;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName() {return myName;}
    public int getWeight() {return myWeight;}
    public int getNumCorn() {return myNumCorn;}
    public int getNumHayBales() {return myNumHayBales;}

    public double getFeedCost(double cornCost, double hayCost) {
        return (myNumCorn * cornCost) + (myNumHayBales * hayCost);
    }
}
