package edu.ezequiel.operadores;

public class OperadorRelacional {
    
    public static void main(String[] args) {
        
    /*RELACIONAIS
    Avaliam a relação à esquerda entre duas variáveis ou expressões.
    Retornando um valor booleano como resultado.
    
    == Quando desejamos verificar se uma variável é IGUAL A outra.

    != Quando desejamos verificar se uma variável é DIFERENTE da outra.

    > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

    >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

    < Quando desejamos verificar se uma variável é MENOR QUE outra.

    <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
     */   

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 == numero2){  // Se for true ele segue a condição
        System.out.println("A nossa condição é verdadeira.");
    }

    System.out.println("Numero1 é igual a numero 2? " + simNao);

    String nomeFuncionario = "Ezequiel";
    String nomeCliente = "Ezequiel";

    System.out.println( nomeFuncionario == nomeCliente);

    }
}
