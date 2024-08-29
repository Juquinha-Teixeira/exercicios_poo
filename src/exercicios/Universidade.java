package exercicios;

import java.util.List;

public class Universidade {
    
    private String nome;
    private String cidade;
    private String estado;
    private String pais;
    private int numeroAlunos;
    private List<String> cursos;
    
    Universidade(){}
    
    Universidade(String nome, String cidade, String estado, String pais, int numeroAlunos){
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numeroAlunos = numeroAlunos;
    }
    
    public void matriculaRealizada(){
        System.out.println("A matricula do aluno foi realizada com sucesso!");
    }
    
    public void cancelarMatricula(){
        System.out.println("A matricula do aluno foi cancelada com sucesso!");
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String getPais(){
        return pais;
    }
    
    public int getNumeroALunos(){
        return numeroAlunos;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    public void setNumeroAlunos(int numeroAlunos){
        this.numeroAlunos = numeroAlunos;
    }
    
    public String toString(){
        return "\t- - - Universidade - - -" +
                "\n\tnome: " + getNome() +
                "\n\tcidade: " + getCidade() +
                "\n\testado: " + getEstado() + 
                "\n\tpaís: " + getPais() + 
                "\n";
    }
}
