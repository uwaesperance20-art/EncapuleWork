package Question2;

public class Manager extends Payment{

    int saraly;
    String name;

    public Manager(Employee employee) {
        super(employee);
    }
public void displayInfo(){
    System.out.println();
}
    @Override
    public int calculateBonus() {
        return (saraly*20)/100;
    }
}
