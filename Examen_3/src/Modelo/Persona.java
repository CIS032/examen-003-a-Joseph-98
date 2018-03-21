/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andres
 */
public class Persona {

    private int num_Cuenta;
    private String cliente;
    private String tipo_Cuenta;
    private String movimiento;
    private String fecha;
    private double saldo;

    public Persona() {
    }

    public Persona(int num_Cuenta, String cliente, String tipo_Cuenta, String movimiento, String fecha, double saldo) {
        this.num_Cuenta = num_Cuenta;
        this.cliente = cliente;
        this.tipo_Cuenta = tipo_Cuenta;
        this.movimiento = movimiento;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public int getNum_Cuenta() {
        return num_Cuenta;
    }

    public void setNum_Cuenta(int num_Cuenta) {
        this.num_Cuenta = num_Cuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipo_Cuenta() {
        return tipo_Cuenta;
    }

    public void setTipo_Cuenta(String tipo_Cuenta) {
        this.tipo_Cuenta = tipo_Cuenta;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return num_Cuenta + " " + cliente + " " + tipo_Cuenta + " " + movimiento + " " + fecha + " " + saldo;
    }

}
