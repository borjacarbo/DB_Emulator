package com.example.fbcm.db_emulator;

import java.util.ArrayList;

public class Principal {
    public static void main(String args[]) {

        // crea la base de dades
        ArrayList<Persona> personas = new ArrayList<Persona>();

        // defeneix una persona
        Persona yo = new Persona(19992260, "Borja", "Carbó", "Malonda");

        // afegeix la persona a la base de dades de persones
        personas.add(yo);

        // afegeix numeros de telefònos a una persona
        yo.añadir(new Telefono("Movil", 654875726));
        yo.añadir(new Telefono("Casa", 962808188));


        
        System.out.println(" Searching for Andrés");
        Persona p1 = buscar(personas, "Andrés");

        try {
            p1.mostrarTelefonos();
        }
        catch (Exception e) {

            System.out.println("Persona No encontrada");
        }

        System.out.println(" Searching for Borja");
        Persona p2 = buscar(personas, "Borja");

        // busca els numeros de la persona sel·leccionada si existeix

        try {
            p2.mostrarTelefonos();
        }
        catch (Exception e) {

            System.out.println("Persona No encontrada");
        }


    }

    private static Persona buscar(ArrayList<Persona> personas, String nom) {
        int i = 0;
        try {
            while (! ((personas.get(i)).getNom()).equals(nom)) {
                i++;
            }
        }
        catch (Exception e) {
            return null;
        }
        return personas.get(i);
    }


}