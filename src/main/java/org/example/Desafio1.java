package org.example;
//Ler um vetor de 10 inteiros e conte quantos desses números são pares e quantos são impares
public class Desafio1 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < vetor.length; i++)
        {

            if (vetor[i] % 2 == 0){
                System.out.println("O número "+ vetor[i] + " é par");
            }
            else {
                System.out.println("O número " + vetor[i] + " é impar");
            }
        }

    }
}
