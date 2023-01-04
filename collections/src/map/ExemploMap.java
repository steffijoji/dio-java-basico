package map;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("1. Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("2. Substitua o consumo do gol por 15.2 km/l:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("3. Confira se o modelo Tucson está no dicionário: " +
                carrosPopulares.containsKey("tucson"));

        System.out.println("4. Exiba o consumo do uno: " +
                carrosPopulares.get("uno"));

        System.out.println("5. Exiba o terceiro modelo adicionado: "); // não é possível

        System.out.println("6. Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("7. Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("8. Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - consumo: " + consumoMaisEficiente);

        System.out.println("9. Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries2) {
            if (entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - consumo: " + consumoMenosEficiente);

        System.out.println("10. Exiba a soma dos consumos:");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma do consumo: " + soma);

        System.out.println("11. Média dos consumos deste dicionário de carros: " + soma/carrosPopulares.size());

        System.out.println("12. Remova os modelos com consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("13. Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carroPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carroPopulares1);

        System.out.println("14. Exiba o dicionário ordenado pelo modelo:");
        Map<String, Double> carroPopulares2 = new TreeMap<>(carroPopulares1);
        System.out.println(carroPopulares2);

        System.out.println("15. Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("16. Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
}
