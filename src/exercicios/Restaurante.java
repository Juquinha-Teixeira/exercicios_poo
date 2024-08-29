package exercicios;

import java.util.List;

public class Restaurante {
   
    private String nome;
    private String endereco;
    private List<String> pratos;
    
    Restaurante(){}
    
    Restaurante(String nome, String endereço){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String toString(){
        return "\t- - - Restaurante - - -" +
                "\n\tnome: " + getNome() +
                "\n\tendereço: " + getEndereco() +
                "\n\tpratos: " + pratos +
                "\n";
    }
}
