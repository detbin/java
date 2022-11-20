public class DatosdelCoche {

        //atributos
        String Nombre;
        String Dni ;
        String Tel ;
        String Email ;
        String Marca ;
        String Color ;
        String Modelo ;
        String Motor ;
        String Puestos ;
    //constructor
    public DatosdelCoche(String nombre,String dni,String  tel,String email,String marca,String color , String modelo, String motor, String puestos) {
        this.Nombre = nombre;
        this.Dni = dni;
        this.Tel = tel;
        this.Email = email;
        this.Marca = marca;
        this.Color = color;
        this.Modelo = modelo;
        this.Motor = motor;
        this.Puestos = puestos;

        //metodo

        }
        public DatosdelCoche(){

        }

    @Override
    public String toString() {
        return "DatosdelCoche{" +
                "Nombre='" + Nombre + '\'' +
                ", Dni='" + Dni + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Email='" + Email + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Color='" + Color + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Motor='" + Motor + '\'' +
                ", Puestos='" + Puestos + '\'' +
                '}';
    }
}
