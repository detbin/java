import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Consulta {
    //atributos
    String matricula;
    HashMap<String, Object> HC = new HashMap<>();
    String Options1;
    String Options2;
    String Options3;
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
        DatosdelCoche datosdelCoche = new DatosdelCoche(nombre, dni, tel, email, marca, color, modelo, motor, puestos);

        //metodo
        // try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea hacer: Consultar pulse C, Modificar pule M,Borrar pulse B");
        Options1 = sc.nextLine();
        switch (Options1) {
            case ("C"):
                System.out.println("Ingrese la matricula a consultar:");
                matricula = sc.nextLine();
                if (HC.containsKey(matricula)) {
                    System.out.println(HC.get(matricula));
                } else {
                    System.out.println("No hay matricula");
                }
                break;
            case ("M"):
                System.out.println("Ingrese la matricula a consultar:");
                matricula = sc.nextLine();
                DatosdelCoche datosModificar = (DatosdelCoche) HC.get(matricula);
                System.out.println("Ingrese T si desea modificar todos los datos del coche o D para modificar solo un dato:");
                Options2 = sc.nextLine();
                switch (Options2) {
                    case ("T"):
                        System.out.println("Ingrese el nombre del propietario:");
                        datosdelCoche.setNombre(sc.nextLine());
                        System.out.println("Ingrese el ID del propietario:");
                        datosdelCoche.setDni(sc.nextLine());
                        System.out.println("Ingrese el telefono del propietarior:");
                        datosdelCoche.setTel(sc.nextLine());
                        System.out.println("Ingrese el email del propietario:");
                        datosdelCoche.setEmail(sc.nextLine());
                        System.out.println("Ingrese la marca del coche:");
                        datosdelCoche.setMarca(sc.nextLine());
                        System.out.println("Ingrese el color del coche:");
                        datosdelCoche.setColor(sc.nextLine());
                        System.out.println("Ingrese el modelo del coche:");
                        datosdelCoche.setModelo(sc.nextLine());
                        System.out.println("Ingrese la cilindrada del motor:");
                        datosdelCoche.setMotor(sc.nextLine());
                        System.out.println("Ingrese el numero de puestos:");
                        datosdelCoche.setPuestos(sc.nextLine());
                        HC.replace(matricula, datosdelCoche);
                        System.out.println(HC.get(matricula));
                        break;
                    case ("D"):
                        System.out.println("Indique que dato desea modificar" +
                                "Nombre N, " +
                                "Id I, " +
                                "Telf T, " +
                                "email E, " +
                                "Marca M, " +
                                "Color C, " +
                                "Modelo MO, " +
                                "Motor CC, " +
                                "Puestos P, ");
                        Options3= sc.nextLine();
                        switch (Options3) {
                            case("N"):
                                System.out.println("Ingrese el nombre nuevo:");
                                datosModificar.setNombre(sc.nextLine());
                                HC.replace(matricula, datosdelCoche);
                                System.out.println(HC.get(matricula));
                                break;
                            case("I"):
                                System.out.println("Ingrese el NUEVO DNI:");
                                datosModificar.setDni(sc.nextLine());
                                HC.replace(matricula, datosModificar);
                                System.out.println(HC.get(matricula));
                                break;
                        }
                }
                        datosModificar.setDni(sc.nextLine());
                        System.out.println(datosModificar);
            case ("B"):
                System.out.println("Ingrese la matricula del vehiculo a borrar :");
                matricula = sc.nextLine();
                HC.remove(matricula);
                break;
            default:
                System.out.println("la entrada es incorrecta");
        }
    }
}



