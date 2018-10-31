package model;

import java.util.ArrayList;

public class Administrador extends Usuario {
    //atributos
    private final ArrayList<Publicacao> publicacoes = new ArrayList();
    
    //construtor
    public Administrador(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }
    
    //métodos
    public void publicar (Video video) {
        
    }
    
    public void publicar (Artigo artigo) {
        
    }
    
    public void publicar (Artigo artigo) {
        
    }
    
    //gets - sets
    
}
