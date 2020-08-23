/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import beans.Student;
import java.util.Scanner;
import main.Config;

/**
 *
 * @author Parvin
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("enter name");
        String surname = InputUtil.requireText("enter surname");
        int age = InputUtil.requireNumber("enter age");
        String className = InputUtil.requireText("enter className");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i+1)+"."+st.getfullInfo());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students do you want to registr for? ");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");

            Config.students[i] = StudentUtil.fillStudent();

        }
        System.out.println("Registration completed succesfully");
        StudentUtil.printAllRegisteredStudents();
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("Please enter:name ,surname or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getfullInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }
        }
        return result;
    }
    
    public static void UpdateStudent(){
        int index=InputUtil.requireNumber("Which student do you want to update?");
         if (Config.students == null) {
            return ;
        }
        for (int i = 0; i < Config.students.length; i++) {
            if ((index-1)==i) {
                    Config.students[i] = StudentUtil.fillStudent();
            }
        }
}
    public static void Updatestudent (){
        String text=InputUtil.requireText("Which student do you want to update?");
        int count=0;
        for (int i = 0; i < Config.students.length; i++) {
                 Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count+=i;
            }
        }
        System.out.println("Enter update information");
        Config.students[count]=fillStudent();
        
        
        
        
    }
    
    public static void Exit(){
        System.exit(0);
    }

   
}





