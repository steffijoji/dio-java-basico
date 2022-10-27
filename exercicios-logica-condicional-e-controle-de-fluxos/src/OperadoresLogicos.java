public class OperadoresLogicos {

    public static void main(String[] args) {

        int idade = 21;
        char sexo = 'F';
        double salario = 4850.00;
        boolean filhos = false;
        double altura = 1.78;
        double peso = 80;

        System.out.println("true: se encaixa na sentença.\nfalse: não se encaixa na sentença.\n");

        System.out.println("1. Masculino com idade igual ou maior de 18 anos deve se alistar obrigatoriamente.");
        boolean r1 = idade >= 18 && sexo == 'M';
        System.out.println(r1);

        System.out.println("\n2. Salário maior que R$5000, independente de ter filhos ou não, deve pagar imposto.");
        boolean r2 = salario > 5000 && true;
        System.out.println(r2);

        System.out.println("\n3. Salário menor ou igual a R$5000 ou possui filhos, deve receber aumento de 10%. ");
        boolean r3 = salario <= 5000 || filhos == true;
        System.out.println(r3);

        System.out.println("\n4. Altura maior que 1.75 ou peso maior que 80, está acima da média de altura/peso brasileira ");
        boolean r4 = altura > 1.75 || peso > 80;
        System.out.println(r4);



        // usando controle de fluxo 'if'
        boolean maiorIdade = idade >= 18;
        boolean masculino = sexo == 'M';
        boolean salarioBaixo = salario <= 5000;
        boolean possuiFilho = filhos == true;

        if (maiorIdade && masculino){
            System.out.println("\nDeverá se alistar obrigatoriamente.");
        }else if (maiorIdade && !masculino) {
            System.out.println("\nNão é obrigada a se alistar.");
        } else {
            System.out.println("\nNão possui idade mínima para se alistar.");
        }

        if (salarioBaixo || possuiFilho){
            System.out.println("\nReceberá um aumento de 10%");
        } else {
            System.out.println("\nNão tem direito ao aumento.");
        }

    }

}
