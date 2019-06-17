package model;


public class Torta extends Bolo{

    public Torta(int codBolo, String nome) {
        super(codBolo, nome);
    }

   
    @Override
    public float caloriaAdicional() {// incrementa a cantidade de calorias en 200
        return 200;
    }
    
}
