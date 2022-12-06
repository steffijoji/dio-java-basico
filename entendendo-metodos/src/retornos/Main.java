package retornos;

public class Main {

    public static void main(String[] args) {
        System.out.println("Área do quadrado: " + QuadrilateroReturn.area(2) + "m²");
        System.out.println("Área do retângulo: " + QuadrilateroReturn.area(8, 2) + "m²");
        System.out.println("Área do trapézio: " + QuadrilateroReturn.area(5, 15, 8) + "m²");
    }
}
