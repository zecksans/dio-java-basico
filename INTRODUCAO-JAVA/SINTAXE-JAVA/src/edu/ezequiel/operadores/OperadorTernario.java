package edu.ezequiel.operadores;

public class OperadorTernario {
    
    public static void main(String[] args) {
        
        /*TERNÁRIO
        O operador de condição ternária é uma forma resumida para definir 
        uma condição e escolher por um dentre dois valores.
        O operador ternário é representado pelos símbolos "?" e ":" 
        utilizados na seguinte estrutura de sintaxe:

            <Expressão Condicional>`` ? ``<Caso condição seja true>`` :
            ``<Caso condição seja false>
        
        Exemplos abaixo: 
         */
       
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);


    }




}
