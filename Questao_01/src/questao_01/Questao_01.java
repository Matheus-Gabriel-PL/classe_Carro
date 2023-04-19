/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_01;

/**
 *
 * @author mathe
 */
public class Questao_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lampada lp = new Lampada();
       lp.marca = "Generica";
       lp.modelo = "Tubular";
       lp.potencia = 18;
       lp.tipo = "LED";
       
        System.out.println("ola bem vindo ao nosso teste de ligar lampada, sua lampada e de marca "+lp.marca+",modelo "+lp.modelo+",potencia "+lp.potencia+" e tipo "+lp.tipo);
       
       lp.setLigaLampada();
       lp.setStatus();
    }
    
}
