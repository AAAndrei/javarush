package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String S = reader.readLine();
       String Sa = reader.readLine();
       int n = Integer.parseInt(Sa);

       int i = 0;

        while (i < n){
            System.out.println(S);
            i++;
        }

    }
}
