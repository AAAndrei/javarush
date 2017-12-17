package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 3 ; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number > 0){
                positive++;
            }else if (number < 0){
                negative++;
            }
        }
        System.out.println("количество отрицательных чисел:" + " " + negative);
        System.out.println("количество положительных чисел:" + " " + positive);
    }
}
