package com.example;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        employeeDAO.addEmployee("John Doe", 30, "Developer", 5000.0f);
        employeeDAO.addEmployee("Jane Smith", 25, "Designer", 4000.0f);

        employeeDAO.updateEmployee(1, "John Doe", 31, "Senior Developer", 6000.0f);

        System.out.println("Employees:");
        employeeDAO.getEmployees();

        employeeDAO.deleteEmployee(2);

        System.out.println("Employees after deletion:");
        employeeDAO.getEmployees();
    }
}

