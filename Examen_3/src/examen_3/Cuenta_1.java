/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "CUENTA", catalog = "", schema = "EXAMEN")
@NamedQueries({
    @NamedQuery(name = "Cuenta_1.findAll", query = "SELECT c FROM Cuenta_1 c")
    , @NamedQuery(name = "Cuenta_1.findByNumCuenta", query = "SELECT c FROM Cuenta_1 c WHERE c.numCuenta = :numCuenta")
    , @NamedQuery(name = "Cuenta_1.findByCliente", query = "SELECT c FROM Cuenta_1 c WHERE c.cliente = :cliente")
    , @NamedQuery(name = "Cuenta_1.findByTipoCuenta", query = "SELECT c FROM Cuenta_1 c WHERE c.tipoCuenta = :tipoCuenta")
    , @NamedQuery(name = "Cuenta_1.findByMovimiento", query = "SELECT c FROM Cuenta_1 c WHERE c.movimiento = :movimiento")
    , @NamedQuery(name = "Cuenta_1.findByFecha", query = "SELECT c FROM Cuenta_1 c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cuenta_1.findBySaldo", query = "SELECT c FROM Cuenta_1 c WHERE c.saldo = :saldo")})
public class Cuenta_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUM_CUENTA")
    private Integer numCuenta;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private String cliente;
    @Basic(optional = false)
    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;
    @Basic(optional = false)
    @Column(name = "MOVIMIENTO")
    private String movimiento;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "SALDO")
    private double saldo;

    public Cuenta_1() {
    }

    public Cuenta_1(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Cuenta_1(Integer numCuenta, String cliente, String tipoCuenta, String movimiento, Date fecha, double saldo) {
        this.numCuenta = numCuenta;
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.movimiento = movimiento;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        Integer oldNumCuenta = this.numCuenta;
        this.numCuenta = numCuenta;
        changeSupport.firePropertyChange("numCuenta", oldNumCuenta, numCuenta);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        String oldTipoCuenta = this.tipoCuenta;
        this.tipoCuenta = tipoCuenta;
        changeSupport.firePropertyChange("tipoCuenta", oldTipoCuenta, tipoCuenta);
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        String oldMovimiento = this.movimiento;
        this.movimiento = movimiento;
        changeSupport.firePropertyChange("movimiento", oldMovimiento, movimiento);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        double oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numCuenta != null ? numCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta_1)) {
            return false;
        }
        Cuenta_1 other = (Cuenta_1) object;
        if ((this.numCuenta == null && other.numCuenta != null) || (this.numCuenta != null && !this.numCuenta.equals(other.numCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "examen_3.Cuenta_1[ numCuenta=" + numCuenta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
