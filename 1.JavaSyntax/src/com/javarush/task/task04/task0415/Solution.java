package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader (inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String Sa = bufferedReader.readLine();
        int a = Integer.parseInt(Sa);

        String Sb = bufferedReader.readLine();
        int b = Integer.parseInt(Sb);

        String Sc = bufferedReader.readLine();
        int c = Integer.parseInt(Sc);

        if (a + c > b && a + b > c && c + b > a){
            System.out.println("Треугольник существует.");
        }else{
            System.out.println("Треугольник не существует.");
        }
    }
}