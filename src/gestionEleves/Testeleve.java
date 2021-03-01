package gestionEleves;

public class Testeleve {

    public static void main(String[] args) {
        
        Eleve eleve = new Eleve("micka");
        for(int i = 1; i < args.length; i++){
        eleve.ajouternote(Integer.parseInt(args[i]));}
        System.out.println(eleve.toString());
    }
    
}
