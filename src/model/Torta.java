package model;


public class Torta extends Bolo{

    public Torta (String nome){
        super(nome);
    }
    @Override
    public float caloriaAdicional() {// incrementa a cantidade de calorias en 200
        return 200;
    }
    
}
