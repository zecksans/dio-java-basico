import java.util.Locale;
import java.util.Scanner;

public class Contador {
    
        
        private static int conta;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();
            
            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
            
        }

        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if(parametroUm > parametroDois) { 
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                }
                
                int conta = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
                for(int contagem = 1; contagem <= conta; contagem ++) {
                   
                    System.out.println("Imprimindo o numero " + contagem);
                }   
        }

    }

