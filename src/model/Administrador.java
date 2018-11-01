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
        try {
            if (video.getAutor() == super.clone()) {
                this.videosPublicados.add(video);
            }else{
                System.out.println("Esse Vídeo não é seu!!");
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("Não foi possivel Publicar!");
        }
    }
    
    public void publicar (Artigo artigo) {
        try {
            if (artigo.getAutor() == super.clone()) {
                this.artigosPublicados.add(artigo);
            }else{
                System.out.println("Esse artigo não é seu!!");
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("Não foi possivel Publicar!");
        }
    }

    @Override
    public void compartilhar(Video video) {
        try {
            if (video.getAutor() == super.clone()) {
                System.out.println("Não pode compartilhar seus próprios Vídeos");
            }else{
                super.compartilhar(video);
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
                super.compartilhar(artigo);
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
