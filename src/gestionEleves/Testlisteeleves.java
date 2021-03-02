package gestionEleves;

public class Testlisteeleves{

    public static void main(String[] args) {
        Eleve eleve = new Eleve(args[0]);
        Eleve eleve2 = new Eleve(args[1]);
        GroupeEleves gpeleve = new GroupeEleves();
        gpeleve.AjouterEleve(eleve);
        gpeleve.AjouterEleve(eleve2);
        System.out.println(gpeleve.Chercher(args[0]));
        gpeleve.lister();


        for(int i = 2; i < args.length; i++){
            eleve.ajouternote(Integer.parseInt(args[i]));}
            System.out.println(eleve.toString());
    }



}