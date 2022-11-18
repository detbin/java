import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            //Descargamos el archivo y lo convertimos en String
            InputStream in = new FileInputStream("BDPRUEBA.txt");
            byte[] datos = in.readAllBytes();
            String Listado = new String(datos);
            //Separamos el archivo en palabras y lo guardamos en un Arraylist
                int numTokens = 0;
                ArrayList <String> datosCoche = new ArrayList<String>();
                String s1= Listado;
                String s2=null;
                StringTokenizer st = new StringTokenizer(s1);
                while (st.hasMoreTokens()) {
                    s2 = st.nextToken();
                    datosCoche.add(s2);
                    numTokens++;
                    System.out.println("    Palabra " + numTokens + " es: " + s2);
                    System.out.println("    Palabra " + datosCoche);
                }
            //declaramos un Mapa del tipo Hash con claves y arreglos y lo llenamos con los datos
                String [] datosCocheX = new String[10];
                HashMap<String, String []> HM = new HashMap<>();
                String clave=null;
                int l=0;
                do {
                    for (int m = 0; m < datosCocheX.length; m++) {
                        datosCocheX[m] = datosCoche.get(l + m);
                        clave = datosCocheX[0];
                        HM.put(clave, datosCocheX);
                        System.out.println("los datos de este coche son" + datosCocheX[m]);
                    }
                l = l + 10;
                }while (l<50);

            //recorremos el mapa
            String [] s = new String [10];
            for (Map.Entry elemento : HM.entrySet()) {
                System.out.println("Elemento clave es:" + elemento.getKey());
                System.out.println("Elemento valor es:" + elemento.getValue());
                s= (String[]) elemento.getValue();
                for (int o= 0; o < datosCocheX.length;o++) {
                    System.out.println(s[o]);
                }
            }
        }catch (Exception e) {
            System.out.println("el programa da error" + e.getMessage());
        }
    }
}

