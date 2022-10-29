
    
package tarea2;

/**
 *
 * @author petroman
 */
public class Cliente{

    //Al crear el cliente, comprará la bebida con los datos que se le indiquen.
    public Cliente(Pago pago, int bebida, Expendedor expToUse){
        expToUse.comprarBebida(pago, Soda);
    }

    //creamos un metodo pa comprar bebida
    
    public void Transaccion(Moneda moneda, int bebida,Expendedor expToUse){
        expToUse.comprarBebida(moneda, bebida);
    }
    

}
