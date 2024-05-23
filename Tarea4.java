package cuentas;

public class Tarea4 {      
    public static void main(String[] args) {
        // TODO code application logic here
    CCuenta cuenta1;
    double saldoActual;

    cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
    saldoActual = cuenta1.estado();
    System.out.println("El saldo actual es "+ saldoActual );
 
    operaciones(cuenta1);
        
    saldoActual = cuenta1.estado();
    System.out.println("El saldo actual es "+ saldoActual );
    }
    /**
     * Metodo con las llamadas a los metodos retirar e ingresar
     * @param cuenta1 Cuenta donde se realizan las operaciones
     */
    public static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
/**
    * Metodo constructor por defecto
    */
     
    public Tarea4()
    {
    }   
}