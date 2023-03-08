package com.tnsoft;

import com.tnsoft.controllers.StudentController;
import com.tnsoft.models.Student;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = scanner.nextLine();
        System.out.println("Enter the age :");
        int age = scanner.nextInt();
        System.out.println("Enter the id :");
        Long id = scanner.nextLong();
        Student x = new Student(name, age, id);
        StudentController studentController = new StudentController();
        System.out.println("Enter the operation :\n 1 for create \n 2 for update \n 3 for delete \n 4 for read all");
        int op = scanner.nextInt();
        switch (op){
            case 1 : studentController.create(x);
                break;
            case 2 : studentController.update(x);
                break;
            case 3 : studentController.delete(x.getId());
                break;
            case 4 : studentController.readAll();
                break;
            default:
                System.out.println("Choose a valid value !");
                break;
        }


    }
}
