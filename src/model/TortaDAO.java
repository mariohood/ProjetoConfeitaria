
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TortaDAO implements InterfaceDAO {
    
   
    private ArrayList<BoloCobertura> Tortas = new ArrayList();

    @Override
    public boolean inserir(Object obj) {
        BoloCobertura b = (BoloCobertura) obj;
        return (Tortas.add(b));    }

    @Override
    public boolean excluir(Object obj) {
        Object ob = (BoloCobertura)obj;
        for(int i = 0 ; i < 10 ; i++){          
            if(ob.equals(Tortas.get(i))){
                Tortas.remove(i);
                return true;
            }
           
        }
        return false;
    }

    @Override
    public boolean editar(Object obj) {
       /* 
         
        String nomeBolo = JOptionPane.showInputDialog("Novo nome do bolo: ");
        BoloCobertura bc = new BoloCobertura (nomeBolo);
        
        Ingrediente ingB1_1,ingB1_2,ingB1_3, ingB1_4, ingB1_5;
    ingB1_1 = new Ingrediente(60,farinha);
    ingB1_2 = new Ingrediente(80,leite);
    ingB1_3 = new Ingrediente(50,manteiga);
    ingB1_4 = new Ingrediente(60,acucar);
    ingB1_5 = new Ingrediente(40,milho);
    bolo1.adicionaIngrediente(ingB1_1);
    bolo1.adicionaIngrediente(ingB1_2);
    bolo1.adicionaIngrediente(ingB1_3);
    bolo1.adicionaIngrediente(ingB1_4);
    bolo1.adicionaIngrediente(ingB1_5);
        
    


        for(int i = 0 ; i < 10 ; i++){
            
            if(obj.equals(Tortas.get(i))){
                Tortas.remove(i);
                Tortas.add((BoloCobertura) obj);
                return true;
            }
           
        }

*/
        return false;
        
    }

    @Override
    public boolean pesquisar(Object obj) {

         for(int i = 0 ; i < 10 ; i++){
            
            if(obj.equals(Tortas.get(i))){
                System.out.println(Tortas.toString());
                return true;
            }
           
        }
        return false;
    }

   
    
    
}
