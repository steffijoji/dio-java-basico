package exerciciosSet;

import java.util.*;

public class ArcoIris {

    public static void main(String[] args) {

        Set<String> cores1 = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo",
                "verde", "azul", "anil", "violeta"));
        System.out.println("1. Lista de cores, uma abaixo da outra:");
        for (String cor : cores1) {
            System.out.println(cor);
        }

        System.out.println("2. Quantidade de cores: " + cores1.size());

        System.out.println("3. Cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores1);
        System.out.println(cores2);

        System.out.println("4. Cores na ordem inversa da qual foi informada");
        List<String> cores3 = new ArrayList<>();
        cores3.addAll(cores1);
        Collections.reverse(cores3);
        System.out.println(cores3);

        System.out.println("5. Todas as cores que começam com a letra 'v'");
        for (String cor : cores1) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("6. Todas as cores que não começam com a letra 'v'");
        for (String cor : cores1) {
            if (!cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("7. Limpe o conjunto");
        cores1.clear();

        System.out.println("8. Confira se o conjunto está vazio: ");
        System.out.println(cores1);
    }
}