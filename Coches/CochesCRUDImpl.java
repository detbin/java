package Coches;

import java.util.ArrayList;
import java.util.List;

public class CochesCRUDImpl implements CochesCRUD {

    public CochesCRUDImpl(){
    }
    //metodo
    List<Coche> coches = new ArrayList<Coche>();


        @Override
        public void Save(Coche coche) {
            coches.add(coche);
        }


        @Override
        public void Findall() {
            int size = coches.size();
            for (int i = 0; i < size; i++) {
                System.out.println(coches.get(i) + " ");
            }
        }

        @Override
        public void Delete(String Matricula) {
            int size = coches.size();
            for (int i = 0; i < size; i++) {
                if (coches.get(i).Matricula.equals(Matricula)) {
                    coches.remove(i);
                    break;
                }
            }
        }
}


