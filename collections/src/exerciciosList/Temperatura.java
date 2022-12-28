package exerciciosList;

import java.util.*;
import java.util.stream.Collectors;

public class Temperatura {

    public static void main(String[] args) {

        List<Mes> meses = new ArrayList<>() {{
            add(new Mes("Janeiro", 29.0));
            add(new Mes("Fevereiro", 28.5));
            add(new Mes("Março", 27.0));
            add(new Mes("Abril", 26.8));
            add(new Mes("Maio", 27.0));
            add(new Mes("Junho", 25.0));
            }};

        System.out.println("-- Lista do mês e sua temperatura média --");
        System.out.println(meses);


        System.out.println("-- Média semestral --");
        Double soma = meses.stream().mapToDouble(Mes::getTemperatura).sum();
        double mediaTemperatura = soma/6;
        System.out.printf("%.2f %n", (mediaTemperatura));

        System.out.println("-- Meses com Temperatura acima da média --");
        for (Mes lista : meses) {
            if (lista.getTemperatura() >= mediaTemperatura) {
                System.out.println(lista);
            }
        }
    }
}


class Mes{
    private String mes;
    private double temperatura;

    public Mes(String mes, double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "mes='" + mes + '\'' +
                ", temperatura=" + temperatura + ";";
    }
}