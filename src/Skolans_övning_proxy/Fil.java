package Skolans_övning_proxy;

import java.io.*;


public class Fil implements skapa_fil {
   private Fil() {
    }

    private static Fil f;
    public static Fil getInstance() {
        if (f == null) {
            f = new Fil();
        }
        return f;
    }
    public void create_file() throws IOException {

        System.out.println("its done ");
    };
}