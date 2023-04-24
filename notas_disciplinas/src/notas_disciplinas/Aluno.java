/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas_disciplinas;
 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Aluno {
   
    
    private String nome;
    private String matricula;
    private String curso;
    public Map<String, Double> notas;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new HashMap<String, Double>();
    }

    public void setNota(String disciplina, double nota) {
        notas.put(disciplina, nota);
    }

    public double getNota(String disciplina) {
        return notas.get(disciplina);
    }

    public boolean estaAprovado(String disciplina) {
        double nota = notas.get(disciplina);
        return nota >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
    
}
