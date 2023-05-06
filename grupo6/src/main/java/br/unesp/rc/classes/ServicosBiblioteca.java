/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class ServicosBiblioteca {
    
    public static Emprestimo registrarEmprestimo(Aluno aluno, ArrayList<Livro> livros){
        
        Date hoje = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(hoje);
        c.add(Calendar.DATE, 9);
        Date devolucao = c.getTime();
        Emprestimo emprestimo = new Emprestimo(aluno.getRegistroAcademico(), hoje, devolucao, livros);
        
        System.out.println("Um novo emprestimo foi gerado para o aluno: " + aluno.getNome() + " de Registro Acadêmico: " + aluno.getRegistroAcademico());
        System.out.println("Os seguintes livros foram emprestados: ");
        for(Livro l : emprestimo.livrosEmprestados){
            System.out.println(Long.toString(l.getId()) + ":" + l.getTitulo());
        }
        System.out.println("Data do empréstimo: " + emprestimo.getDataRetirada());
        System.out.println("Data da devolução: " + emprestimo.getDataDevolucao());
        
        return emprestimo;
    }
    
    public static Emprestimo registrarEmprestimo(Professor professor, ArrayList<Livro> livros){
        
        Date hoje = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(hoje);
        c.add(Calendar.DATE, 9);
        Date devolucao = c.getTime();
        Emprestimo emprestimo = new Emprestimo(professor.getMatricula(), hoje, devolucao, livros);
        
        System.out.println("Um novo emprestimo foi gerado para o professor: " + professor.getNome() + " de Matrícula:" + professor.getMatricula());
        System.out.println("Os seguintes livros foram emprestados: ");
        for(Livro l : emprestimo.livrosEmprestados){
            System.out.println(Long.toString(l.getId()) + ":" + l.getTitulo());
        }
        System.out.println("Data do empréstimo: " + emprestimo.getDataRetirada());
        System.out.println("Data da devolução: " + emprestimo.getDataDevolucao());
        
        return emprestimo;
    }
    
    public static void registrarDevolucao(Emprestimo emprestimo){
        System.out.println("Os seguintes livros foram devolvidos: ");
        for(Livro l : emprestimo.livrosEmprestados){
            System.out.println(Long.toString(l.getId()) + ":" + l.getTitulo());
        }
        
        if(precoDeAtraso(emprestimo) > 0){
            System.out.println("Devolução ATRASADA, o usuário de id " + emprestimo.getIdCliente() + " deverá pagar o valor de R$" + precoDeAtraso(emprestimo));
        }
        else{
            System.out.println("O usuário de id " + emprestimo.getIdCliente() + " fez a devolução dentro da data prevista, taxa não será cobrada");
        }
        System.out.println("Emissão do comprovante de devolução");
    }
    
    private static int precoDeAtraso(Emprestimo emprestimo){
        
        Date hoje = new Date(); // captura a data de hoje
        if(emprestimo.dataDevolucao.compareTo(hoje) < 0 ){ // se < 0 dataDevolucao ocorre antes da data atual
            return (emprestimo.getLivrosEmprestados().size() * 2);
        }
        return 0;
    }
}
