package edu.ezequiel.documentacao;

public class UsoComentarioEquivocado {
    
    public static void main(String[] args) {
        
        /**Um comentário, não possui a finalidade 
         *de amenizar um algoritmo não estruturado, 
        *conforme as convenções da linguagem
        */
    }
     
     /*
      * Este método foi elaborado as pressas
      * por isso eu abrevei o nome das variáveis
      * mas olha, ele tem a finalidade de somar ou  multiplicar dois numeros
      */


public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
    
