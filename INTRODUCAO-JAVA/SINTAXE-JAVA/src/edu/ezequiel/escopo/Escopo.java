package edu.ezequiel.escopo;

public class Escopo {
    

/*  ESCOPO.

 O Escopo pode ser entendido como, o ambiente em que uma variável pode ser acessada.
A variável que é criada no bloco da classe é denominada, váriável de classe e pode
ser acessada  por todos os métodos dentro da respectiva classe.
Já a variável de método, esta declarada dentro do bloco de métodos,
tem seu acesso restrito ao seu respectivo método apenas.

 Segue exemplos. :

*/
public class Conta {
	//variavel da classe conta
	double saldo=10.0;
	
	public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel
		//System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}
}




}
