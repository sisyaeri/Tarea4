package cuentas;
/**
 * Clase encargada del gestionar las cuentas de los clientes de banco
 * 
 * @author David Diaz
 * @version 1.1
 * @since 02/05/2024
 */

public class CCuenta {
  
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
    * Metodo constructor de la cuenta si rellenar atributos.
    */
     
    public CCuenta()
    {
    }
    /**
     * Metodo constructor de la cuenta rellenado atributos.
     * @param nom Nombre del titular de la cuenta
     * @param cue Numeración de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interes renumerado de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**Metodo para obtener el saldo de la cuenta
    *@return Saldo de la cuenta
    */
    public double estado()
    {
        return getSaldo();
    }
    /**Metodo para retiradas de saldo de la cuenta
     * @param cantidad La cantidad a retirar de la cuenta
     */
    public void retirar(double cantidad) 

    {try {
        
        System.out.println("Retiro en cuenta:" + cantidad);

        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    /**Metodo para ingresos de saldo de la cuenta
     * @param cantidad La cantidad a ingresar en la cuenta
     */
    public void ingresar(double cantidad) 

        {try {
        System.out.println("Ingreso en cuenta:" + cantidad);
        
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
            setSaldo(getSaldo() + cantidad);

        } catch (Exception e) {
            System.out.println(e);

        }
        }

    /**
     * Devuelve titular de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna titular a la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve numero de cuenta a la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Asigna numero de cuenta a la cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve saldo de la cuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Asigna saldo a la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve tipo de interes a la cuenta
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Asigna tipo de interes a la cuenta
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
