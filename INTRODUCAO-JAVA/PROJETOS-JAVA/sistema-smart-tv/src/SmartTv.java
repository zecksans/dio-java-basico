public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
   
    public void ligar(){
    ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Foi aumentado o volume para: " + volume);
    }


    public void diminuirVolume(){
        volume --;
        System.out.println("Foi diminuido o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("O canal foi alterado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("O canal foi alterado para: " + canal);
    }

    public void selecionarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O canal foi alterado para: " + canal);
    }
}