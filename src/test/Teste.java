package test;

import model.*;

public class Teste {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        //Minha especie de Banco de Dados sobre o Blog
        Dado dados = new Dado();
        
        Administrador a1 = new Administrador("Jonas", "jonas", "123455");
        Visitante v1 = new Visitante("Rafaela", "rafa", "3333333");
        
        Administrador a2 = new Administrador("William", "devwil", "1#@800wmr");
        Visitante v2 = new Visitante("João", "biffy", "1234567890");
        
        Artigo ar1 = new Artigo("Artigo 1: Como começar com POO em Java", a1);
        ar1.setTexto(" Olá hoje vou falar sobre POO em Java");
        
        Video vi1 = new Video("Vídeo 1: Como começar com POO em Java", a1);
        vi1.setUrl("yt.com/defrfergjk");
        
        Artigo ar2 = new Artigo("Artigo 2: Como começar com js", a2);
        ar2.setTexto(" Hoje vou compartilhar minhas experiências com Vanilla JS");
        
        Video vi2 = new Video("Vídeo 2: Como começar com js", a2);
        vi2.setUrl("vimeo.com/gregi34fvf");
        
        // Administradores
        // Publicar
        a1.publicar(ar1);
        a1.publicar(vi1);
        
        a2.publicar(ar2);
        a2.publicar(vi2);
        
        // Compartilhar
        a1.compartilhar(ar1);
        a1.compartilhar(ar2);
        a1.compartilhar(vi1);
        a1.compartilhar(vi2);
        
        a2.compartilhar(ar1);
        a2.compartilhar(ar2);
        a2.compartilhar(vi1);
        a2.compartilhar(vi2);
        

        
        // Visitantes
        // Compartilhar
        v1.compartilhar(ar1);
        v1.compartilhar(ar2);
        v1.compartilhar(vi1);
        v1.compartilhar(vi2);
        
        v2.compartilhar(ar2);
        v2.compartilhar(vi2);
        v2.compartilhar(vi1);
        v2.compartilhar(vi2);
        
        //Favoritar
        v1.favoritar(ar1);
        v1.favoritar(ar2);
        v1.favoritar(vi1);
        v1.favoritar(vi2);
        
        v2.favoritar(ar1);
        v2.favoritar(ar2);
        v2.favoritar(vi1);
        v2.favoritar(vi2);
        
        dados.addAdministrador(a1);
        dados.addAdministrador(a2);
        dados.addVisitante(v1);
        dados.addVisitante(v2);
        exibeiBlog(dados);
        exibeVisitas(dados);
    } 
    
    // Função para exibir o Teste do Blog
    public static void exibeVisitas(Dado dados) {
        System.out.println("\tVisitantes");
        
        dados.getVisitantes().stream().map((i) -> {
            System.out.println("---Nome: " + i.getNome());
            return i;            
        }).map((i) -> {
            System.out.println("->Artigos compartilhados por " + i.getNome());
            return i;
        }).map((i) -> {
            i.getArtigosCompartilhados().forEach((art) -> {
                System.out.println("Título: " + art.getTitulo());
            });
            return i;
        }).map((i) -> {
            System.out.println("\n");
            return i;
        }).map((i) -> {
            System.out.println("->Vídeos compartilhados por " + i.getNome());
            return i;
        }).map((i) -> {
            i.getVideosCompartilhados().forEach((vid) -> {
                System.out.println("Título: " + vid.getTitulo());
            });
            return i;
        }).map((i) -> {
            System.out.println("\n");
            return i;
        }).map((i) -> {
            System.out.println("->Artigos Favoritados por " + i.getNome());
            return i;
        }).map((i) -> {
            i.getArtigosFavoritos().forEach((art) -> {
                System.out.println("Título: " + art.getTitulo());
            });
            return i;
        }).map((i) -> {
            System.out.println("\n");
            return i;
        }).map((i) -> {
            System.out.println("->Vídeos Favoritados por " + i.getNome());
            return i;
        }).map((i) -> {
            i.getVideosFavoritos().forEach((vid) -> {
                System.out.println("Título: " + vid.getTitulo());
            });
            return i;            
        }).forEachOrdered((_item) -> {
            System.out.println("\n");
        });
    }
    
    public static void exibeiBlog(Dado dados) {
        System.out.println("\tArtigos: \n");
        
        dados.getAdministradores().forEach((Administrador adm) -> {
            adm.getArtigosPublicados().stream().map((art) -> {
                System.out.println("Autor: " + art.getAutor().getNome());
                return art;
            }).map((art) -> {
                System.out.println("Data: " + art.getData());
                return art;
            }).map((art) -> {
                System.out.println("Título: " + art.getTitulo());
                return art;
            }).map((art) -> {
                System.out.println("Texto: " + art.getTexto());
                return art;
            }).forEachOrdered((art) -> {
                System.out.println("\n");
            });
        });
        
        System.out.println("\n\tVídeos: \n");
        
        dados.getAdministradores().forEach((Administrador adm) -> {
            adm.getVideosPublicados().stream().map((vid) -> {
                System.out.println("Autor: " + vid.getAutor().getNome());
                return vid;
            }).map((vid) -> {
                System.out.println("Data: " + vid.getData());
                return vid;
            }).map((vid) -> {
                System.out.println("Título: " + vid.getTitulo());
                return vid;
            }).map((vid) -> {
                System.out.println("URL: " + vid.getUrl());
                return vid;
            }).forEachOrdered((vid) -> {
                System.out.println("\n");
            });
        });
    }
    
}
