/*
Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
Obs: Use sobrecarga.
 */

package sobrecarga;

public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado * lado + "m²");
    }

    public static void area(double base, double altura){
        System.out.println("Área do retângulo: " + base * altura + "m²");;
    }

    public static void area(double baseMenor, double baseMaior, double altura){
        System.out.println("Área do trapézio: " + ((baseMenor + baseMaior)*altura) / 2 + "m²");
    }
}
