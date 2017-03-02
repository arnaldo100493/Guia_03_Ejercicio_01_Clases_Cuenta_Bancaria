/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class CuentaBancaria {

    private String nombre;
    private int saldo;

    public CuentaBancaria() {
        this.nombre = "";
        this.saldo = 0;
    }

    public CuentaBancaria(String nombre) {
        this.nombre = nombre;
        this.saldo = 0;
    }

    public CuentaBancaria(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.nombre = cuentaBancaria.getNombre();
        this.saldo = cuentaBancaria.getSaldo();
    }

    public String depositar(int monto) {
        if (monto > 0) {
            this.saldo += monto;
            return "Depósito Realizado Correctamente.";
        }
        return "Error en el depósito.";
    }

    public String girar(int monto) {
        if (monto > 0) {
            if (monto <= this.saldo) {
                this.saldo -= monto;
                return "Giro Realizado Correctamente.";
            } else {
                return "Fondos insuficientes.";
            }

        }
        return "Error en el giro.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
