package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        Path path = Paths.get("C:/temp/recensement.csv");
        Path path2 = Paths.get("C:/temp/recensementCopyV2.csv");

        try {
            lines = Files.readAllLines(path); //On récupère les lignes

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            System.out.println(line);
        }

        ArrayList<Ville> villes = new ArrayList<>();

        for (String line : lines) { //Ajout des lignes dans la liste villes
            String[] tokens = line.split(";"); 
            Ville v = new Ville(tokens[6], tokens[2], tokens[1], tokens[9].trim().replaceAll(" ", ""));
            villes.add(v);
        }
        villes.remove(villes.getFirst());
        villes.removeIf(v -> Integer.parseInt(v.getPopulationTotale()) < 25000);

        List<String> lineDest = new ArrayList<>();
        lineDest.add("Nom;Code département;Nom de la région ; Population totale");

        for (Ville ville : villes) { //On ajoute les villes dans une nouvelle liste de String pour ensuite l'ajouter au fichier
            lineDest.add(ville.getNom()+";"+ville.getCodeDepartement()+";"+ville.getNomRegion()+";"+ville.getPopulationTotale());
        }

        try {
            Files.write(path2, lineDest);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
