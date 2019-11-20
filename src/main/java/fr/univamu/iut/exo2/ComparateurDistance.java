package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

import java.util.Comparator;

public class ComparateurDistance implements Comparator<Conteneur> {
    public int compare(Conteneur A, Conteneur B){
        int distanceA = A.getDistance();
        int distanceB = B.getDistance();
        return distanceA - distanceB;
    }
}

