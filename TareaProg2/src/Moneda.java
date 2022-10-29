
abstract class Moneda {
    
    public int valor;
    
    public Moneda () {
        super ();
    }
    
    public abstract int getValor ();//es abstract creo...
      //  return valor; aqui en esta clase no se hace return de nada
    
    public abstract String toString();//imprimir info de moneda
}

class MonedaCien extends Moneda {
    //habra que hacer override en cada metodo??, creo que si
    public MonedaCien () {
        super ();
        valor = 100;
    }
    //creo que aqui si va override, trata de probarlo valeria / :)
    @Override
    public int getValor () {
        return valor;
    }
    @Override    
     public String toString(){
        return "Cancela con :"+ getValor();//print mensaje de info
     }

}

class MonedaQuinientos extends Moneda {
    
    public MonedaQuinientos () {
        super ();
        valor = 500;
    }
    @Override
    public int getValor () {
        return valor;
    }
    @Override    
     public String toString(){
        return "Cancela con :"+getValor();//print mensaje de info
    }
}

class MonedaMil extends Moneda {

    public MonedaMil () {
        super ();
        valor = 1000;
    }
    @Override
    public int getValor () {
        return valor;
    }
    @Override
    public String toString(){
    return "Cancela con: "+getValor();    
    }
}
//Se hace moneda de 1500 o no?? 


