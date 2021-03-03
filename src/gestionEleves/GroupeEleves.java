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
        Eleve elevetrouver = new Eleve(nom);
        boolean trouver = false;
        for (int i =0; i< listeEleves.size(); i++) {
            if(elevetrouver.toString().equals(listeEleves.get(i).toString())){
                elevetrouver = listeEleves.get(i);
                trouver = true;
            }else if(!trouver){
                elevetrouver = null;
            }
          }
          return elevetrouver;
    }

    public void lister(){
        for (Eleve eleve : listeEleves) {
            System.out.println(eleve.toString());
        }

    }
}
