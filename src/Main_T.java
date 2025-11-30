public class Main_T {
    public static void main(String[] args){
        Transport[] transports = {
                new Bus(12.5, 50, 30),
                new Taxi(8.0, 60, 15.0),
        };
        for(Transport t : transports){
            System.out.println("-----Transport Details-----");
            t.showInfo();
            System.out.println("Total Fare:" + t.calculateFare());

            if(t instanceof Bus){
                Bus b = (Bus)t;
                System.out.println("Type: Bus");
                System.out.println("Passengers:"  + b.getPassengers());
            } else if (t instanceof Taxi){
                Taxi tx = (Taxi) t;
                System.out.println("Type: Taxi");
                System.out.println("Waiting Charge:" + tx.getWaitingCharge());
            }
            System.out.println();
        }
    }
}
