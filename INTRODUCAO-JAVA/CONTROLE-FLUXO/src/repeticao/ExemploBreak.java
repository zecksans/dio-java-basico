package repeticao;

public class ExemploBreak {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)    // Quando encontrar o numero 3 ele vai parar o comando for
                break;
            
            System.out.println(numero);
        }
    }
}