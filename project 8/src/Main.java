import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //entrada de datos//
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el precio del producto:");
        /*usamos los datos como textos y lo pasamos a numeros
        para evitar problemas si lo ingresan con coma o con puntos*/
        String precioInput= sc.nextLine().replace(",",".");
        double precio = Double.parseDouble(precioInput);
        //hacemos el cálculo y lo presentamos/
        System.out.println("el precio con iva es:"+ iva(precio));

    }
    static double iva (double precioSiva){
        double precioCiva;
        precioCiva = precioSiva * 1.21;
        return precioCiva;
    }

}