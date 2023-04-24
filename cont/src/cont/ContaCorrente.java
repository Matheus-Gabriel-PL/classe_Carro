/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cont;

/**
 *
 * @author mathe
 */
public class ContaCorrente {
    
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public void dep(double valor) {
        saldo += valor;
    }

    public void sac(double valor) {
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public double consultSaldo() {
        return saldo;
    }

    public boolean ChequeEspecial() {
        return saldo < 0;
    }
   
}
    

