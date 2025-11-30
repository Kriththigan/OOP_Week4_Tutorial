public class Bus extends Transport{
    private int passengers;
    public Bus(double distance, double baseFare, int passengers){
        super(distance, baseFare);
        this.passengers = passengers;
    }
    @Override
    public double calculateFare(){
        return baseFare + (distance * 5) - (passengers * 0.5);
    }
    public int getPassengers(){
        return passengers;
    }
}
