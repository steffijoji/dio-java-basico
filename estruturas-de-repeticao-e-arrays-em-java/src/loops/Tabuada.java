/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 e 10. O usuário deve
informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

obs: devemos desconsiderar que o usuário digite um número diferente do solicitado.
 */

package loops;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int cont = 1;
        int resultado;

        System.out.println("Digite um número de 1 a 10 para saber sua tabuada.");
        numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero + ":");

        while (cont < 11){
            resultado = numero * cont;
            System.out.println(numero + " X " + cont + " = " + resultado);
            cont++;
        }

        // forma apresentada pela prof:
        System.out.println("\nTabuada de " + numero);
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}
