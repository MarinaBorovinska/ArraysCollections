package com.company.collection;
import java.util.ArrayList;

public class MyCompany {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addEmployee(String employeeName, int age, String projectName) {
        employeeList.add(new Employee(employeeName, age, projectName));
    }

    public void deleteEmployeeByName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.remove(i);
            }
        }
    }

    public void deleteEmployeeOlder(int desiredAge) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getAge() > desiredAge) {
                employeeList.remove(i);
            }
        }
    }

    public Employee getEmployeeByName(String employeeName) {
        Employee employeeToReturn = null;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeToReturn = employeeList.get(i);
                break;
            } else {
                employeeToReturn = new Employee("Not found", 0, "Not found");
            }
        }
        return employeeToReturn;
    }

    public void updateEmployeeName(String employeeName, String employeeNewName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setName(employeeNewName);
            }
        }
    }

    public void editEmployeeProjectName(String employeeName, String projectName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName(projectName);
            }
        }
    }

    public void clearEmployeeProjectName(String employeeName, String projectName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName) && employeeList.get(i).getProjectName().equals(projectName)) {
                employeeList.get(i).setProjectName("");
            }
        }
    }
}

