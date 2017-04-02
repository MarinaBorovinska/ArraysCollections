package com.company.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyCompany myCompany = new MyCompany();
        myCompany.addEmployee("Serj", 25, "Hillel");
        myCompany.addEmployee("Alex", 30, "Hillel");
        myCompany.addEmployee("Serj", 33, "Hillel");

        // show all of employees
        System.out.println("All of employees:");
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName());
        }

        // delete employee
        Scanner scDel = new Scanner(System.in);
        System.out.println("Do you want delete Employee? y/n:");
        String userInputDelete = scDel.nextLine();
        if("y".equals(userInputDelete)) {
            System.out.println("Input name of Employee:");
            String inputName = scDel.nextLine();
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
        Scanner scAdd = new Scanner(System.in);
        String userInputAdd = scAdd.nextLine();
        if("y".equals(userInputAdd)) {
            System.out.println("Please, input name:");
            String nameAdd = scAdd.nextLine();
            System.out.println("Please, input age:");
            int ageAdd = Integer.valueOf(scAdd.nextLine());
            System.out.println("Please, input project:");
            String projectAdd = scAdd.nextLine();
            myCompany.addEmployee(nameAdd, ageAdd, projectAdd);
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName());
            }
        } else if ("n".equals(userInputAdd)){
            System.out.println("Employee not added");
        }

        //edit employee
            //update employee name

//        System.out.println(myCompany.getEmployeeByName("Test Name").getName());

        System.out.println("Do you want update employee name? y/n");
        Scanner scUpd = new Scanner(System.in);
        String userInputUpd = scUpd.nextLine();
        if("y".equals(userInputUpd)) {
            System.out.println("Please, input name:");
            String nameUpd = scUpd.nextLine();
            System.out.println("Please, input new name:");
            String nameNewUpd = scUpd.nextLine();
            myCompany.updateEmployeeName(nameUpd, nameNewUpd);
            for (Employee currentEmployee : myCompany.getAllEmployees()) {
                System.out.println(currentEmployee.getName());
            }
        } else if ("n".equals(userInputAdd)){
            System.out.println("Name employee not updated");
        }

           //set project name
        System.out.println("Do you want set project name? y/n");
        Scanner scSetProjectName = new Scanner(System.in);
        String userInputSetProjName = scSetProjectName.nextLine();
        if("y".equals(userInputSetProjName)) {
            System.out.println("Please, input name:");
            String nameSetProjectName = scSetProjectName.nextLine();
            System.out.println("Please, input project:");
            String projectSetName = scSetProjectName.nextLine();
        myCompany.editEmployeeProjectName(nameSetProjectName, projectSetName);
        System.out.println(myCompany.getEmployeeByName(nameSetProjectName).getName() + " "
               + myCompany.getEmployeeByName(nameSetProjectName).getProjectName());
        } else if ("n".equals(userInputSetProjName)){
            System.out.println("Project name not edited");
        }

          //clear project name
        System.out.println("Do you want clear project?y/n");
        Scanner scClearProject = new Scanner(System.in);
        String userInputClearProject = scClearProject.nextLine();

        if("y".equals(userInputClearProject)){
            System.out.println("Please, input name:");
            String nameEmployeeClearProject = scClearProject.nextLine();

            System.out.println("Please, input project:");
            String projectClearProject = scClearProject.nextLine();

            myCompany.clearEmployeeProjectName(nameEmployeeClearProject, projectClearProject);

            System.out.println(myCompany.getEmployeeByName(nameEmployeeClearProject).getName());

//            System.out.println(myCompany.getEmployeeByName(nameClearProject).getName() + " "
//                    + myCompany.getEmployeeByName(nameClearProject).getProjectName());
        } else if ("n".equals(userInputClearProject)){
            System.out.println("Project not cleared");
        }

    }


    //        new Employee();
//        new Employee("", 20, "");

//        ArrayList<Object> listOfObjects = new ArrayList<Object>();
//        listOfObjects.add("Test");
//        listOfObjects.add(new Employee());

//        ArrayList<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(new Employee("Serj", 25, "Hillel"));
//        employeeList.add(new Employee("Alex", 30, "Electric Cloud"));
//        employeeList.add(new Employee("Serj", 45, "Sigma"));

}