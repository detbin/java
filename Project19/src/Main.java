
import java.io.*;
import java.util.*;
;

public class Main {
    public static void main(String[] args) {
        try {
            //obtenemos el archivo y lo guardamos como un array list
            InputStream in = new FileInputStream("BDPRUEBA.txt");
            byte[] datos = in.readAllBytes();
            String Listado = new String(datos);
            int numTokens = 0;
            ArrayList<String> datosCoche = new ArrayList();
            //separamos el listado en un array list de palabras
            String s2 = null;
            StringTokenizer st = new StringTokenizer(Listado);
            while(st.hasMoreTokens()) {
                s2 = st.nextToken();
                datosCoche.add(s2);
                ++numTokens;
            }
            //Declaramos un HashMap (clave, Objeto) y lo llenamos con la matricula como clave y el resto de los datos de cada vehiculo
            String[] datosCocheX = new String[10];
            HashMap<String, Object> HM = new HashMap<String, Object>();
            String clave = null;
            int l = 0;
            String nombre;
            String dni;
            String tel;
            String email;
            String marca;
            String color;
            String modelo;
            String motor;
            String puestos;
            do {
                for(int m = 0; m < datosCocheX.length; ++m) {
                    datosCocheX[m] = (String)datosCoche.get(l + m);
                }
                clave = datosCocheX[0];
                nombre=(String) datosCocheX[1];
                dni=(String) datosCocheX[2];
                tel= (String)datosCocheX[3];
                email=(String) datosCocheX[4];
                marca= (String)datosCocheX[5];
                color=(String) datosCocheX[6];
                modelo= (String)datosCocheX[7];
                motor= (String)datosCocheX[8];
                puestos= (String)datosCocheX[9];
                DatosdelCoche datosdelCoche = new DatosdelCoche(nombre, dni, tel, email, marca, color, modelo, motor, puestos);
                HM.put(clave, datosdelCoche);
                l += 10;
            } while(l <50);
            //recorremos el mapa
            for (Map.Entry e : HM.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
            Consulta consulta = new Consulta(HM);
            File file = new File("Prueba1.txt");
            BufferedWriter bf = null;
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry entry : HM.entrySet()) {
                bf.write(entry.getKey() + ":" + entry.getValue());
                bf.newLine();
            }

            bf.flush();
            bf.close();
        }
         catch (Exception e) {
            System.out.println("el programa da error" + e.getMessage());
        }

    }
}