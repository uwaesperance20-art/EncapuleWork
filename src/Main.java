import Question1.Bike;
import Question1.Car;
import Question1.Vehicle;
import Question2.Developer;
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


        System.out.println(" Enter employeeId");
        int employeeId=scanner.nextInt();
        System.out.println("Enter employee Salary");
        String employeeStatus=scanner.nextLine();


        System.out.println("**** SalaryPaycheck ****");
        System.out.println("Choose your status:");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.println("************************");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print(" Enter Employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        if (choice == 1) {
            Employee emp = new Employee("12" , name, "Manager", 100000);
            Manager manager = new Manager(emp);
            manager.displayInfo();

        } else if (choice == 2) {
            Employee emp = new Employee("self", name, "Developer", 100000);
            Developer developer = new Developer(emp);
            developer.displayInfo();

        } else {
            System.out.println("Invalid choice!");
        }

        }

    }





