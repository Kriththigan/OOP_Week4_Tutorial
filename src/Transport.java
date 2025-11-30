public abstract class Transport {
    protected double distance;
    protected double baseFare;
    public Transport(double distance, double baseFare){
        this.distance = distance;
        this.baseFare = baseFare;
    }
    public abstract double calculateFare();
    public void showInfo(){
        System.out.println("Distance:" + distance + "km");
        System.out.println("Base Fare:" + baseFare );
    }
}
