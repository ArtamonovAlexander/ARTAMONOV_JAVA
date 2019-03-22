package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
int x = 0;
int y = 0;
          while (y<10) {
              y++;

              while (x < 10) {
                  x++;
                  System.out.print(x*y+" ");
              }
              x=0;
              System.out.println();
          }


    }
}
