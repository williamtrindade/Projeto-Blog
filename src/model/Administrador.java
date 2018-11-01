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
        try {
            if (video.getAutor() == super.clone()) {
                System.out.println("Não pode compartilhar seus próprios Vídeos");
            }else{
                super.addCompartilhados(video);
                System.out.println("Video: " + video.getTitulo() + " Compartilhado no seu Perfil! ");
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("Não foi possivel Compartilhar!");
        }
    }
    
    @Override
    public void compartilhar(Artigo artigo) {
        try {
            if (artigo.getAutor() == super.clone()) {
                System.out.println("Não pode compartilhar seus próprios Artigos");
            }else{
                super.addCompartilhados(artigo);
                System.out.println("Artigo: " + artigo.getTitulo() + " Compartilhado no seu Perfil! ");
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("Não foi possivel Compartilhar!");
        }
    }
    
    //gets - sets
    public ArrayList<Video> getVideosPublicados() {
        return videosPublicados;
    }

    public ArrayList<Artigo> getArtigosPublicados() {
        return artigosPublicados;
    }
 
        
}
