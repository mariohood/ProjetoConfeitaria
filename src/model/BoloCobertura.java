package model;


public class BoloCobertura extends Bolo{

    public BoloCobertura(int codBolo, String nome) {
        super(codBolo, nome);
    }

    
    
    

    @Override
    public float caloriaAdicional() {// incrementa a cantidade de calorias en 100
        return 100;
    }
    
   
    
    
}
