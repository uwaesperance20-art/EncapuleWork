package Question2;

import java.util.Scanner;

public class Developer extends Payment{
    int salary;

    public Developer(Object employee) {
        super(employee);
    }

    @Override
    public int calculateBonus() {
        return (salary*10)/100;
    }


}
