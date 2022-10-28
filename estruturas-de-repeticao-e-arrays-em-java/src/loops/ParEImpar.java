/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */

package loops;

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int quantNumeros;
        int cont = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Quantos números você quer analisar?");
        quantNumeros = scanner.nextInt();

        while(cont < quantNumeros){
            System.out.println("Digite um número:");
            numero = scanner.nextInt();

            if (numero % 2 == 0){
                par++;
            } else{
                impar++;
            }
            System.out.println("contador: " + cont);
            cont ++;
        }

        System.out.println("Você digitou " + par + " números pares.\n");
        System.out.println("Você digitou " + impar + " números ímpares.");
    }
}
