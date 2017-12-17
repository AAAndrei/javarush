package com.javarush.task.task04.task0424;

/* 
Три числа
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

        String Sc = bufferedReader.readLine();
        int c = Integer.parseInt(Sc);

        if (a != b && a != c && b == c){
            System.out.println("1");
        }if (b != a && b != c && a == c){
            System.out.println("2");
        }if (c != a && c != b && a == b){
            System.out.println("3");
        }
    }
}
