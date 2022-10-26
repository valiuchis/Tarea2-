
class CocaCola extends Bebida {
    
    public CocaCola (int serie) {
        
        super(serie);
        
    }
    
    public String Beber () {
        
        String s = new String(super.Beber() + "CocaCola");
        return s;
        
    }
}
