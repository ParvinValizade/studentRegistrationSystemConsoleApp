/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Util.InputUtil;
import Util.StudentUtil;
import beans.Student;
import java.util.Scanner;

/**
 *
 * 0* @author Parvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1.Register Student"
                    + "\n2.Show all Student"
                    + "\n3.Find the Student"
                    + "\n4.Update the Student"
                    + "\n5.Exit");
            if (menu == 1) {
                StudentUtil.registerStudents();
            } else if (menu == 2) {
                StudentUtil.printAllRegisteredStudents();
            } else if (menu == 3) {
                StudentUtil.findStudentsAndPrint();
            } else if (menu==4) {
                StudentUtil.UpdateStudent();
            } else if (menu==5) {
                StudentUtil.Exit();
            }
        }
    }
}
