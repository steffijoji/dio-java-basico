/*
Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça
os métodos retornarem valores.
 */

package retornos;

public class QuadrilateroReturn {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double base, double altura){
        return base * altura;
    }

    public static double area(double baseMenor, double baseMaior, double altura){
        return ((baseMenor + baseMaior)*altura) / 2;
    }
}
