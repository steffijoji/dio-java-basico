public class ExceptionExercicio {
    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 2, 2, 8};

        try {
            for (int i = 0; i < denominador.length; i++) {
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dvidir por zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Quantidade de numeradores deve ser igual a de denominadores.");
        }

        System.out.println("O programa continua...");
    }
}
