package com.ticketsystem.ticketsys;

public class Lista {

    Nodo siguiente, ultimo;

    public void insert(Persona p) {
        if (siguiente == null) {
            siguiente = new Nodo(p);
        } else if (p.getIdEstruc()< siguiente.getPersona().getIdEstruc()) {
            Nodo aux = new Nodo(p);
            aux.setSiguiente(siguiente);
            siguiente = aux;
        } else if (siguiente.getSiguiente()== null) {
            siguiente.setSiguiente(new Nodo(p));
        } else {
            Nodo aux = siguiente;

            while (aux.getSiguiente() != null && aux.getSiguiente().getPersona().getIdEstruc()< p.getIdEstruc()) {
                aux = aux.getSiguiente();
            }
            Nodo temp = new Nodo(p);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
        }
    }
    
    public Persona buscar(int n) {
        Nodo aux = siguiente;
        boolean encontrado = false;
        Persona pers = null;

        if (siguiente != null) {
            while (aux != null && !encontrado) {
                if (aux.getPersona().getIdEstruc()== n) {
                    pers = aux.getPersona();
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
        }
        return pers;
    }
}
