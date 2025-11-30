public abstract class Employee{
    protected String name;
    protected double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public abstract double calculateBonus();
    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }
}