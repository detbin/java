import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("BDPRUEBA.txt");
            byte[] datos = in.readAllBytes();
            int[] dato = new int[1000];
            FileReader fr = new FileReader("BDPRUEBA.txt");
            int caract = fr.read();
            int i = 0;
            while (caract != -1) {
                if (caract != 0) {
                    dato[i] = caract;
                    System.out.print((char) caract);
                }
                caract = fr.read();
            }

            PrintStream out = new PrintStream("BD1prueba.txt");
            out.write(datos);
            HashMap<String,ByteArrayInputStream> HM = new HashMap<>();
            HM.put("6629JHZ", new ByteArrayInputStream(datos));
            HM.put("6256JHS", new ByteArrayInputStream(datos));
            HM.put("4562YWS", new ByteArrayInputStream(datos));
            HM.put("7654UST", new ByteArrayInputStream(datos));
            HM.put("2022RTD", new ByteArrayInputStream(datos));
            for (Map.Entry elemento: HM.entrySet()) {
                System.out.println("Elemento clave es:" + elemento.getKey());
                System.out.println("Elemento contenido es:"+ elemento.getValue());
                System.out.println(elemento.getValue());
                ArrayToString(elemento.getValue());

            }
        } catch (Exception e) {
            System.out.println("el programa da error"+e.getMessage());
        }
    }
    public static String Arraystostring () {
        String s1;
        String s2;
        String clave;

        // Cargamos el buffer con el contenido del archivo
        BufferedReader br = new BufferedReader(new FileReader("BDPRUEBA.txt"));

        // Leemos la primera linea
        //String temp="";
        //String bfRead;
        //while((bfRead = br.readLine())!=null) {
//haz el ciclo, mientras bfRead tiene datos
          //  temp = temp + bfRead + "\n";
            s1 = br.readLine();
            System.out.println("La primera linea del archivo es: " + s1);
            System.out.println("La linea tiene " + s1.length() + " caracteres");

            System.out.println();
            System.out.println("Separando la linea en trozos tenemos las siguientes palabras:");

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(s1);

            // bucle por todas las palabras
            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                if (numTokens=0){
                    clave = s2;
                }
                numTokens++;
                System.out.println("    Palabra " + numTokens + " es: " + s2);
                return s2
            }
        }
    }