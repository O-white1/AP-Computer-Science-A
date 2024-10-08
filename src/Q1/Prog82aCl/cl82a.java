package Q1.Prog82aCl;

public class cl82a {
    private int sl;
    private int vs;

    private int MilesOverLimit;
    private int Charge;

    public cl82a(int SpeedLimit, int VehicleSpeed) {
        sl = SpeedLimit;
        vs = VehicleSpeed;

        MilesOverLimit = 0;
        Charge = 0;
    }
    public void Calc() {
        MilesOverLimit = Math.abs(vs - sl);
        Charge = (MilesOverLimit * 5) + 20;
    }
    public double GetCharge() {
        return Charge;
    }
}
