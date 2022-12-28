package exerciciosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? ");
        respostas.add(scanner.nextLine());
        System.out.println("Esteve no local do crime? ");
        respostas.add(scanner.nextLine());
        System.out.println("Mora perto da vítima? ");
        respostas.add(scanner.nextLine());
        System.out.println("Devia para a vítima? ");
        respostas.add(scanner.nextLine());
        System.out.println("Já trabalhou com a vítima? ");
        respostas.add(scanner.nextLine());

        System.out.println(respostas);

        int positivo = 0;
        for (String resposta : respostas) {
            if (Objects.equals(resposta, "sim")) {
                positivo++;
            }
        }

        switch (positivo) {
            case 0:
                System.out.println("Inocente");
                break;
            case 1:
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
        }
    }
}
