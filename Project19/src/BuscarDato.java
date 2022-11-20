import java.util.ArrayList;
import java.util.StringTokenizer;

public class BuscarDato {
    String Datos;
    String TipoDato;
    String dato;
    boolean existe;
    String temp = null;

    public String BuscarDato(String Datos, String TipoDato) {
        int numTokens = 0;
        ArrayList<String> DATOS = new ArrayList();
        StringTokenizer st = new StringTokenizer(Datos);
        while (st.hasMoreTokens()) {
            temp = st.nextToken();
            DATOS.add(temp);
            ++numTokens;
        }

        for (int i = 0; i < DATOS.size(); i++) {
            if ((DATOS.get(i)).contains(TipoDato)) {
                dato = DATOS.get(i);

            } else {
                System.out.println("no se encuentra el dato");
            }
        }
        return dato;
    }
}
