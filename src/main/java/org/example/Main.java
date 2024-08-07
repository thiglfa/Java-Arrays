package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] vetor2 = {1, 2, 5, 7, 9};

        int i = Arrays.binarySearch(vetor2, 7);

        System.out.println(i);
    }

}