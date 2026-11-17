package homeworks.employee;

public class EmployeeStorage {

    private Employee[] employees;
    private int size;

    public EmployeeStorage() {
        employees = new Employee[10];
        size = 0;
    }

    public void add(Employee employee) {

        if (searchById(employee.getEmployeeID()) != null) {
            System.out.println("Employee with ID "
                    + employee.getEmployeeID() + " already exists.");
            return;
        }

        if (size == employees.length) {
            Employee[] newEmployees =
                    new Employee[employees.length * 2];

            for (int i = 0; i < size; i++) {
                newEmployees[i] = employees[i];
            }

            employees = newEmployees;
        }

        employees[size] = employee;
        size++;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee searchById(String employeeID) {
        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }

        return null;
    }

    public void searchByCompany(String company) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (employees[i].getCompany().equals(company)) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found for company " + company);
        }
    }

    public void searchByMinimumSalary(int minSalary) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= minSalary) {
                System.out.println(employees[i]);
            }
        }
    }

    public void deleteById(String employeeID) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeID().equals(employeeID)) {

                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[size - 1] = null;
                size--;

                System.out.println("Employee successfully deleted.");
                return;

            }

        }
    }
}