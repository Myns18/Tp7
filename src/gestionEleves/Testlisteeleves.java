package gestionEleves;

public class Testlisteeleves{

    public static void main(String[] args) {
        
        GroupeEleves gpeleve = new GroupeEleves();
        TestGroupeElevesFichier readfile = new TestGroupeElevesFichier();
        final String SEPARATEUR = " ";

        String datafinal[] = readfile.Readfileofeleves();
        // Pour les fichiers
        int i = 0;
        int j = 1;
        for(i = i; i < datafinal.length;){
            Eleve eleve = new Eleve(datafinal[i]);
            System.out.println(datafinal[i]);
            gpeleve.AjouterEleve(eleve);
            i = i+4;

            for(j = j; j < i; j++){
            eleve.ajouternote(Integer.parseInt(datafinal[j]));
            System.out.println(datafinal[j]);
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

        
        /*gpeleve.lister();
        if(gpeleve.Chercher("mika") == null){
            System.out.println("L'élève ne figure pas dans la liste.");
        }else{System.out.println(gpeleve.Chercher("mika"));}*/
    }

}