package Q2.Prog213v;

public class Bank {
    private double myAmount;

    public Bank(double amount) {myAmount = amount;}
    public double getAmount()  {return myAmount;  }

    public void calc(Transaction thing) {
        switch (thing.getType()) {
            case "D" -> myAmount += thing.getAmount();
            case "S" -> myAmount -= thing.getAmount();
            case "C" -> {
                if (myAmount < thing.getAmount()) myAmount -= 10.0;
                else myAmount -= thing.getAmount();
            }
        }


    }
}
