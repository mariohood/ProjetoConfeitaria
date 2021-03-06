package model;


import java.util.ArrayList;
import java.util.List;


public abstract class Bolo {
    
    //Atributo
    private int idBolo;
    private int codBolo;
    private String nome;
    private double preco;

    //lista de ingredientes del bolo caso seja solicitado
    private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    //lista de ingredientes del bolo caso seja solicitado
    
    private ArrayList<Sabor> sabores = new ArrayList<Sabor>();
    //As pesquisas serão feitas por sabores
    
//adiciona ou sustrai calorias das clases filhas BoloCobertura, Torta e BoloVegano
    public abstract float caloriaAdicional();
    
    //Construtor

    public Bolo(int codBolo, String nome) {
        this.codBolo = codBolo;
        this.nome = nome;
    }
    
    
    //Metodos
    public String getNome(){
        return nome;
    }
    public List<Ingrediente> ingredientes(){
        return getIngredientes();
    }
    
    //outros metodos
    public void adicionaIngrediente(Ingrediente ing){
        getIngredientes().add(ing);
    }
    
    public double totalGorduras(){
        double totalGordura = 0;
        for(Ingrediente ing : getIngredientes()){
             totalGordura = totalGordura +(ing.getQuantidade() * ing.getProduto().getGordura());
        }
        return totalGordura;
    }
    
    public double totalCalorias(){
        double totalCalorias = 0;
        for(Ingrediente ing : getIngredientes()){
            totalCalorias = totalCalorias + ing.calorias();
        }
        totalCalorias = totalCalorias + caloriaAdicional();
        return totalCalorias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<Sabor> getSabores() {
        return sabores;
    }

    public void inserirSabor(Sabor sabor) {
        getSabores().add(sabor);
    }

    public int getCodBolo() {
        return codBolo;
    }

    public void setCodBolo(int codBolo) {
        this.codBolo = codBolo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}//Fim Bolo
