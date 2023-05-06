/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.classes;

/**
 *
 * @author aluno
 */
public class Professor extends Usuario{
    private long matricula;
    
    //Constructor 
    public Professor(long matricula, String nome, long cpf, long telefone, String endereco) {
        
        super.setNome(nome);
        super.setCpf(cpf);
        super.setTelefone(telefone);
        super.setEndereco(endereco);
        
        this.matricula = matricula; 
    }
    
    
    //getters and setters
    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    } 
}
