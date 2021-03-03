package gestionEleves;

public class Testlisteeleves{

    public static void main(String[] args) {
        
        GroupeEleves gpeleve = new GroupeEleves();
        int i = 0;
        int j = 1;
        for(i = i; i < args.length;){
            Eleve eleve = new Eleve(args[i]);
            gpeleve.AjouterEleve(eleve);
            i = i+4;

            for(j = j; j < i; j++){
            eleve.ajouternote(Integer.parseInt(args[j]));
            }
            j = j + 1;

        }
        gpeleve.lister();
        //System.out.println(gpeleve.Chercher(args[0]));
    }

}