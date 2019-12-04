package com.ticketsystem.ticketsys;

public class Funciones {
    
    public void atiende(Nodo p){
        System.out.println("Nombre: "+p.getPersona().getNombre()+" - Ape1: "+p.getPersona().getApellido1()+" - Ape2: "
                +p.getPersona().getApellido2()+" - IdEst: "+p.getPersona().getIdEstruc()+" - Id:"+p.getPersona().getId());
    }
    
}
