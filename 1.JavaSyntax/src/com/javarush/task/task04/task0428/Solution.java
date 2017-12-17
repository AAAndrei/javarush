package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Sa = reader.readLine();
        int a = Integer.parseInt(Sa);

        String Sb = reader.readLine();
        int b = Integer.parseInt(Sb);

        String Sc = reader.readLine();
        int c = Integer.parseInt(Sc);

        if (a > 0 && b > 0 && c > 0){
            System.out.println("3");
        }else if (a > 0 && b > 0 || b > 0 && c > 0 || a > 0 && c > 0){
            System.out.println("2");
        }else if (a > 0 || b > 0 || c > 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
