package model;


public class BoloVegano extends Bolo {

    public BoloVegano(int codBolo, String nome) {
        super(codBolo, nome);
    }

    

    @Override
    public float caloriaAdicional() {//O bolo vegano por não conter alimentos de origen animal ele resta calorias 
        return -100;
    }
    
    
        
}
