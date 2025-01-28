package Q3.Prog701g;

public class Person implements names {
     private String first;
     private String last;
     private String name;

     public Person(String fn, String ln) {
         first = fn;
         last  = ln;
     }

    public String getFirst() {return first;}
    public String getLast()  {return last; }
    public String getName()  {return first + " " + last;}
}
