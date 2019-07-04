
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TortaDAO implements InterfaceDAO {
    
   
    private ArrayList<Torta> tortas = new ArrayList();

    @Override
    public boolean inserir(Object obj) {
        Torta b = (Torta) obj;
        return (getTortas().add(b));    }

    @Override
     public boolean excluir(Object obj) {
        Torta ob = (Torta)obj;
        
            if(tortas.remove(ob)){ // método "remove" remove a primeira ocorrência do objeto encontrada dentro da lista
                return true;
            }
           
        return false;
    }

    @Override
    public boolean editar(Object obj) {
       /* 
         
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
            
            if(obj.equals(getTortas().get(i))){
                System.out.println(getTortas().toString());
                return true;
            }
           
        }
        return false;
    }

    /**
     * @return the Tortas
     */
    public ArrayList<Torta> getTortas() {
        return tortas;
    }
    
    public Torta buscarBolo(int codigo){
        for(int i = 0 ; i < tortas.size() ; i++){
            Torta bolo = tortas.get(i);
           if(codigo == bolo.getCodBolo()){
               return bolo; 
           }     
        } 
        return null; 
    }

   
    
    
}
