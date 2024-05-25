package edu.ezequiel.operadores;

public class OperadorAritmetico {
    
    public static void main(String[] args) {
      
    /*ARITMÉTICOS
    O operador aritmético, é utilizado para realizar operações matemáticas 
    entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

    Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
     */
        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        /*ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto,
         realizará a “concatenação de textos”.
        */

        String nome = "EZEQUIEL";
        String sobrenome = "SANTOS";
        String nomeCompleto = nome + sobrenome;

        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;               //Ao se deparar com uma String, todo o restante é concatenado

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);             // Aqui ele realiza a soma das evidencias por primeiro, em seguida concatena.
    

        System.out.println(concatenacao);


    }


}
