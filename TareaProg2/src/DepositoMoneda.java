import java.util.ArrayList;

public class DepositoMoneda {
    
    private ArrayList<Moneda> deposito;
    
    public DepositoMoneda () {
        
        deposito = new ArrayList<Moneda> ();
    }
    
    public void agregarMoneda (Moneda m) {
        
        deposito.add(m);
    }
    
    public Moneda getMoneda () {
        
        if (deposito.size() <= 0) {
            return null;
        } else {
            return deposito.remove(0);
        }
    }
    
    public int tamaño () {
        
        return deposito.size();
    }
}
