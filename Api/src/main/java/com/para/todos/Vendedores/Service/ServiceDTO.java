package com.para.todos.Vendedores.Service;

public class ServiceDTO {
    
    private String nome;
    private String email;
    private String passWord;
    private String facebook;
    private int whatsp;
    private String categoria;

    public ServiceDTO() {
    }

    
    public ServiceDTO(String nome, String email,String passWord, String facebook, int whatsp, String categoria) {
        this.nome = nome;
        this.email = email;
        this.passWord = passWord;
        this.facebook = facebook;
        this.whatsp = whatsp;
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord(){
        return passWord;
    }

    public void setPassword(String passWord){
        this.passWord =passWord;
    }

    public String getFacebook() {
        return facebook;
    }
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    public int getWhatsp() {
        return whatsp;
    }
    public void setWhatsp(int whatsp) {
        this.whatsp = whatsp;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
