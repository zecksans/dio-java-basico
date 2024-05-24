package edu.ezequiel.anatomiaclasse;
public class MinhaClasse {
    
public static void main(String[] args) {
      
        String primeiroNome = "Ezequiel";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
       
        //int numeroInteiro = 2;
       // double numeroDecimal = 2.1;
       // String escrita = "nome";
        //boolean verdadeiroFalso = true;
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);


}

}



    
