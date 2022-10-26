
abstract class Bebida {
    
    private int serie;
    
    public Bebida (int serie) {
        this.serie = serie;
    }
    
    public int getSerie () {
        return serie;
    }
    
    public String Beber () {
        String s = new String ("Bebida: ");
        return s;
    }
    
}
