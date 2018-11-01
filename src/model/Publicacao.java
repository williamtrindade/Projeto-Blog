package model;

import java.util.Date;

public class Publicacao {
    //atributos
    private String titulo;
    private Date data;
    
    //construtores
    public Publicacao(String titulo, Date data) {
        this.titulo = titulo;
        this.data = data;
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
    
}
