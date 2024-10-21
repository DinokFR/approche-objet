package fr.diginamic.maison;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Maison {
    private ArrayList<Piece> pieces = new ArrayList<>();

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void ajouterPiece(Piece piece){
        if (piece != null && piece.getSuperficie() > 0 ) { 
        this.pieces.add(piece);
        }
        else System.out.println("Valeur rentré non valide, celle-ci ne doit pas être null, et doit avoir une superficie positive");
    } //Je me suis dit que les sous sols existent, du coup on acceptes les étages négatifs

    public double superficieTotal(){
        double superf = 0;
        for (Piece piece : pieces) {
            superf = superf + piece.getSuperficie();
        };

        return superf;
    }

    public double superficieEtage(int etage){
        double superf = 0;
        for (Piece piece : pieces) {
            if (piece.getNumEtage() == etage){

                superf = superf + piece.getSuperficie();
            }
        };

        return superf;
    }

    public double superficieTypePiece(Class<?> typePiece) {
        double superf = 0;
        for (Piece piece : pieces) {
            // Vérification si la pièce est du type spécifié
            if (typePiece.isInstance(piece)) {
                superf += piece.getSuperficie();
            }
        }
        return superf;
    }

    public int nombreTypePiece(Class<?> typePiece) {
        int count = 0;
        for (Piece piece : pieces) {
            // Vérification si la pièce est du type spécifié
            if (typePiece.isInstance(piece)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        if (pieces.isEmpty()) {
            return "La maison ne contient aucune pièce.";
        }

        // Utilisation d'une HashMap pour regrouper les pièces par étage
        Map<Integer, ArrayList<Piece>> piecesParEtage = new HashMap<>();

        for (Piece piece : pieces) {
            int etage = piece.getNumEtage();
            // Si l'étage n'existe pas encore dans la map, on l'ajoute
            piecesParEtage.computeIfAbsent(etage, k -> new ArrayList<>()).add(piece);
        }

        // Construction du résultat
        StringBuilder resultat = new StringBuilder();
        for (Map.Entry<Integer, ArrayList<Piece>> entry : piecesParEtage.entrySet()) {
            int etage = entry.getKey();
            resultat.append("Étage ").append(etage).append(" :\n");
            for (Piece piece : entry.getValue()) {
                resultat.append("- ").append(piece).append("\n");
            }
        }

        return resultat.toString();
    }


}
