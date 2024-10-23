package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        List<String> lines = null;

        Path path = Paths.get("C:/temp/recensement.csv");
        Path pathf = Paths.get("C:/temp/recensementCopy.csv");
        try {
            lines = Files.readAllLines(path); //On récupère les lignes
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> linesDest = new ArrayList<>(); //On créer une nouvelle liste contenant les lignes qui iront dont le nouveau fichier


        for (int i = 0; i < 100 && i < lines.size(); i++){
            
            linesDest.add(lines.get(i));

        }
        System.out.println(linesDest);

        try {
            Files.write(pathf, linesDest); //On écrits les nouvelles lignes dans le fichier
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for(String line: linesDest) {
            System.out.println(line);
            }

        

    }
}
