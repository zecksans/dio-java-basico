package condicional;

public class Ternario {
    
    // Ternário de uma Condicional Composta
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
 
    
   /* TERNÁRIO DE UMA CONDICIONAL ENCADEADA

       int nota = 6;
       String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
       System.out.println(resultado);
    */

}
