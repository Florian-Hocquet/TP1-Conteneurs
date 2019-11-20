package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo1.Lecteur;

import java.io.ObjectInputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class GestionExpeditions {
    public static void main(String[] args) {
        ArrayList<Conteneur> conteneurs = Lecteur.charger("Conteneurs.ser");
        try {
            for (Conteneur elem : conteneurs) {
                System.out.println(elem);
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("prout");
        }
    }
}
