package com.examples;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class project10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <String> nombres = new ArrayList();

        System.out.println("Introduzca los nombres de la lista.Para terminar solo enter:");
       String Nombre = sc.nextLine();
       nombres.add(Nombre);
        while (Nombre!="") {
            Nombre = sc.nextLine();
            nombres.add(Nombre);
        }
        int size = nombres.size();
        for (int i = 0; i < size; i++) {
            System.out.print(nombres.get(i) + " ");
        }
    }
}
