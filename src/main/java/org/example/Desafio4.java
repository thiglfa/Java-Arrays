package org.example;
//Crie um programa que leia um vetor de 6 inteiros e calcule a média desses números
public class Desafio4 {
    public static void main(String[] args) {
        int vetor[] = {10, 6, 5, 8, 6, 7};
        int vetorTotal = 0;
        int vetorMedia = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetorTotal = vetorTotal + vetor[i];
        }
        vetorMedia = vetorTotal / vetor.length;
        System.out.println("A média de todos os vetores é de " + vetorMedia);


    }
}
