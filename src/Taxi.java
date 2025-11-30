public class Taxi extends Transport{
    private double waitingCharge;
    public Taxi(double distance, double baseFare, double waitingCharge){
        super(distance, baseFare);
        this.waitingCharge = waitingCharge;
    }
    @Override
    public double calculateFare(){
        return baseFare + (distance * 20) + waitingCharge;
    }
    public double getWaitingCharge(){
        return waitingCharge;
    }
}
