import java.util.ArrayList;

public class DepositoBebidas {
    
    private ArrayList <Bebida> bodega;
    
    public DepositoBebidas () {
        
        bodega = new ArrayList <Bebida> ();
    }
    
    public void agregaBebida (Bebida b) {
        bodega.add(b);
    }
    
    public Bebida getBebida () {
        
        if (bodega.size() <= 0) {
            return null; 
        } else {
            return bodega.remove(0);
        }
    }
    
    public int cantidadBebida () {
            
            return bodega.size();
        }
}
    
    

