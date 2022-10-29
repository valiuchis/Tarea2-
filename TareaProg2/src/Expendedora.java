
public class Expendedora {
    ////Creo que falta agregar la cantidad de monedas de 100 en el deposito o no?
//revisa lo que hice... y si esta bien puedes hacer eso. Mañana terminamos con el main y GG
    private int cantBebidas;
    private int precioBebidas;
    
    private DepositoBebidas CocaCola;
    private DepositoBebidas Sprite;
    private DepositoBebidas Fanta;
   
    private int cantidadPagar;
    private DepositoMoneda CajaRegistradora;
    private int vuelto;
    
    public Expendedora (int cantidadBebidas, int precioBebidas) {
        
        cantBebidas = this.cantidadBebidas;
        precioBebidas = this.precioBebidas;
        
        CocaCola = new DepositoBebidas ();
        Sprite = new DepositoBebidas ();
        Fanta = new DepositoBebidas ();
        
        for (int i = 0; i < cantBebidas; i++) {
            
            CocaCola.agregaBebida (new CocaCola(100 + i));
            Sprite.agregaBebida (new Sprite (200 + i));
            Fanta.agregaBebida (new Fanta (300 + i));
            
        }
    }
 
    public int getPreciobebidas(){return this.precioBebidas };//estos nos servira mas adelante para el vuelto 

    public void Vuelto(int moneda){//para saber cuantas monedas debemos dar de vuelto   
    
    int total = (moneda - getPreciobebidas());
    int totalMonedas = (total/100); //dividido en 100 poruqw solo son mutiplos de 100 
    
        for (int i = 0; i < total; i++){//con esto entregamos las monedas
            Vuelto.agregarMoneda(new MonedaCien());//creo que esto es lo mismo que de las siguientes lineas
            //MonedaCien cambio = new MonedaCien();
            //CajaRegistradora.agregarMoneda(cambio);

        }   

    }
    public int getVuelto(int moneda){
     return moneda - getPrecioBebidas;
    
    }
    
    public void vueltoString(){
        if(vuelto.listIsEmpty() == false ){//si es distinto de vacio
            System.out.println("Tu vuelto es de -->"+ getVuelto()+"<--"); 
        }else{
            System.out.println("No hay vuelto");
        }
    }

    public void entregarVuelto(){//entregamos el valor del vuelto y removimos las monedas
        vueltoString();
        vuelto.getMoneda();
    }
    
    public void ventaBebida(int codigo ID){
            switch(codigoID){
                case 1: coca.getBebida();
                        System.out.println("Ha comprado una Coca-Cola");
                        break;

                case 2: sprite.getBebida();
                        System.out.println("Ha comprado una Sprite");
                        break;

                case 3: fanta.getBebida();
                        System.out.println("Ha comprado una Fanta");
                        break;
            }
    }

    //aqui empieza lo de cliente, revise y creo que esta todo bien, igual echale un vistazo porfis valeee!!

    public void Transaccion(Moneda moneda, int codigoID){
        
        if( moneda == null){
            try{
                throw new PagoIncorrectoException("Pago Nulo");
            }catch(PagoIncorrectoException mensaje){
                System.out.println(mensaje.getMessage());
            }
        }else{//escojemos la bebida
           
            boolean Aux=false;//este bolean nos servira para ir viendo los casos
            switch(codigoID){
              case 1: booleanAux = coca.cantidadBebida();
                        break;
             case 2: booleanAux = sprite.cantidadBebida();
                        break;
             case 3: booleanAux = fanta.cantidadBebida();
            }

            //realizamos la compra de la bebida
            if(moneda.getValor() == getPrecioBebidas() && Aux){
              
               ventaBebida(Bebida);//la bebida que vamos a comprar

            }else if(moneda.getValor() >= getPrecioBebidas()){

             if(Aux){
                   sacarBebida(codigoID);
                   Vuelto(moneda.getValor());
                }else{
                  try{
                       switch(codigoID){
                        case 1:
                            throw new NoHayBebidasException("No queda CocaCola");
                        case 2:
                            throw new NoHayBebidasException("No queda Sprite");
                        case 3:
                            throw new NoHayBebidasException("No queda Fanta");
                        default:
                            throw new NoHayBebidasException("Seleccione una bebida valida");//aqui por si no escogio alguna
                    }
                    }catch(NoHayBebidasException mensaje){
                        System.out.println("-->Retorno de $"+moneda.getValor()+" pesos.");
                        System.out.println(mensaje.getMessage());
                    }
                }
            }else{ 
                try{
                    if(moneda.getValor() < getPrecioBebidas()){
                        System.out.println("-->Retorno $"+moneda.getValor()+" pesos.");
                        throw new PagoInsuficienteException("No hay saldo suficiente");
                    }
                }catch(PagoInsuficineteException mensaje){
                    System.out.println(mensaje.getMessage());
                }
            }   
        }
    }     

  /*  public Bebida ventaBebida (Moneda coin, int codigoID) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException {
        
        cantidadPagar = coin.getValor();
        
        if (coin.getValor() >= precioBebidas) {
            
            switch (codigoID) {
                case 1 -> {
                    if (CocaCola.cantidadBebida() > 0) {
                        return CocaCola.getBebida(); 
                    } else {
                        throw new NoHayBebidaException ("Producto agotado.");
                    }
                }
                    
                case 2 -> {
                    if (Sprite.cantidadBebida() > 0) {
                        return Sprite.getBebida();
                    } else {
                        throw new NoHayBebidaException ("Producto agotado.");
                    }
                }
                    
                case 3 -> { 
                    if (Fanta.cantidadBebida() > 0) {
                        return Fanta.getBebida();
                    } else {
                        throw new NoHayBebidaException ("Producto agotado.");
                    }
                }
                
                default -> {    
                    return null;
                }
            } 
        }*/

       
       
 /*      
        if (coin.getValor() < precioBebidas) {
            throw new PagoInsuficienteException ("Fondo insuficiente. Por favor, intente de nuevo.");
                }
        
        if (coin == null) {
            throw new PagoIncorrectoException ("Transacción no permitida. Por favor, intente de nuevo");
        }
        
        return null;
        
    }
        
    public int calcularVuelto () {
        vuelto = cantidadPagar - precioBebidas;
        return vuelto;
    }
    
    public void devolverVuelto () {
        
        for (int i = vuelto; i >= 0; i--) {
            vuelto = vuelto - 100;
            MonedaCien cambio = new MonedaCien();
            CajaRegistradora.agregarMoneda(cambio);
        }
    }
    
    public Moneda vueltoFinal () {
        return CajaRegistradora.getMoneda();
    }
*/
}
