package edu.ezequiel.tiposevariaveis;

public class TiposVariaveis {
    
    public static void main(String[] args)  {
        
     /* A estrutura padrão para se declarar uma variável sempre é:
            <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>  */ 
        
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2500.453; //tipo "double", nome "salarioMinimo", valor 2.500,453

     /*Existe algumas peculiaridades a trabalhar com alguns
      tipos específicos. Observe no exemplo abaixo:
      */   

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;       //o tipo long precisa terminar com L, o tipo float precisa terminar com F
		double salario = 1275.33;

        

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Add o cast é como se comprometer que numeroNormal será um short
    

        /* Constantes são sempre escritas em CAIXA ALTA.
         * Abaixo, temos um exemplo explicativo sobre uso de variáveis e constantes:
		 * esta linha é considerada como declaração de variável iniciamos a existência
		 * variavel numero com valor 5 regra: tipo + nome + valor
		 */
		int numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.print(numero);
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 54 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		/* VALOR_DE_PI=3.15;     Esta linha apresentaria erro de compilação!    
                                Compreendemos que, para declarar uma variável como uma constante, 
                                utilizamos a palavra final, mas por convenção, 
                                esta variável deverá ser escrita toda em caixa alta. */
    
    
    }



}
