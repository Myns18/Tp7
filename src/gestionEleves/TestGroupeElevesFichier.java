package gestionEleves;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestGroupeElevesFichier {

    public String[] Readfileofeleves(){

        String [] datafinal = null;
        String [] test = null;
        try {
            File filegroupeseleves = new File("eleves.txt");
            Scanner lire = new Scanner(filegroupeseleves);
            while (lire.hasNextLine()) {
              String data = lire.nextLine();
              datafinal = data.split(" ");
              for(int i = 0; i < datafinal.length; i++){
                test[i] = datafinal[i];
              //System.out.println(datafinal[i] + " 1");
              }
            }
            lire.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

          for(int i = 0; i < test.length; i++){
            System.out.println(test[i] + " 2");
            }
          return test;
        }

    }

