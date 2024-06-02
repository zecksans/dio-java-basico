package repeticao;

/* O uso de FOR EACH está fortemente relacionado,
 * com um cenário onde contenha um array ou
 * coleção, e assim, a interação é baseada nos
 * elementos da coleção
 */

public class ExemploForEach {
    public static void main(String[] args) {
        
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        //Forma abreviada
        for(String aluno : alunos) {
            System.out.println("nome do aluno é "+ aluno);
        }
    }
    
}
