package Coches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Matricula="h";
        String Marca;
        String Modelo;
        String Color;
        CochesCRUD cochesCRUD = new CochesCRUDImpl();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la matricula del coche.Para terminar *:");
        Matricula = sc.nextLine();
        while (Matricula != "") {
            System.out.print("Introduzca la marca del Coche.Para terminar solo enter:");
            Marca = sc.nextLine();
            System.out.print("Introduzca el modelo del Coche.Para terminar solo enter:");
            Modelo = sc.nextLine();
            System.out.print("Introduzca el color del Coche.Para terminar solo enter:");
            Color = sc.nextLine();
            Coche coche = new Coche(Matricula,Marca,Modelo,Color);
            cochesCRUD.Save(coche);
            System.out.print("Introduzca la matricula del siguiente coche.Para terminar solo enter:");
            Matricula = sc.nextLine();
        }
        System.out.println("Si desea eliminar algun coche del listado introduzca la matricula, sino enter:");
        Matricula = sc.nextLine();
        if (Matricula!=""){
            cochesCRUD.Delete(Matricula);
        }
        System.out.println("Los coches ingresados son:");
        cochesCRUD.Findall();

        sc.close();
    }
}

