package com.example.fbcm.db_emulator;

import java.util.ArrayList;

public class Persona {

    private int dni;
    private String nom;
    private String cognom_pare;
    private String cognom_mare;

    ArrayList<Telefono> telefonos = new ArrayList<Telefono>();


    public Persona(int dni, String nom, String cognom_pare, String cognom_mare) {
        this.dni = dni;
        this.nom = nom;
        this.cognom_pare = cognom_pare;
        this.cognom_mare = cognom_mare;
    }

    public int getDni() {

        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom_pare() {
        return cognom_pare;
    }

    public void setCognom_pare(String cognom_pare) {
        this.cognom_pare = cognom_pare;
    }

    public String getCognom_mare() {
        return cognom_mare;
    }

    public void setCognom_mare(String cognom_mare) {
        this.cognom_mare = cognom_mare;
    }


    public void añadir(Telefono tel) {
        telefonos.add(tel);
    }

    public void mostrarTelefonos() {
        for (int i = 0; i < telefonos.size(); i++) {
            String numeros = "Telefono " + i + " ---> " + telefonos.get(i).getNumero();
            System.out.println(numeros);
        }
    }
}
