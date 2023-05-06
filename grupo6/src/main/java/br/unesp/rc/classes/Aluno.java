/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.classes;

/**
 *
 * @author aluno
 */
public class Aluno extends Usuario{
    private int registroAcademico;

    public Aluno(int registroAcademico, String nome, long cpf, long telefone, String endereco) {
        
        super.setNome(nome);
        super.setCpf(cpf);
        super.setTelefone(telefone);
        super.setEndereco(endereco);
        
        this.registroAcademico = registroAcademico;
        
    }
    
    
    
    //Getters and Setters
    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    
    
    
    
}
