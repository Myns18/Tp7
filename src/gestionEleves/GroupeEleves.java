package gestionEleves;

import java.util.ArrayList;

public class GroupeEleves {
    

    private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();

    public int nombre(){
        return listeEleves.size();
    }

    public ArrayList<Eleve> getListe(){
        return this.listeEleves;

    }

    public void AjouterEleve(Eleve eleve){
        listeEleves.add(eleve);

    }

    public Eleve Chercher(String nom){
        for (Eleve eleve : listeEleves) {
            if(eleve.getnom().equals(nom)){
                return eleve;
            }       
        }
        return null;
    }

    public void lister(){
        for (Eleve eleve : listeEleves) {
            System.out.println(eleve.toString());
        }

    }
}
