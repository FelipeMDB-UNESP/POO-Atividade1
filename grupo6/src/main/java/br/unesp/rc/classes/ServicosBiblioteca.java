/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.classes;

/**
 *
 * @author aluno
 */
public class ServicosBiblioteca {
    
    public static void registrarEmprestimo(Emprestimo emp, String nome){
        
        System.out.println("Um novo emprestimo foi gerado para:" + nome);
        System.out.println("Os seguintes livros foram emprestados: ");
        for(Livro l : emp.livrosEmprestados){
            System.out.println(Long.toString(l.id))
        }
    }
    
    public static boolean devolverEmprestimo(Emprestimo){
        haAtraso
    }
    
    public static boolean haAtraso(Emprestimo emprestimo){
        
        return false;
    }
    
}
