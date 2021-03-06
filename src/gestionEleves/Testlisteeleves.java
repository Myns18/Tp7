package gestionEleves;

public class Testlisteeleves {

    public static void main(String[] args) {
        
        GroupeEleves gpeleve = new GroupeEleves();
        TestGroupeElevesFichier readfile = new TestGroupeElevesFichier();
        readfile.Readfileofeleves();
        // Pour les fichiers
        int i = 0;
        int j = 1;
        for(i = i; i < readfile.getsize();){
            Eleve eleve = new Eleve(readfile.getdata(i));
            gpeleve.AjouterEleve(eleve);
            i = i+4;

            for(j = j; j < i; j++){
            eleve.ajouternote(Integer.parseInt(readfile.getdata(j)));
            }
            j = j + 1;

        }

        // Pour les arguments
        /*int i = 0;
        int j = 1;
        for(i = i; i < args.length;){
            Eleve eleve = new Eleve(args[i]);
            gpeleve.AjouterEleve(eleve);
            i = i+4;

            for(j = j; j < i; j++){
            eleve.ajouternote(Integer.parseInt(args[j]));
            }
            j = j + 1;

        }*/

        
        gpeleve.lister();
        if(gpeleve.Chercher("mika") == null){
            System.out.println("L'élève ne figure pas dans la liste.");
        }else{System.out.println("Voilà : " + gpeleve.Chercher("mika"));}

    }
}