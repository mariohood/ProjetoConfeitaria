
package model;

public interface InterfaceDAO {
    
    public abstract boolean inserir(Object obj);
    public boolean excluir(Object obj);
    public boolean editar(Object obj);
    public boolean pesquisar(Object obj);
    
}
