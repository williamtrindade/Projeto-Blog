package model;

import java.util.ArrayList;
public class Administrador extends Usuario {
    
    //atributos
    private final ArrayList<Video> videosPublicados = new ArrayList();
    private final ArrayList<Artigo> artigosPublicados = new ArrayList();
    
    //construtores
    public Administrador(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }
  
    //métodos
    public void publicar (Video video) {
        this.videosPublicados.add(video);
    }
    
    public void publicar (Artigo artigo) {
        this.artigosPublicados.add(artigo);
    }

    @Override
    public void compartilhar(Video video) {
        super.compartilhar(video);
    }
    
    @Override
    public void compartilhar(Artigo artigo) {
        super.compartilhar(artigo);
    }
    
    //gets - sets
    public ArrayList<Video> getVideosPublicados() {
        return videosPublicados;
    }

    public ArrayList<Artigo> getArtigosPublicados() {
        return artigosPublicados;
    }
    
}
