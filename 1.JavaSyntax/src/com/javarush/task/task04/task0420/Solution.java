package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if (a >= b && b >= c) {
            System.out.println(a + " " + b + " " + c);
        }else if (b >= a && a >= c){
            System.out.println(b + " " + a + " " + c);
        }else if (c >= b && b >= a){
            System.out.println(c + " " + b + " " + a);
        }else if (a >= c && c >=b){
            System.out.println(a + " " + c + " " + b);
        }else if (b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        }else if (c >= a && a >= b) {
            System.out.println(c + " " + a + " " + b);
        }
    }
}
