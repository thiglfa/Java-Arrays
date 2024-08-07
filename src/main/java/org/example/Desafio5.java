package org.example;

import java.util.Arrays;

//Crie um programa que leia um vetor de 7 inteiros e determine se o vetor é um palindrome (ou seja,
//se ele é igual ao seu reverso
public class Desafio5 {
    public static void main(String[] args) {
        int[] vetor = {1, 1, 1, 1, 1, 1, 1};

        if (ehPalindromo(vetor)) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(int[] vetor) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        while (esquerda < direita) {
            if (vetor[esquerda] != vetor[direita]) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}
