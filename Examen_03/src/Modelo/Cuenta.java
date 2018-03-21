/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author leonardo
 */
public class Cuenta {
    private int numero_cuenta;
    private String Cliente;
     private String tipo_cuenta;
    private String movimiento;
     private String fecha;
    private String saldo;

    public Cuenta() {
    }

    public Cuenta(int numero_cuenta, String Cliente,String  tipo_cuenta, String movimiento, String fecha, String saldo) {
        this.numero_cuenta = numero_cuenta;
        this.Cliente = Cliente;
        this.tipo_cuenta = tipo_cuenta;
        this.movimiento = movimiento;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return numero_cuenta + " " + Cliente + " " + tipo_cuenta + " " + movimiento + " " + fecha + "  " + saldo ;
    }
    
    
}
