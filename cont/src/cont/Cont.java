/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cont;

/**
 *
 * @author mathe
 */
public class Cont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1, 1000, false, 1000);

        conta.dep(500);
        System.out.println("Saldo após depósito: " + conta.consultSaldo());

        conta.sac(1200);
        System.out.println("Saldo após saque: " + conta.consultSaldo());

        if (conta.ChequeEspecial()) {
            System.out.println("Conta usando cheque especial");
        } else {
            System.out.println("Conta não usando cheque especial");
        }
    }
    
}
