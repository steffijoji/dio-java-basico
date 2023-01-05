package exerciciosMap;

/*
Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
Crie um dicionário e relacione os estados e suas populações;
Substitua a população do estado do RN por 3.534.165;
Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
Exiba a população PE;

Exiba todos os estados e suas populações na ordem que foi informado;
Exiba os estados e suas populações em ordem alfabética;
Exiba o estado com o menor população e sua quantidade;
Exiba o estado com a maior população e sua quantidade;
Exiba a soma da população desses estados;
Exiba a média da população deste dicionário de estados;
Remova os estados com a população menor que 4.000.000;
Apague o dicionário de estados;
Confira se o dicionário está vazio.
 */

import java.util.*;

public class Populacao {
    public static void main(String[] args) {

        System.out.println("1. Crie um dicionário e relacione os estados e suas populações");
        Map<String, Integer> populacao = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534264);
        }};
        System.out.println(populacao);

        System.out.println("2. Substitua a população do estado do RN por 3.534.165");
        populacao.put("RN", 3534165);
        System.out.println(populacao);

        System.out.println("3. Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        if (populacao.containsKey("PB")) {
            return;
        } else {
            populacao.put("PB", 4039277);
        }
        ;
        System.out.println(populacao);

        System.out.println("4. Exiba a população PE");
        System.out.println(populacao.get("PE"));

        System.out.println("5. Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> populacao2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534264);
        }};
        System.out.println(populacao2);

        System.out.println("6. Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> populacao3 = new TreeMap<>(populacao2);
        for (Map.Entry<String, Integer> pop : populacao3.entrySet())
            System.out.println(pop.getKey() + " - " + pop.getValue());

        System.out.println("7. Exiba o estado com a menor população e sua quantidade");
        Integer menorPopulacao = Collections.min(populacao.values());
        Set<Map.Entry<String, Integer>> entries = populacao.entrySet();
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao))
                estadoMenorPopulacao = entry.getKey();
        }
        System.out.println(estadoMenorPopulacao + " - " + menorPopulacao);

        System.out.println("8. Exiba o estado com a maior população e sua quantidade");
        Integer maiorPopulacao = Collections.max(populacao.values());
        Set<Map.Entry<String, Integer>> entries1 = populacao.entrySet();
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : entries1) {
            if (entry.getValue().equals(maiorPopulacao))
                estadoMaiorPopulacao = entry.getKey();
        }
        System.out.println(estadoMaiorPopulacao + " - " + maiorPopulacao);

        System.out.println("9. Exiba a soma da população desses estados");

    }
}
