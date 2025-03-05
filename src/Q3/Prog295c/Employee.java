package Q3.Prog295c;

public class Employee {
    private String mySSN;
    private char myClass;
    private char myType;
    private int  myDepartmentCode;

    public Employee(String eSSN, char cls, char type, int dptCode) {
        mySSN = eSSN;
        myClass = cls;
        myType = type;
        myDepartmentCode = dptCode;
    }

    public String getSSN() {return mySSN;}
    public char getClassification() {return myClass;}
    public char getType() {return myType;}
    public int getDepartmentCode() {return myDepartmentCode;}
}