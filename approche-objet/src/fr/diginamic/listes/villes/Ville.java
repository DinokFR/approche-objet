package fr.diginamic.listes.villes;

public class Ville implements Comparable<Ville>{
    private String nom;
    private int nbHab;

    public Ville(String nom, int nbHab){ 
        this.nom = nom;
        this.nbHab = nbHab;
    }
    
    public int getNbHab() {
        return nbHab;
    }
    public String getNom() {
        return nom;
    }

    public void setNbHab(int nbHab) {
        this.nbHab = nbHab;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom + " - " + nbHab + " habitants";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Si c'est le même objet, ils sont égaux
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si l'objet est null ou de classe différente, ils ne sont pas égaux
        }
        Ville autreVille = (Ville) obj;
        return nbHab == autreVille.nbHab && nom.equals(autreVille.nom);
    }

    @Override
    public int compareTo(Ville o) {
        return Integer.compare(this.nbHab, o.getNbHab());
    }

    
    //@Override
    //public int compareTo(Ville autreVille) {
    //    return this.nom.compareTo(autreVille.getNom());
    //}





}
