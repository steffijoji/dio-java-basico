/*
Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e
parcelas influenciam. Defina arbitrariamente as faixas que influenciam nos valores.
 */

package metodos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do empréstimo: R$");
        double valor_emprestimo = scanner.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int parcelas = scanner.nextInt();

        calcularJuros(valor_emprestimo, parcelas);
    }

    public static void calcularJuros(double valor_emprestimo, int parcelas){
        int taxa;

        if (parcelas <= 5){
            taxa = 5;
        }else if (parcelas <= 10) {
            taxa = 10;
        }else {
            taxa = 15;
        }

        Locale localeBR = new Locale("pt", "BR");
        NumberFormat real = NumberFormat.getCurrencyInstance(localeBR);

        double valor_total = valor_emprestimo + (valor_emprestimo * taxa / 100);
        System.out.println("Taxa de juros de " + taxa + "%");
        System.out.println( parcelas + "X de " + real.format(valor_total/parcelas) );
        System.out.println("Valor total a pagar: " + real.format(valor_total));
    }
}

