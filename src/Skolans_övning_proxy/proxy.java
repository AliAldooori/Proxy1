package Skolans_övning_proxy;

import java.io.*;
import java.util.HashMap;
public class proxy implements skapa_fil {
    Fil fil ;

 public   proxy() {} ;


    @Override
    public void create_file() throws IOException {
  //      Fil fil = null;
   //     Fil fil = new Fil() ;
        File file = new File("/Users/Ali Al-Doori/Desktop", "AliAnas");
        System.out.println(file.createNewFile());
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Leia");
        hm.put(2, "Ali");
        hm.put(3, "Dalia");
        BufferedWriter bwr = new BufferedWriter(new FileWriter(file));
        bwr.write(hm.toString());
        bwr.flush();
        bwr.close();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String x = br.readLine();
        String[] line = x.split(", ");
        for (String item : line) {
            System.out.println(item);
        fil.create_file();
        }
    }
}


