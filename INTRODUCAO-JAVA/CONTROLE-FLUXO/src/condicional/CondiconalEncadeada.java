package condicional;

public class CondiconalEncadeada {
    
    public static void main(String[] args) {
        // Nota Escolar
        int nota = 6;
        
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else if (nota >= 5 && nota < 7)
         System.out.println("Prova Recuperação");
        else
         System.out.println("Reprovado");
     }
}
