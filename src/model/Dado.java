package model;

import java.util.ArrayList;

public class Dado {
    
    private final ArrayList<Visitante> visitantes = new ArrayList();
    private final ArrayList<Administrador> administradores = new ArrayList();
    
    public void addVisitante (Visitante visitante) {
        this.visitantes.add(visitante);
    }
    
    public void addAdministrador (Administrador administrador) {
        this.administradores.add(administrador);
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

}
