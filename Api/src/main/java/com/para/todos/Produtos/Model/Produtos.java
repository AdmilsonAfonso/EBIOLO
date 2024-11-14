package com.para.todos.Produtos.Model;

import jakarta.persistence.*;

@Entity
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomep;
    private String img;
    private String descricao;
    private int preco;
    private String estado;
    private String email;
    public Produtos() {
    }
    public Produtos(String nomep, String img, String descricao, int preco, String estado, String email) {
        this.nomep = nomep;
        this.img = img;
        this.descricao = descricao;
        this.preco = preco;
        this.estado = estado;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomep() {
        return nomep;
    }
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
