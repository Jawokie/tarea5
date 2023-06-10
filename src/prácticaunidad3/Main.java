/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

/**
 *
 * @author ED05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        opoerativa_cuenta();
    }

    public static void opoerativa_cuenta() {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        try 
        {
            cuenta1.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = cuenta1.getEstado();
        System.out.println("El saldo actual es "+ saldoActual );
        
        
        //Ejercicio 1.4 y 1.5
        int ingreso = 2000;
        int retirada = 4000;
        try
        {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(ingreso);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }        saldoActual = cuenta1.getEstado();
        System.out.println("El saldo actual es "+ saldoActual );
        //Aqui intentamos retirar una cantidad mayor que la del saldo actual y salta la excepcion
        try
        {
            System.out.println("Retirada en cuenta");
            cuenta1.retirar(retirada);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }        saldoActual = cuenta1.getEstado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

}
