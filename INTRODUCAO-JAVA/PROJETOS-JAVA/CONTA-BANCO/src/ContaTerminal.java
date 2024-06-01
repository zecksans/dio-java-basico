import java.util.Locale;
import java.util.Scanner;  //Importando a Classe Scanner


public class ContaTerminal {
    
   public static void main(String[] args) {
            //Criando o objeto scanner
        Scanner scanner = new
    Scanner(System.in) .useLocale(Locale.US);
            
        System.out.println("Por favor, digite o seu nome completo:" ); //Solicitando os dados ao usuário
        String nomeCliente = scanner.nextLine();  //Obtendo pelo scanner os dados digitados pelo usuário via terminal
      
        System.out.println("Por favor, digite o numero da agência:" );
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o numero da conta:" );
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o seu saldo:" );
        double saldo = scanner.nextDouble();

        //Imprimindo a mensagem constando os dados antes informados.

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo de R$" +saldo + " já está disponível para saque." );



   } 
    
}
