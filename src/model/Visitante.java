package model;

import java.util.ArrayList;

public class Visitante extends Usuario{
    
    //atributos
    private final ArrayList<Artigo> artigosFavoritos = new ArrayList();
    private final ArrayList<Video> videosFavoritos = new ArrayList();
    
    //construtores
    public Visitante(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }
            
    //metodos
    public void favoritar (Artigo artigo) {
        this.artigosFavoritos.add(artigo);
    }
    
    public void favoritar (Video video) {
        this.videosFavoritos.add(video);
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
    public ArrayList<Artigo> getArtigosFavoritos() {
        return artigosFavoritos;
    }

    public ArrayList<Video> getVideosFavoritos() {
        return videosFavoritos;
    }
   
}
