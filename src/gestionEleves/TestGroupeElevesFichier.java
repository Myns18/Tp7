package gestionEleves;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestGroupeElevesFichier {

  private ArrayList<String> Data = new ArrayList<String>();

    public ArrayList<String> Readfileofeleves(){
        try {
            File filegroupeseleves = new File("eleves.txt");
            Scanner lire = new Scanner(filegroupeseleves);
            while (lire.hasNextLine()) {
              String datafile = lire.nextLine();
              String[] datafilesep = datafile.split(" ");
              for (String item : datafilesep) {
                this.Data.add(item);
             }
            }
            lire.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          return this.Data;
        }

        public String getdata(int i){
          return this.Data.get(i);
        }

        public int getsize(){
          return this.Data.size();
        }

    }

