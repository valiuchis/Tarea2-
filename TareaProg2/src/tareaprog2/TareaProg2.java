
package tareaprog2;

public class TareaProg2 {

    public static void main(String[] args) {
        
        System.out.println("Caso 1:");
        Moneda mil = new MonedaMil();
        Expendedora maquinaExpendedora2 = new Expendedora(3,500);
        Cliente Matias = new Cliente(mil,1,maquinaExpendedora2);
        Matias.compraBebida();
        System.out.println(Matias.saborBebida());
        System.out.println("El vuelto es: " + maquinaExpendedora2.calcularVuelto() + "$");
        
        System.out.println("Caso 2:");
        Moneda cien = new MonedaCien();
        Expendedora maquinaExpendedora = new Expendedora(6,1000);
        Cliente Valeria = new Cliente(cien,2,maquinaExpendedora);
        Valeria.compraBebida();
        System.out.println(Valeria.saborBebida());
        System.out.println(maquinaExpendedora.calcularVuelto());
        
   
    }
    
}
