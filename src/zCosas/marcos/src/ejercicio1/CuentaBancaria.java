package zCosas.marcos.src.ejercicio1;

public class CuentaBancaria {
    private final String titular;
    private final double sueldo;
    private double totalDinero;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(String titular, double sueldo, double totalDinero, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.sueldo = sueldo;
        this.totalDinero = totalDinero;
        this.tipoCuenta = tipoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getTotalDinero() {
        return totalDinero;
    }

    public void setTotalDinero(double totalDinero) {
        this.totalDinero = totalDinero;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void realizarTransaccion(double monto, int tipoTransaccion) {
        if (tipoTransaccion == 1) { //agregar
            this.totalDinero += monto;
        } else if (tipoTransaccion == 2) { //retirar
            this.totalDinero -= monto;
        }
    }

    public final void calcularInteres() {
        if (this.tipoCuenta == TipoCuenta.AHORRO) {
            this.totalDinero += this.totalDinero * 0.05;
        } else if (this.tipoCuenta == TipoCuenta.CORRIENTE) {
            this.totalDinero += this.totalDinero * 0.03;
        } else if (this.tipoCuenta == TipoCuenta.EMPRESARIAL) {
            this.totalDinero += this.totalDinero * 0.01;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", sueldo=" + sueldo +
                ", gettotalDinero=" + totalDinero +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }
}
