package model;

import java.util.Date;

public class Publicacao {
    
    //atributos
    private String titulo;
    private final int data;
    private Administrador autor;
   
    //construtores
    public Publicacao(String titulo, Administrador autor) {
        this.data = new Date().getDate();
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //gets - sets
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getData() {
        return data;
    }

    public Administrador getAutor() {
        return autor;
    }

    public void setAutor(Administrador autor) {
        this.autor = autor;
    }

}
