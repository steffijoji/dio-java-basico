/*
Faça um programa que calcule o fatorial de um número
inteiro, fornecido pelo usuário.
Ex: 5! = 120 (5 X 4 X 3 X 2 X 1)
 */

package loops;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int resultado = 1;

        System.out.println("Número:");
        numero = scanner.nextInt();

        for(int i = numero; i >= 1; i--) {
            resultado = resultado * i;
        }

        System.out.println(numero + "! = " + resultado);
    }
}
