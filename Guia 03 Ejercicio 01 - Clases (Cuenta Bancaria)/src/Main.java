/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("Guía 03 Clases Cuenta Bancaria");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuentaBancaria = new CuentaBancaria("Juan");
        c.println("Saldo: " + cuentaBancaria.getSaldo());
        c.println(cuentaBancaria.depositar(5000));
        c.println("Saldo: " + cuentaBancaria.getSaldo());
        c.println(cuentaBancaria.girar(15000));
        c.println("Saldo: " + cuentaBancaria.getSaldo());
        c.println(cuentaBancaria.girar(3000));
        c.println("Saldo: " + cuentaBancaria.getSaldo());
    }

}
