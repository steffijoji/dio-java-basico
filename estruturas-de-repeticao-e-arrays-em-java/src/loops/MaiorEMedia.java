/*
Faça um programa que leia 5 números,
informe o maior número e
a média de números.
 */

package loops;

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        int cont = 1 ;
        int maior = 0;
        double soma = 0;

        while(cont <= 5){
            System.out.println("Informe um número:");
            num = scanner.nextInt();

            if (maior < num){
                maior = num;
            }

            soma += num;
            cont++;
        }

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números é de: " + soma/5);

    }
}
