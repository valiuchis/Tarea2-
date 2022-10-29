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
        
        if (bodega.size() != 0) {
            return bodega.remove(0);
        } else {
            return null; 
        }
    }
    
    public int cantidadBebida () {
            
            return bodega.size();
        }
///tambien la podriamos hacer tipo booleana valeria...
/*
    public Boolean cantidadBebida(){
    
        if(bodega.size() != 0){
            return true;    
        }else{
            return false;
        }    
    }
*/
}
    
    

