
    
package tarea2;

/**
 *
 * @author petroman
 */
public class Cliente{

    
    public Cliente(Pago pago, int bebida, Expendedor expToUse){
        expToUse.comprarBebida(pago, Soda);
    }

    //creamos un metodo pa comprar bebida,no se si sirvio mucho en realidad ajaja
    
    public void Transaccion(Moneda moneda, int bebida,Expendedor expToUse){
        expToUse.comprarBebida(moneda, bebida);
    }
    

}
