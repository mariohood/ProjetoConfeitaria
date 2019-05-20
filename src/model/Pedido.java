package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
   
    private String nome;
    
    public List<Bolo> bolos = new ArrayList<Bolo>();
    
    public Pedido(String nome){
        this.nome = nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public List<Bolo> bolos(){
        return bolos;
    }
    
    public void adicionaBolo(Bolo b){
        bolos.add(b);
    }
    
    public double totalProteinas(){
        double totalProteinas = 0;
        for(Bolo b : bolos){
            for(Ingrediente i: b.ingredientes()){
                totalProteinas = totalProteinas + i.getProduto().getProteina();
            }
        }
        return totalProteinas;
    }
    
    public double totalCalorias(){
        double totalCalorias= 0;
        for(Bolo b : bolos){
            totalCalorias = totalCalorias + b.totalCalorias();
        }
        return totalCalorias;
        
    }
  
}//Fim Pedido


















