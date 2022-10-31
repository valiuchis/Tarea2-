
package tareaprog2;

public class TareaProg2 {

    public static void main(String[] args) {
        Moneda cien = new MonedaCien();
        Expendedora maquinaExpendedora = new Expendedora(6,1000);
        Cliente valeria = new Cliente(cien,2,maquinaExpendedora);
        valeria.compraBebida();
        System.out.println(valeria.saborBebida());
        System.out.println(maquinaExpendedora.calcularVuelto());
   
    }
    
}
