package com.company;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        //
        Scanner scanner = new Scanner(System.in);
    String word;
    String words[] = new String[6];
        for (int i = 0; i < words.length; i++){
            System.out.println((i+1) + ". word = ");
            word = scanner.nextLine();
            words[i] = word;
        }
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

    }
}
