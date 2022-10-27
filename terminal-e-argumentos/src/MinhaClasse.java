public class MinhaClasse {

    public static void main(String[] args) {

        String nome1 = "Steffi";
        String nome2 = "Steffi";

        if(nome1 == nome2){
            System.out.println("Ambos são iguais");
        } else {
            System.out.println("São nomes diferentes");
        }

        String nome3 = "Yumi";
        String nome4 = new String("Yumi");

        System.out.println(nome3.equals(nome4));  //mais indicado usar equals quando se compara strings ou objetos
    }
}