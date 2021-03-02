package gestionEleves;

import java.util.ArrayList;

public class Eleve {

    private String nom;
    private ArrayList<Integer> listenotes = new ArrayList<>();
    private double moyenne;

    public Eleve(String nom){
        this.nom = nom;
    }

    public double getmoyenne(){
        return this.moyenne;
    }

    public String getnom(){
        return this.nom;
    }

    public ArrayList<Integer> getListeNotes(){
        if(listenotes.isEmpty()){ System.out.println("La liste est vide."); }
        return listenotes;
    }


    public void ajouternote(int note){
        if(note < 0) note = 0;
        if(note > 20) note = 20;
        int nbdenote = listenotes.size();
        if(listenotes.isEmpty()){nbdenote = 1; 
            this.moyenne = (this.moyenne * nbdenote + note)/nbdenote; 
            listenotes.add(note);
        }else{
            this.moyenne = (this.moyenne * nbdenote + note)/(nbdenote+1);
            listenotes.add(note);}
    }

    public String toString(){
        return getnom()+ " ("  + getmoyenne() + ")";
    }

    
}
