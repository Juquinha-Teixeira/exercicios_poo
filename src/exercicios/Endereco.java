package exercicios;

public class Endereco {
    
    private String logradouro;
    private String cep;
    private int numero;
    
    Endereco(){}
    
    Endereco(String logradouro, String cep, int numero){
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
    }
    
    public String getLogradouro(){
        return logradouro;
    }
    
    public String getCEP(){
        return cep;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public void setCEP(String cep){
        this.cep = cep;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String toString(){
        return "\t- - - Endereco - - -" +
                "\n\tlogradouro: " + getLogradouro() +
                "\n\tcep: " + getCEP() +
                "\n\tnumero: " + getNumero() + 
                "\n";
    }
}
