package edu.ezequiel.operadores;

public class OperadorUnario {
    
    public static void main(String[] args) {
        
        /*UNÁRIOS
        Esses operadores, são aplicados juntamente com um outro operador aritmético. 
        Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

        (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.

        Exemplos abaixo:
         */

         //classe Operadores.java
        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        
        System.out.println(numero ++);  /*O incremento depois dá variável, fez que imprimisse 6 
                                        sem o incremento, somente foi para a memória (7) com o incremento .*/ 

        System.out.println(numero);  // Imprimindo agora 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);  // Imprimindo 8

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);  // Imprimindo ( Inverteu false). Mas em memória permanece true.

        //Muito cuidado com ordem de precedência, dos operadores unários! 

        System.out.println(numero);


    }


}
