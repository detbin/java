public class DatosdelCoche {

        //atributos
        private String Nombre;
    private String Dni ;
    private String Tel ;
    private String Email ;
    private String Marca ;
    private String Color ;
    private  String Modelo ;
    private  String Motor ;
    private String Puestos ;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public String getPuestos() {
        return Puestos;
    }

    public void setPuestos(String puestos) {
        Puestos = puestos;
    }





    //constructor
    public DatosdelCoche(String nombre,String dni,String  tel,String email,String marca,String color , String modelo, String motor, String puestos) {


        this.Nombre= nombre;
        this.Dni= dni;
        this.Tel= tel;
        this.Email= email;
        this.Marca= marca;
        this.Color= color;
        this.Modelo= modelo;
        this.Motor= motor;
        this.Puestos=puestos;




        }
        public DatosdelCoche(){

        }
//metodo
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
