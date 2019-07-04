
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
        BoloCobertura ob = (BoloCobertura)obj;
              
            if(bolosCobertura.remove(ob)){ // método "remove" remove a primeira ocorrência do objeto encontrada dentro da lista
                return true;
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

   public BoloCobertura buscarBolo(int codigo){
        for(int i = 0 ; i < bolosCobertura.size() ; i++){
            BoloCobertura bolo = bolosCobertura.get(i);
           if(codigo == bolo.getCodBolo()){
               return bolo; 
           }     
        } 
        return null; 
    }
    
    
    

   
    
    
    
    
}
