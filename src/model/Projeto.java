/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Giovanni
 */
public class Projeto {
    private String data_inicio;
    private String data_termino;
    private String descricao;
    private String status;
    private String nome;
    private String cpf;
    private String media;
    
    private int numero;
    private int id_projetista;
    private int id_cliente;
    private int cod_funcional;
    private int id;
    private int qtde_projetos;

    private Date data_nasc;
    private Date dta_inicio;
    private Date dta_termino;
    private Date dta_hoje;
    
    
    
    public Projeto(int numero, String data_inicio, String data_termino, int id_projetista, int id_cliente, String descricao){
        this.numero = numero;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.id_projetista = id_projetista;
        this.id_cliente = id_cliente;
        this.descricao = descricao;
    }

    public Projeto(int numero, String descricao, String status) {
        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
    }
    
    public Projeto(int cod_funcional, String nome, Date data_nasc, int id, int qtd_projetos){
        this.cod_funcional = cod_funcional;
        this.id = id;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.qtde_projetos = qtd_projetos;
    }

    public Projeto(String cpf, String nome, Date data_nasc, int id, int qtd_projetos){
        this.cpf = cpf;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.id = id;
        this.qtde_projetos = qtd_projetos;
    }
    
    public Projeto(Date data_inicio, Date data_termino){
        this.dta_inicio = data_inicio;
        this.dta_termino = data_termino;

    }
    
    public Projeto(String media){
        this.media = media;
    }
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the data_inicio
     */
    public String getData_inicio() {
        return data_inicio;
    }

    /**
     * @return the data_termino
     */
    public String getData_termino() {
        return data_termino;
    }

    /**
     * @return the id_projetista
     */
    public int getId_projetista() {
        return id_projetista;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @param data_termino the data_termino to set
     */
    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }

    /**
     * @param id_projetista the id_projetista to set
     */
    public void setId_projetista(int id_projetista) {
        this.id_projetista = id_projetista;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
