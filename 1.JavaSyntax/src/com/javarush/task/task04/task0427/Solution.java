package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String Sa = bufferedReader.readLine();
        int a = Integer.parseInt(Sa);

        if (a % 2 == 0 && a > 0 && a < 10 ){
            System.out.println("четное однозначное число");
        }else if (a % 2 == 1 && a > 0 && a < 10 ){
            System.out.println("нечетное однозначное число");
        }else if (a % 2 == 0 && a > 9 && a < 100 ){
            System.out.println("четное двузначное число");
        }else if (a % 2 == 1 && a > 9 && a < 100){
            System.out.println("нечетное двузначное число");
        }else if (a % 2 == 0 && a > 99 && a < 1000){
            System.out.println("четное трехзначное число");
        }else if (a % 2 == 1 && a > 99 && a < 1000){
            System.out.println("нечетное трехзначное число");
        }
    }
}
