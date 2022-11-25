public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal + "\n");

        System.out.println("TV ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.mudarCanal(20);
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.voltarCanal();
        System.out.println("Canal atual: " + smartTv.canal + "\n");

        smartTv.desligar();
        System.out.println("TV ligada: " + smartTv.ligada);
    }
}
