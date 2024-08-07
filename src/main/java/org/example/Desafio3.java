package org.example;

import java.util.Arrays;

//Crie um programa que leia um vetor de 8 inteiros e determine o maior e menor valor presente no vetor
public class Desafio3 {
    public static void main(String[] args) {
        int vetor[] = {1, 54, 10, 4, 22, 100, 3, 0};
        int vetorMaior = 0;
        int vetorMenor = 1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetorMaior) {
                vetorMaior = vetor[i];
            }
            if (vetor[i] < vetorMenor){
                vetorMenor = vetor[i];
            }
        }
        System.out.println("O maior número do vetor é " + vetorMaior);
        System.out.println("O menor número do vetor é " + vetorMenor);
    }
}

