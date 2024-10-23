package fr.diginamic.fichier;

public class Ville {

    // Attributs
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private String populationTotale;

    // Constructeur
    public Ville(String nom, String codeDepartement, String nomRegion, String populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(String populationTotale) {
        this.populationTotale = populationTotale;
    }

    // Méthode toString pour afficher les informations de la ville
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}

