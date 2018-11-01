package model;

public class Video extends Publicacao{
    
    //atributos
    private String url;

    public Video(String titulo, Administrador autor) {
        super(titulo, autor);
    }
        
    //gets - sets
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
