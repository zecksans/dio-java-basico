package repeticao;

public class ExemploContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)     
                continue; // Quando encontrar o numero 3 ele interrompe somente ateração atual
            
            System.out.println(numero);
        }
    }
}
   
