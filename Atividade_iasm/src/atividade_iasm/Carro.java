/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_iasm;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Carro {
    Scanner sc = new Scanner(System.in);
    public int status;
    
    String cor;
    String marca;
    String modelo;
    int num_passageiros;
    double cap_combustivel;
    double consumo;
    
    public void setLigaCarro(){
        System.out.println("Deseja ligar o carro? 1 para sim e 2 para nao");
        //opção que vai armazenar o que o usurio digitar.
        int op = sc.nextInt();
        
        //tratament de erro
        while(op != 1 && op != 2){
            System.out.println("Digite uma opcao valida, 1 para sim e 2 para não!");
            op = sc.nextInt();
            
        //condições para cada caso (1 e 2)    
        }
        if(op == 1){
            System.out.println("Seu carro esta ligado vrum vrum!");          
        }
        else if(op == 2){
            System.out.println("Seu carro esta desligado!");
        }
        
        //pode ser usado epois para saber se o carro esta ligado ou desligado.
        status = op;
    }
    public void setStatus(){
        System.out.println("confira o status do carro 1 para continuar!");
        int op2 = sc.nextInt();
        
         //tratamento de erro.
        while(op2 != 1){
            System.out.println("Digite uma opcao valida 1 para ok");
            op2 = sc.nextInt();
        }
       //condições para 1 e 2
        if(op2 == 1){
           if(status == 1){
               System.out.println("Seu carro continua ligado!");
           }
        if(op2 == 1){
            if(status == 2){
                System.out.println("Seu carro esta desligado");
            }
        }
        
           }
        }
    }

