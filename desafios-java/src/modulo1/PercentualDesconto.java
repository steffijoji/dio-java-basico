package modulo1;

import java.util.Scanner;

public class PercentualDesconto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        int percentual = ((M - S) * 100) / M;
        System.out.println("O desconto foi de " + percentual + "%");
    }
}
