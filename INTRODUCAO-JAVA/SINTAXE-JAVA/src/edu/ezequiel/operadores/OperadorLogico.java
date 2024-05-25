package edu.ezequiel.operadores;

public class OperadorLogico {

    public static void main(String[] args) {
        
    /*LÓGICOS
    Representam recursos que nos permitem criar
    expressões lógicas maiores a partir da junção
    de duas ou mais expressões.
    
    && Operador Lógico "E"
    || Operador Lógico "OU" 
    */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
         }

         if(condicao1 && ( 7>3 ) ){
            System.out.println("As duas condições são verdadeiras");
         }

        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira");
        }

    }
    
}
