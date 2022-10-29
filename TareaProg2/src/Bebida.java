
public abstract class Bebida{

    private int Serie;

    public Bebida(int s){
        Serie = s;
    }

    public int getSerie() {
        return Serie;
    }

    public String beber(){
        return "sabor: ";
    }

}

class Sprite extends Bebida {

    public Sprite(int Serie) {
        super(Serie);
    }
    public String beber(){
        return super.beber() + "sprite";

    }
}

class CocaCola extends Bebida {

    public CocaCola(int Serie) {
        super(Serie);
    }

    public String beber(){
        return super.beber() + "cocacola";
    }
}

class Fanta extends Bebida {

    public Fanta(int Serie) {
        super(Serie);
    }

    public String beber(){
        return super.beber() + "fanta";
    }
}
