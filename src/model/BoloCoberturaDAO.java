
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BoloCoberturaDAO implements InterfaceDAO {
    
    private ArrayList<BoloCobertura> bolosCobertura = new ArrayList();

    @Override
    public boolean inserir(Object obj) {
        BoloCobertura b = (BoloCobertura) obj;
        return (getBolosCobertura().add(b));    }

    @Override
    public boolean excluir(Object obj) {
        Object ob = (BoloCobertura)obj;
        for(int i = 0 ; i < 10 ; i++){          
            if(ob.equals(getBolosCobertura().get(i))){
                getBolosCobertura().remove(i);
                return true;
            }
           
        }
        return false;
    }

    @Override
    public boolean editar(Object obj) {
        
         /*
        
        for(int i = 0 ; i < 10 ; i++){
            
            if(obj.equals(bolosCobertura.get(i))){
                bolosCobertura.remove(i);
                bolosCobertura.add((BoloCobertura) obj);
                return true;
            }
           
        }

*/
        return false;
        
    }

    @Override
    public boolean pesquisar(Object obj) {

         for(int i = 0 ; i < 10 ; i++){
            /*
            if(obj.equals(getBolosCobertura().get(i))){
                System.out.println(getBolosCobertura().toString());
                return true;
            }
           */
            
            
        }
        return false;
    }

   
    public ArrayList<BoloCobertura> getBolosCobertura() {
        return bolosCobertura;
    }

   
    
    
    

   
    
    
    
    
}
