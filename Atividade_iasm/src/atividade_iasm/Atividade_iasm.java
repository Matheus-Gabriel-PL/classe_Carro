/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_iasm;

/**
 *
 * @author mathe
 */
public class Atividade_iasm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.marca = "fiat";
        uno.modelo = "de pobre";
        uno.cor = "preto";
        uno.num_passageiros = 4;
        uno.cap_combustivel = 150;
        uno.consumo = 10;
        
        System.out.println("bem vindo seu carro e um uno da marca:"+uno.marca+" ,modelo:"+uno.modelo+" ,cor:"+uno.cor+",com capacidae maxima de "+uno.num_passageiros+" passageiros");
        System.out.println("A capacidade de combustivel do seu carro e:"+uno.cap_combustivel+" Litros e seu consumo e de "+uno.consumo+" KM/litro");
        
        uno.setLigaCarro();
        uno.setStatus();
    }
    
}
