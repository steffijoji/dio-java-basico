/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
obs: considere que o usuário irá digitar apenas 1 caracter corretamente.
 */

package arrays;

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int cont = 0;

        System.out.println("Digite uma letra do alfabeto.");

        do {
            System.out.println("Letra: ");
            String letra = scanner.next();

            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[cont] = letra;
                quantConsoantes++;
            }
            cont++;
        } while (cont < consoantes.length);

        System.out.println("Quantidade de consoantes digitadas: " + quantConsoantes);
        System.out.print("Consoantes digitadas: ");
        for ( String consoante : consoantes) {
            if (consoante != null) {
                System.out.print( consoante + " ");
            }
        }
    }
}
