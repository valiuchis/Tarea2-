
abstract class Moneda {
    
    public int valor;
    
    public Moneda () {
        super ();
    }
    
    public int getValor () {
        return valor;
    }
}

class monedaCien extends Moneda {
    
    public monedaCien () {
        super ();
        valor = 100;
    }
    
    public int getValor () {
        return valor;
    }
}

class monedaQuinientos extends Moneda {
    
    public monedaQuinientos () {
        super ();
        valor = 500;
    }
    
    public int getValor () {
        return valor;
    }
}

class monedaMil extends Moneda {
    
    public monedaMil () {
        super ();
        valor = 1000;
    }
    
    public int getValor () {
        return valor;
    }
}


