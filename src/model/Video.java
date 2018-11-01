package model;

import java.util.Date;

public class Video extends Publicacao{
    
    //atributos
    private String url;

    public Video(String titulo, Date data, Administrador autor) {
        super(titulo, data, autor);
    }
        
}
