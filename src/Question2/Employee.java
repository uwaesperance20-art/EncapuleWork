package Question2;

public class Employee {
    private String employeeId;
    private  String employeeName;
    private  String employeeStatus;
    private  int employeeSalary;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(String employeeId, String employeeName, String employeeStatus, int employeeSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
        this.employeeStatus=employeeStatus;
        int salary;

        if (employeeSalary <0){
            System.out.println("the salary can't be negative");
        }else { this.employeeSalary=employeeSalary;

        }



    }
}
