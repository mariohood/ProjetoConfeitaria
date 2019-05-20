package model;


public class Produto {
   
    //Atributos
    private String nome;
    private double carboidrato;
    private double proteina;
    private double gordura;
    public double calorias;
    

    //Construtor
    public Produto(String nome, double carboidrato, double proteina, double gordura) {
        this.nome = nome;
        this.carboidrato = carboidrato;
        this.proteina = proteina;
        this.gordura = gordura;
    }
    
    //Metodos
    public String getNome(){
        return nome;
    }
    
    public double getCarboidrato(){
        return carboidrato;
    }
    
    public double getProteina(){
        return proteina;
    }
    
    public double getGordura(){
        return gordura;
    }
    
    public double calorias(){
    return 4*this.carboidrato + 5*this.proteina + 6*this.gordura;
    }
    
}//fim Produto
