package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        EmployeeStorage storage = new EmployeeStorage();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("Please input 5 for SEARCH EMPLOYEES BY MINIMUM SALARY");
            System.out.println("Please input 6 for DELETE EMPLOYEE BY ID");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {

                case 0:
                    System.out.println("Program finished.");
                    return;

                case 1:
                    System.out.println("Please input employee name:");
                    String name = scanner.nextLine();

                    System.out.println("Please input employee surname:");
                    String surname = scanner.nextLine();

                    System.out.println("Please input employee ID:");
                    String employeeID = scanner.nextLine();

                    System.out.println("Please input employee salary:");
                    int employeeSalary = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Please input employee company:");
                    String employeeCompany = scanner.nextLine();

                    System.out.println("Please input employee position:");
                    String employeePosition = scanner.nextLine();

                    Employee employee = new Employee(
                            name,
                            surname,
                            employeeID,
                            employeeSalary,
                            employeeCompany,
                            employeePosition
                    );
                    storage.add(employee);

                    System.out.println("Employee successfully added!");
                    break;

                case 2:
                    storage.printAll();
                    break;

                case 3:
                    System.out.println("Please input employee ID:");
                    String id = scanner.nextLine();

                    Employee foundEmployee = storage.searchById(id);

                    if (foundEmployee != null) {
                        System.out.println(foundEmployee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Please input employee company:");
                    String company = scanner.nextLine();

                    storage.searchByCompany(company);
                    break;

                case 5:
                    System.out.println("Please input minimum salary:");
                    int minSalary = scanner.nextInt();
                    scanner.nextLine();
                    storage.searchByMinimumSalary(minSalary);
                    break;

                case 6:
                    System.out.println("Please input employee ID:");
                    String employeeDelete = scanner.nextLine();

                    storage.deleteById(employeeDelete);
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
                    break;

            }
        }
    }
}
