/*
Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
Sempre 2 valores devem ser passados.
 */

package metodos;

import java.util.Scanner;

public class Calculos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1º número: ");
        int num1 = scanner.nextInt();

        System.out.print("2º número: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + "+" + num2 + " = " + somar(num1, num2));
        System.out.println(num1 + "-" + num2 + " = " + subtrair(num1, num2));
        System.out.println(num1 + "*" + num2 + " = " + multiplicar(num1, num2));
        System.out.println(num1 + "/" + num2 + " = " + dividir(num1, num2));
    }

    public static int somar(int num1, int num2) {
        int soma;
        soma = num1 + num2;
        return soma;
    }

    public static int subtrair(int num1, int num2) {
        int subtracao;
        subtracao = num1 - num2;
        return subtracao;
    }

    public static int multiplicar(int num1, int num2) {
        int multiplicacao;
        multiplicacao = num1 * num2;
        return multiplicacao;
    }

    public static double dividir(int num1, int num2) {
        int divisao;
        divisao = num1 / num2;
        return divisao;
    }
}
