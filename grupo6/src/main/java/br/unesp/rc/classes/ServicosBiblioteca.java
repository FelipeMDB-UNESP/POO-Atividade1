/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.classes;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class ServicosBiblioteca {
    
    public static void registrarEmprestimo(Emprestimo emprestimo, String nomeUsuario){
        
        System.out.println("Um novo emprestimo foi gerado para:" + nomeUsuario + "de id:" + emprestimo.getIdCliente());
        System.out.println("Os seguintes livros foram emprestados: ");
        for(Livro l : emprestimo.livrosEmprestados){
            System.out.println(Long.toString(l.getId()) + ":" + l.getTitulo());
        }
        System.out.println("Data do empréstimo: " + emprestimo.getDataRetirada());
        System.out.println("Data da devolução: " + emprestimo.getDataDevolucao());
    }
    
    public static void devolverEmprestimo(Emprestimo emprestimo, String nomeUsuario){
        System.out.println("Os seguintes livros foram devolvidos: ");
        for(Livro l : emprestimo.livrosEmprestados){
            System.out.println(Long.toString(l.getId()) + ":" + l.getTitulo());
        }
        
        if(houveAtraso(emprestimo) > 0){
            System.out.println("O usuário " + nomeUsuario + "deverá pagar o valor de R$" + houveAtraso(emprestimo));
        }
        else{
            System.out.println("O usuário " + nomeUsuario + "fez a devolução dentro da data prevista");
        }
        System.out.println("Emissão do comprovante de devolução");
    }
    
    public static int houveAtraso(Emprestimo emprestimo){
        
        Date hoje = new Date(); // captura a data de hoje
        if(emprestimo.dataDevolucao.compareTo(hoje) < 0 ){ // se < 0 dataDevolucao ocorre antes da data atual
            return (emprestimo.getLivrosEmprestados().size() * 2);
        }
        return 0;
    }
    
}
