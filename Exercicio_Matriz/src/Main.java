/*
    ENUNCIADO

    Fazer um programa para ler um número interiro N e uma matriz de oredem N contendo números inteiros.
    Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        // Criando for de linhas e colunas da matriz

        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                matriz[linhas][colunas] = sc.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(matriz[linha][linha] + " ");
        }
        System.out.println();

        int count = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}