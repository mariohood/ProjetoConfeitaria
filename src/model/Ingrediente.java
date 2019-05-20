package model;


public class Ingrediente {
    
    //Atributos
    private double quantidade;
    private Produto produto;
    
    //Construtor
    public Ingrediente(double quantidade, Produto produto){
        if (produto == null){
            throw new IllegalArgumentException("Produto não existe");
        }
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    //Metodos
    public double getQuantidade(){
        return quantidade;
    }
    
    public Produto getProduto(){
        return produto;
    }
    
    public double calorias(){
        return quantidade*produto.calorias;
    }
   
}//Fim Ingrediente
