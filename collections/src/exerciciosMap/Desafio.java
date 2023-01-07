package exerciciosMap;

/*
Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
 */

import java.util.*;

public class Desafio {
    public static void main(String[] args) {

        List<Integer> valor = new ArrayList<>();

        Random gerador = new Random();
        for (int i = 0; i < 100; i++) {
            valor.add(gerador.nextInt(1, 7));
        }
        System.out.println(valor);

        Set<Integer> valoresUnicos = new HashSet<Integer>(valor);

        Iterator<Integer> iterator = valoresUnicos.iterator();
        Integer n = 1;
        while (iterator.hasNext()) {
            System.out.println("Número " + n++ + ": ");
            System.out.println(Collections.frequency(valor, iterator.next()));
        }
    }
}
