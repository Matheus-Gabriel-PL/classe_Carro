/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_01;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Lampada {
    Scanner sc = new Scanner(System.in);
    public String status;
    String marca;
    String modelo;
    int potencia;
    String tipo;
    
    public void setLigaLampada(){
        
       
        //inicio do programa
        System.out.println("Você emtra em um quarto escuro!");
        System.out.println("digite 1 para ligar a lampada ou 2 para sair do quarto.");
        int op1 = sc.nextInt();
        int op2;
        
        //tratamento de erro
       while(op1 != 1 && op1 !=2){
           System.out.println("Digite um número valido 1 para ligar a lampada ou 2 para sair do quarto");
           op1 = sc.nextInt();
       }
       //condições para 1 e 2
       if(op1 == 1){
           System.out.println("Parabens voce nao esta mais no escuro, pegou oq precisava no quarto");
       }
       else if(op1 == 2){
           System.out.println("Saiu sem pegar o que precisava do quarto por falta de iniciativa de ligar uma lampada");
       }
        //saber se quer deligar a lampada
         System.out.println("Vai desligar a luz depois de sair do quarto?1 para sim e 2 para nao");
       op2 = sc.nextInt();
       
       if(op2 == 1 && op1 == 2){
           System.out.println("A luz esta desligada");
           status = "Lampada desligada";
    }
       else if(op2 == 2 && op1 == 1){
           System.out.println("A lampada esta ligada");
           status = "Lampada ligada";
       }
       else if(op1 == 1 && op2 == 1){
           status = "Lampada desligada";
       }
       else if(op1 == 2 && op2 == 2){
           status = "Lampada desligada";
       }
   
    }
    public void setStatus(){
        System.out.println("Veja se a lampada esta ligada ou nao!Digite 1 para saber.");
        int op = sc.nextInt();
        
        while(op != 1){
            System.out.println("Digite a opcao valida, opcao valida = 1");
            op = sc.nextInt();
        }
        if(op == 1){
            System.out.println(status);
        }
    }
}
