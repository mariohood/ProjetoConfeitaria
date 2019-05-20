package model;


import java.util.ArrayList;
import java.util.List;


public abstract class Bolo {
    
    //Atributo
    private String nome;
    
    //lista de ingredientes del bolo caso seja solicitado
    public List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    
//adiciona ou sustrai calorias das clases filhas BoloCobertura, Torta e BoloVegano
    public abstract float caloriaAdicional();
    
    //Construtor
    public Bolo (String nome){
        this.nome = nome;
    }
    
    //Metodos
    public String getNome(){
        return nome;
    }
    public List<Ingrediente> ingredientes(){
        return ingredientes;
    }
    
    //outros metodos
    public void adicionaIngrediente(Ingrediente ing){
        ingredientes.add(ing);
    }
    
    public double totalGorduras(){
        double totalGordura = 0;
        for(Ingrediente ing : ingredientes){
             totalGordura = totalGordura +(ing.getQuantidade() * ing.getProduto().getGordura());
        }
        return totalGordura;
    }
    
    public double totalCalorias(){
        double totalCalorias = 0;
        for(Ingrediente ing : ingredientes){
            totalCalorias = totalCalorias + ing.calorias();
        }
        totalCalorias = totalCalorias + caloriaAdicional();
        return totalCalorias;
    }
    
}//Fim Bolo
