import java.util.Arrays;

public class Avion {
    private String immatriculation;
    private String marque;
    private String modele;
    private Pilote pilote;
    private Passager[] passagers;

    // Premier constructeur (sans pilote et passagers)
    public Avion(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.passagers = new Passager[0]; // Tableau vide par défaut
    }

    // Second constructeur (avec pilote, sans passagers)
    public Avion(String immatriculation, String marque, String modele, Pilote pilote) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passagers = new Passager[0]; // Tableau vide par défaut
    }

    // Méthode pour ajouter un passager
    public void ajouterPassager(Passager passager) {
        // Augmente la taille du tableau s'il n'est pas assez grand
        passagers = Arrays.copyOf(passagers, passagers.length + 1);
        passagers[passagers.length - 1] = passager;
    }

    // Getters et setters pour les attributs privés
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Passager[] getPassagers() {
        return passagers;
    }

    public void setPassagers(Passager[] passagers) {
        this.passagers = passagers;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", pilote=" + pilote +
                ", passagers=" + Arrays.toString(passagers) +
                '}';
    }
}
