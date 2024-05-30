public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
    
        smartTv.ligar();
        System.out.println("Novo Status => TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status => TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume(); // O volume de 15 passa para 14
        smartTv.diminuirVolume(); // O volume de 14 passa para 13
        smartTv.aumentarVolume(); // O volume de 13 passa para 14

        System.out.println("O volume atual é: " + smartTv.volume);

        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.aumentarCanal(); // O canal passa de 1 para 2
        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.diminuirCanal(); // O canal passa de 2 para 1
        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.selecionarCanal(5);
        System.out.println("O canal atual é: " + smartTv.canal);

    }
}
