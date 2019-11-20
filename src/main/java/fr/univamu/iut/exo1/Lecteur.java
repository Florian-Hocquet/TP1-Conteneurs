package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo2.ComparateurDistance;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.*;
import java.lang.Object;

public class Lecteur {
    public static ArrayList<Conteneur> charger(String fichier) {
        ArrayList<Conteneur> conteneurs = new ArrayList<>();

        try {
            // Ouvrir le fichier dont le nom est donné précédement en paramètre
            FileInputStream fis = new FileInputStream(fichier);

            // Lire les objets à partir du flux
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                Object obj = ois.readObject();
                if (obj.getClass().equals(Conteneur.class)) {
                    conteneurs.add((Conteneur) obj);
                }
            }
        }

        catch (EOFException e) {
            System.out.println("Fin de fichier" + '\n');
        }

        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Collections.sort(conteneurs, new ComparateurDistance());

        /*for (int i = 0; i <= conteneurs.size() - 2; i++) {
            if (conteneurs.get(i).getDistance() > conteneurs.get(i + 1).getDistance()) {
                Object temp;
                temp = conteneurs.set(conteneurs.get(i));
                conteneurs[i] = i + 1;
                conteneurs[i + 1] = conteneurs[i];
            }
        }*/
        return conteneurs;
    }
}