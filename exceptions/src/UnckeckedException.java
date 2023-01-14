import javax.swing.*;

// divisão de dois valores inteiros
public class UnckeckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por zero.");
            } finally {
                System.out.println("Chegou no finally.");
            }
        } while(continueLooping);

        System.out.println("O Código continua...");
    }


    private static int dividir(int a, int b) {
        return a/b;
    }

}
