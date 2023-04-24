/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas_disciplinas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Notas_disciplinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, curso);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome da disciplina " + i + ": ");
            String disciplina = scanner.nextLine();

            System.out.print("Digite a nota da disciplina " + i + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            aluno.setNota(disciplina, nota);
        }

        System.out.println("Disciplinas:");
        for (String disciplina : aluno.notas.keySet()) {
            System.out.println("- " + disciplina + ": " + aluno.getNota(disciplina) +
                (aluno.estaAprovado(disciplina) ? " (aprovado)" : " (reprovado)"));
        }
    }
}
    
    

