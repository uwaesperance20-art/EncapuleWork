import Question1.Bike;
import Question1.Car;
import Question1.Vehicle;
import Question2.Employee;
import Question2.Manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = new Vehicle("Toyota", 30000);
        Vehicle car = new Car("Suzuki", 20000, 5);
        Vehicle bike = new Bike("Honda", 10000, 5);
        System.out.println("car cost for 5 days:" + car.calculateRentalCost(5));
        System.out.println("bike cost for 5 days:" + bike.calculateRentalCost(5));


        System.out.println("******Vehicle rentalSystem****");

        System.out.println(" enter car details");

        System.out.print("1.brand");
        String brand = scanner.nextLine();
        System.out.print("2.rentalPrice per day");
        int rentalPrice = scanner.nextInt();


        System.out.println("enter bike details");

        System.out.println("1.brand");
        String BikeBrand = scanner.nextLine();
        System.out.println("2.rentalPrice per days");
        int BikeRentalPrice = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("***** SalaryPayCheck*****");
        System.out.println("Choose your status");

        System.out.println("1.Manager");
        System.out.println("2. Developer");
        System.out.println("********");
        System.out.println("enter your choice");
        System.out.println("Enter employee Name");
        String employeeName=scanner.nextLine();
        System.out.println(" Enter employeeId");
        int employeeId=scanner.nextInt();
        System.out.println("Enter employee Salary");
        String employeeStatus=scanner.nextLine();


        }

    }





