
package view;

import java.util.List;
import model.Bolo;
import model.BoloCobertura;
import model.BoloVegano;
import model.Pedido;
import model.Torta;


public class Tela {
    public void imprimeBolos(List<Bolo>bolos){
        for(Bolo b : bolos){
            if(b instanceof BoloCobertura){
                System.out.println("Nome : " + b.getNome());
            } else if (b instanceof Torta){
                System.out.println("Nome : " + b.getNome());
            } else if (b instanceof BoloVegano){
                System.out.println("Nome : " + b.getNome());
            }
        }   
    }//Fim imprime Bolos
    
    public void imprimePedido(List<Pedido>pedidos){
        for(Pedido p : pedidos){
        System.out.println("Pedido : " + p.getNome());
        }
    }//Fim Pedido
}//fim Tela
