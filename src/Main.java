public class Main {
    public static void main(String[] args){
        Employee[] staff = {
                new Manager("Kamal", 80000, 5),
                new Developer("Nimal", 50000, 3)
        };
        for(Employee e : staff){
            System.out.println("--------Employee Info-------");
            e.displayInfo();
            System.out.println("Bonus:" + e.calculateBonus());
            System.out.println();
        }
    }
}
