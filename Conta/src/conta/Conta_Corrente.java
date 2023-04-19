/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Conta_Corrente {
    Scanner sc = new Scanner(System.in);
    
    int num;
    double saldo;
    String status;
    double limite;
    
    public void setSaque(){
        //variaveis da conta
        num = 1;
        saldo = 1000;
        status = "especial";
        limite = 1000;
        
        
        System.out.println("Bem-vindo ao banco suspeito"+"\ndeseja fazer qual das opcoes abaixo?");
        System.out.println("[1]Sacar"+"\n[2]Depositar"+"\n[3]Ver saldo");
        int op = sc.nextInt();
        
        
    }
}
