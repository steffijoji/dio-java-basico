import java.util.Scanner;

public class ControleDeFluxo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        mostraMes();
        mostrarFerias();
        mostrarDia();
        mostrarStatus();
    }


        /*
        Com if, exiba o nome do mês do ano de acordo com seu número. Evite o efeito "flecha".
        Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para assim
        exibir o texto "Férias".
         */

    public static void mostraMes(){

        System.out.println("Digite um número para saber o mês correspondente.");
        int mes = scanner.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else{
            System.out.println("Número inválido. Não corresponde a nenhum mês.");
        }

    }

    public static void mostrarFerias(){

        // seria mais recomendável usar o switch nesse caso:
        int mes = 7;

        if(mes == 1 || mes == 7 || mes == 12){
            System.out.println("Há férias no mês " + mes);
        } else if (mes < 1 || mes > 12){
            System.out.println("Valor inválido.");
        } else {
            System.out.println("Não é um mês de férias");
        }
    }


        /*
        Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch,
        faça outro exemplo onde, se uma variável inteira for entre 1 e 3, exibir o texto "Certo".
        Se for 4, exibir "Errado", se for 5, "Talvez". Para demais valores, exibir "Valor indefinido"
         */

    public static void mostrarDia(){

        System.out.println("Informe um dia da semana para saber seu número correspondente:");
        String dia = scanner.next();

        switch (dia){
            case "domingo":
                System.out.println(1);
                break;
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sábado":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor inválido.");
        }
    }

    public static void mostrarStatus(){

        System.out.println("Digite um número entre 1 e 5: ");
        int numero = scanner.nextInt();

        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
}
