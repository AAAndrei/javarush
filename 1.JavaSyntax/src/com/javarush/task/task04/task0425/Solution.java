package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String Sa = bufferedReader.readLine();
        int a = Integer.parseInt(Sa);

        String Sb = bufferedReader.readLine();
        int b = Integer.parseInt(Sb);

        if (a > 0 && b >0){
            System.out.println("1");
        }else if (a < 0 && b > 0){
            System.out.println("2");
        }else if (a < 0 && b < 0){
            System.out.println("3");
        }else if (a > 0 && b < 0){
            System.out.println("4");
        }
    }
}
