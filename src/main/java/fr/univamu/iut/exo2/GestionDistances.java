package fr.univamu.iut.exo2;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionDistances {
    private static HashMap<String, Integer> VilleDistance = new HashMap<String, Integer>() {{
        put("Barcelone", 183);
        put("Alicante", 399);
        put("Valence", 337);
        put("Malaga", 399);
    }};

    public static Integer getDistance(String string) {
        return VilleDistance.get(string);
    }
}
