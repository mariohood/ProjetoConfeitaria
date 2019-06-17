
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BoloVeganoDAO implements InterfaceDAO {
    private ArrayList<BoloVegano> bolosVeganos = new ArrayList();

    @Override
    public boolean inserir(Object obj) {
        BoloVegano b = (BoloVegano) obj;
        return (getBolosVeganos().add(b));    }

    @Override
    public boolean excluir(Object obj) {
        Object ob = (BoloVegano)obj;
        for(int i = 0 ; i < 10 ; i++){          
            if(ob.equals(getBolosVeganos().get(i))){
                getBolosVeganos().remove(i);
                return true;
            }
           
        }
        return false;
    }

    @Override
    public boolean editar(Object obj) {
        
        /*
        
         
       

        for(int i = 0 ; i < 10 ; i++){
            
            if(obj.equals(BoloVegano.get(i))){
                BoloVegano.remove(i);
                BoloVegano.add((BoloCobertura) obj);
                return true;
            }
           
        }

*/
        return false;
        
    }

    @Override
    public boolean pesquisar(Object obj) {

         for(int i = 0 ; i < 10 ; i++){
            
            if(obj.equals(getBolosVeganos().get(i))){
                System.out.println(getBolosVeganos().toString());
                return true;
            }
           
        }
        return false;
    }

    /**
     * @return the bolosVeganos
     */
    public ArrayList<BoloVegano> getBolosVeganos() {
        return bolosVeganos;
    }

    

   
    
    
}
