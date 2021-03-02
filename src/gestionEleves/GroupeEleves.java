package gestionEleves;

import java.util.ArrayList;

public class GroupeEleves {
    

    private ArrayList<Eleve> listeEleves = new ArrayList<>();;

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
        for (int i =0; i< listeEleves.size(); i++) {
            if(elevetrouver.toString().equals(listeEleves.get(i).toString())){
                elevetrouver = listeEleves.get(i);
            }else{
                elevetrouver = null;
            }
          }
          return elevetrouver;
    }

    public void lister(){
        for (int i =0; i< listeEleves.size(); i++) {
            Eleve eleveliste = new Eleve(listeEleves.get(i).toString());
            System.out.println(eleveliste);
            
        }

    }
}
