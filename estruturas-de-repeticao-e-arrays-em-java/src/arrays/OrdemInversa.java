/*
Crie um vetor de 6 números inteiros e
mostre-os na ordem inversa.
 */

package arrays;

public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {8, 5, -96, 25, -6, 74};
        int cont = 0;

        System.out.print("Vetor: ");
        while (cont < vetor.length){
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.print("\nVetor Inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}