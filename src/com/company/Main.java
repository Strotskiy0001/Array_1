package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int arrayLength;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input N");
        arrayLength = keyboard.nextInt();
        int array[] = new int[arrayLength];
        System.out.println("Input array");
        for(int i = 0; i < arrayLength; i++) {
            array[i] = keyboard.nextInt();
        }
        for(int i = 0; i < arrayLength; i++){
            if(array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
