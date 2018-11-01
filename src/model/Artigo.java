package model;

import java.util.Date;

public class Artigo extends Publicacao {
    
    //atributos
    private String texto;

    public Artigo(String titulo, Date data, Administrador autor) {
        super(titulo, data, autor);
    }
    
}

    

