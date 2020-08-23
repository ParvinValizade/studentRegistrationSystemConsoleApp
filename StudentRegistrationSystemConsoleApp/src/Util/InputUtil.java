/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author Parvin
 */
public class InputUtil {

    public static String requireText(String title) {
        Scanner s = new Scanner(System.in);
        System.out.println(title + ":");
        String answer = s.nextLine();
        return answer;
    }

    public static int requireNumber(String title) {
        Scanner s = new Scanner(System.in);
        System.out.println(title + ":");
        int answer = s.nextInt();
        return answer;
    }
}

