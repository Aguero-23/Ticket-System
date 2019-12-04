package com.ticketsystem.ticketsys;

public class Cola {
//Creando colas v1
    Nodo frente;
    Nodo ultimo;

    public boolean vacia() {
        if (frente == null && ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encola(Persona p) {
        Nodo aux = new Nodo(p);
        if (vacia() == true) {
            frente = ultimo = aux;
        } else {
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
    }

    @Override
    public String toString() {
        String s = "";
        if (vacia() == true) {
            s = "Cola Vacia";
        } else {
            Nodo aux = frente;
            while (aux != null) {
                s += aux.getPersona();
                aux = aux.getUltimo();
            }
        }
        return s;
    }

}
