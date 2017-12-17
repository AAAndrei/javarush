package com.javarush.task.task04.task0419;

/*
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReam = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReam);

        String Sa = bufferedReader.readLine();
        int a = Integer.parseInt(Sa);

        String Sb = bufferedReader.readLine();
        int b = Integer.parseInt(Sb);

        String Sc = bufferedReader.readLine();
        int c = Integer.parseInt(Sc);

        String Sd = bufferedReader.readLine();
        int d = Integer.parseInt(Sd);

        if(a >= b && a >= c && a >= d){
            System.out.println(a);
        }else if (b >= a && b >= c && b >= d){
            System.out.println(b);
        }else if (c >= a && c >= b && c >= d){
            System.out.println(c);
        }else if (d >= a && d >= b && d >= c){
            System.out.println(d);
        }else if (a == b && b == c && c == d){
            System.out.println(a);
        }
    }
}
