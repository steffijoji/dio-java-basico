/*
A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde, Boa noite.
 */

package metodos;

public class Mensagem {

    public static void main(String[] args) {

        informarMensagem(6);
        informarMensagem(13);
        informarMensagem(20);
        informarMensagem(25);
    }

    public static void informarMensagem(int hora){
        if (hora >= 5 && hora <=12){
            System.out.println("Bom Dia!");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Boa Tarde!");
        } else if ((hora > 18 && hora <=24) || (hora >= 0 && hora < 5)){
            System.out.println("Boa Noite!");
        }else{
            System.out.println("Horário inválido.");
        }
    }
}
