
package Cuenta;

public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        cantidad=0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad >= 0) {
            
            this.cantidad = cantidad;
            
        } else {
            this.cantidad = 0;
        }
        
    }
    

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }
     public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
    }}
    public void retirar(double cantidad) {
        if (cantidad > 0 && this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        }}
}
    
    
 