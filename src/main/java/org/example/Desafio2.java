package org.example;

import java.util.Arrays;

//Crie um programa que leia um vetor de 5 inteiros e imprima o vetor na ordem inversa
public class Desafio2 {
    public static void main(String[] args) {
        int vetorNum[] = {1, 54, 10, 4, 22};
        int tamanho = vetorNum.length;
        System.out.println(tamanho);
        int[] vetInvert = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetInvert[tamanho - 1 - i] = vetorNum[i];
        }
        System.out.println(Arrays.toString(vetInvert));
    }
}
