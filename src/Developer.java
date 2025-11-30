public class Developer extends Employee{
    private int projectCount;
    public Developer (String name, double salary, int projectCount){
        super(name, salary);
        this.projectCount = projectCount;
    }
    @Override
    public double calculateBonus(){
        return salary * 0.15 + (projectCount * 500);
    }
}
