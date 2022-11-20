import java.util.HashMap;
import java.util.Scanner;

public class Consulta {
    //atributos
    String matricula;
    HashMap<String, Object> HC = new HashMap<String, Object>();
    String Options;
    String nombre;
    String dni;
    String tel;
    String email;
    String marca;
    String color;
    String modelo;
    String motor;
    String puestos;
    //constructor

    public Consulta(HashMap<String, Object> HC) {
        this.HC = HC;


        //metodo
        // try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea hacer: Consultar pulse C, Modificar pule M,Borrar pulse B");
        Options = sc.nextLine();
        switch (Options) {
            case ("C") :
            System.out.println("Ingrese la matricula a consultar:");
            matricula = sc.nextLine();
            if (HC.containsKey(matricula)) {
                System.out.println(HC.get(matricula));
            } else {
                System.out.println("No hay matricula");
            }
            break;
            case ("M") :
            System.out.println("Ingrese la matricula a modificar:");
            matricula = sc.nextLine();
            System.out.println("Ingrese el nombre del propietario:");
            nombre = sc.nextLine();
            System.out.println("Ingrese el ID del propietario:");
            dni = sc.nextLine();
            System.out.println("Ingrese el telefono del propietarior:");
            tel = sc.nextLine();
            System.out.println("Ingrese el email del propietario:");
            email = sc.nextLine();
            System.out.println("Ingrese la marca del coche:");
            marca = sc.nextLine();
            System.out.println("Ingrese el color del coche:");
            color = sc.nextLine();
            System.out.println("Ingrese el modelo del coche:");
            modelo = sc.nextLine();
            System.out.println("Ingrese la cilindrada del motor:");
            motor = sc.nextLine();
            System.out.println("Ingrese el numero de puestos:");
            puestos = sc.nextLine();
            DatosdelCoche datosdelCoche = new DatosdelCoche(nombre, dni, tel, email, marca, color, modelo, motor, puestos);
            HC.replace(matricula, datosdelCoche);
            System.out.println(HC.get(matricula));
            break;
            case ("B") :
            System.out.println("Ingrese la matricula del vehiculo a borrar :");
            matricula = sc.nextLine();
            HC.remove(matricula);
            break;
            default :
            System.out.println("la entrada es incorrecta");
        }
        sc.close();

    }
}


