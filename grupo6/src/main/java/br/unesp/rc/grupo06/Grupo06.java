/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.unesp.rc.grupo06;

import br.unesp.rc.classes.Aluno;
import br.unesp.rc.classes.Emprestimo;
import br.unesp.rc.classes.Livro;
import br.unesp.rc.classes.ServicosBiblioteca;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Grupo06 {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(221151478, "Vladimir da Silva Putin", "52809449806", "19998445699", "Rua Tchurusbango Tchurusbago");
        
        Livro livro1 = new Livro("Mensagem", "Fernando Pessoa", "1989", "Panini", 39476001);
        Livro livro2 = new Livro("Mensagem", "Fernando Pessoa", "1989", "Panini", 39476002);
        Livro livro3 = new Livro("Moby Dick", "Paulo Coelho", "1728", "Britain", 39477001);
        
        ArrayList<Livro> livros1 = new ArrayList();
        livros1.add(livro1);
        livros1.add(livro2);
        livros1.add(livro3);
        
       
        
        Emprestimo emprestimo1 = ServicosBiblioteca.registrarEmprestimo(aluno1, livros1);
        ServicosBiblioteca.registrarDevolucao(emprestimo1);
        
        System.out.println("-------------------------------------------------------------------------------"
                + "----------------------------------------------------------------------------------------");
        
        Aluno aluno2 = new Aluno(221997645, "Darth Barbosa Carlos Vader", "98647558907", "19884556278", "Rua Avenida Brasil");
        Livro livro4 = new Livro("Eragon", "Charles Dorian", "2004", "Arqueiro", 39478001);
        ArrayList<Livro> livros2 = new ArrayList();
        livros2.add(livro4);

        Emprestimo emprestimo2 = ServicosBiblioteca.registrarEmprestimo(aluno2, livros2);
        Date hoje = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(hoje);
        c.add(Calendar.DATE, -10);
        emprestimo2.setDataDevolucao(c.getTime());
        ServicosBiblioteca.registrarDevolucao(emprestimo2);
    }
}
