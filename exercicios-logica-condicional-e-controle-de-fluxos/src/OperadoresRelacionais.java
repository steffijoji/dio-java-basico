public class OperadoresRelacionais {

    public static void main(String[] args) {

        String nome1 = "Joao";
        String nome2 = "Maria";

        char inicial1 = 'A';
        char inicial2 = 'B';

        int num1 = 8;
        int num2 = 10;

        double peso1 = 23.5;
        double peso2 = 10;

        boolean status1 = true;
        boolean status2 = false;

        //Comparações com String
        System.out.println(nome1 == nome2);
        System.out.println(nome1 != nome2);
        System.out.println(nome1.equals(nome2));

        //Comparações com char
        System.out.println(inicial1 == inicial2);
        System.out.println(inicial2 != inicial1);
        System.out.println(inicial1 > inicial2);
        System.out.println(inicial1 <= inicial2);

        //Comparações com númericos
        System.out.println(num1 == num2);
        System.out.println(num2 >= num1);
        System.out.println(num2 != peso1);
        System.out.println(num1 == peso2);
        System.out.println(peso1 < num1);

        //Comparações com boolean
        System.out.println(status1 == status2);
        System.out.println(status2 != status1);
    }
}
