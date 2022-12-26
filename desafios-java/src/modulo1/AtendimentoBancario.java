package modulo1;

import java.util.Scanner;

public class AtendimentoBancario {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            nomesFila[i] = nome.next();
            System.out.println(nomesFila[i] + " - esta na posicao: " + (i+1));
        }

//        int cont = 1;
//
//        while (cont <= 3) {
//            String pessoa = nome.next();
//            System.out.println(pessoa + " - esta na posicao: " + cont);
//            cont ++;
//        }
    }
}
