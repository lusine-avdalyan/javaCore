package homeworks.employee;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private int salary;
    private String company;
    private String position;


    public Employee(String name, String surname, String employeeID,
                    int salary, String company, String position) {

        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Name: " + name
        +", Surname: " + surname
                + ", EmployeeID: " + employeeID
                + ", Salary: " + salary
                + ", Company: " + company
                + ", Position: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;

        return this.employeeID.equals(other.employeeID);
    }

    @Override
    public int hashCode() {
        return employeeID.hashCode();
    }
}
