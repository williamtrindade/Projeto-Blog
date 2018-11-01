package model;


public class Artigo extends Publicacao {
    
    //atributos
    private String texto;

    public Artigo(String titulo, Administrador autor) {
        super(titulo, autor);
    }
    
    //gets - sets
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}

    

