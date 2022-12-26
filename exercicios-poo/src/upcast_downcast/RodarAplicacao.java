package upcast_downcast;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        //downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
