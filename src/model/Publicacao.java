package model;

import java.util.Date;

public class Publicacao {
    
    //atributos
    private String titulo;
    private Date data;
    private Administrador autor;
   
    //construtores
    public Publicacao(String titulo, Date data, Administrador autor) {
        this.titulo = titulo;
        this.data = data;
        this.autor = autor;
    }
    
    //gets - sets
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Administrador getAutor() {
        return autor;
    }

    public void setAutor(Administrador autor) {
        this.autor = autor;
    }    
}
