
package Escola;


public class Aluno {
    private String Matricula;
    private String Nome;
    
    public Aluno(String n, String m){
        //Construtor 
        setNome(n);
        setMatricula(m);
        
    }
    
    public String getNome(){
        return this.Nome;
    }

   public void setNome(String n){
   this.Nome = n;
           }
   public String getMatricula(){
        return this.Matricula;
    }
   public void setMatricula(String m){
   this.Matricula = m;
           }
}
