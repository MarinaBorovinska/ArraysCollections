package com.company.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyCompany myCompany = new MyCompany();
        myCompany.addEmployee("Serj", 25, "Hillel");
        myCompany.addEmployee("Alex", 30, "Hillel");
        myCompany.addEmployee("Serj", 33, "Hillel");

        // show all of employees
        System.out.println("All of employees:");
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName()+ " " + currentEmployee.getProjectName());
        }

        // delete employee
        System.out.println("Do you want delete Employee? y/n:");
        String userInputDelete = scanner.nextLine();
        if("y".equals(userInputDelete)) {
            System.out.println("Input name of Employee:");
            String inputName = scanner.nextLine();
            myCompany.deleteEmployeeByName(inputName);
            System.out.println();
            System.out.println("After deleted " + inputName);
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName());
            }
        } else if ("n".equals(userInputDelete)){
            System.out.println("Employee not deleted");
        }

        //add employee
        System.out.println("Do you want add employee? y/n:");
        String userInputAdd = scanner.nextLine();
        if("y".equals(userInputAdd)) {
            System.out.println("Please, input name:");
            String nameAdd = scanner.nextLine();
            System.out.println("Please, input age:");
            int ageAdd = Integer.valueOf(scanner.nextLine());
            System.out.println("Please, input project:");
            String projectAdd = scanner.nextLine();
            myCompany.addEmployee(nameAdd, ageAdd, projectAdd);
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName());
            }
        } else if ("n".equals(userInputAdd)){
            System.out.println("Employee not added");
        }

        //edit employee
            //update employee name
        System.out.println("Do you want update employee name? y/n");
        String userInputUpd = scanner.nextLine();
        if("y".equals(userInputUpd)) {
            System.out.println("Please, input name:");
            String nameUpd = scanner.nextLine();
            System.out.println("Please, input new name:");
            String nameNewUpd = scanner.nextLine();
            myCompany.updateEmployeeName(nameUpd, nameNewUpd);
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName());
            }
        } else if ("n".equals(userInputAdd)){
            System.out.println("Name employee not updated");
        }

           //set project name
        System.out.println("Do you want set project name? y/n");
        String userInputSetProjName = scanner.nextLine();
        if("y".equals(userInputSetProjName)) {
            System.out.println("Please, input name:");
            String nameSetProjectName = scanner.nextLine();
            System.out.println("Please, input project:");
            String projectSetName = scanner.nextLine();
        myCompany.editEmployeeProjectName(nameSetProjectName, projectSetName);
        System.out.println(myCompany.getEmployeeByName(nameSetProjectName).getName() + " "
               + myCompany.getEmployeeByName(nameSetProjectName).getProjectName());
        } else if ("n".equals(userInputSetProjName)){
            System.out.println("Project name not edited");
        }

          //clear project name
        System.out.println("Do you want clear project?y/n");
        String userInputClearProject = scanner.nextLine();

        if("y".equals(userInputClearProject)){
            System.out.println("Please, input name:");
            String nameEmployeeClearProject = scanner.nextLine();
            System.out.println("Please, input project:");
            String projectClearProject = scanner.nextLine();
            myCompany.clearEmployeeProjectName(nameEmployeeClearProject, projectClearProject);
            System.out.println(myCompany.getEmployeeByName(nameEmployeeClearProject).getName() + " "
                   + myCompany.getEmployeeByName(nameEmployeeClearProject).getProjectName());
        } else if ("n".equals(userInputClearProject)){
            System.out.println("Project not cleared");
        }
    }
}