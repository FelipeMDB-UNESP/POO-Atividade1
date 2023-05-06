/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Emprestimo {

    long idCliente;
    Date dataDevolucao;
    Date dataRetirada;
    ArrayList<Livro> livrosEmprestados;
    
    public Emprestimo(long idCliente, Date dataRetirada, Date dataDevolucao, ArrayList<Livro> livrosEmprestados) {
        this.idCliente = idCliente;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livrosEmprestados = livrosEmprestados;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
