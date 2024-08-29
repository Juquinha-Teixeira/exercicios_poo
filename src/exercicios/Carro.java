package exercicios;

public class Carro {
    
    private String marca;
    private int ano;
    private String cor;
    private String modelo;
    
    Carro(){}
    
    Carro(String marca, int ano, String cor, String modelo){
        this.marca = marca;
        this.ano = ano;
        this.cor =  cor;
        this.modelo = modelo;
    }
    
    public void powerOn(){
        System.out.println("O carro está ligado!");
    }
    
    public void powerOff(){
        System.out.println("O carro está desligado!");
    }
    
     public void isRunnig(){
        System.out.println("O carro está acelerando!");
    }
    
    public void isBreak(){
        System.out.println("O carro está freiando!");
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setMarca(String marca){
        this.marca =  marca;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String toString(){
        return "\t- - - Carro - - -" +
                "\n\tmarca: " + getMarca() +
                "\n\tano: " + getAno() +
                "\n\tcor: " + getCor() + 
                "\n\tmodelo: " + getModelo() +
                "\n";
    }
}
