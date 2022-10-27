public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador= new Trabajador();

        cliente.setEdad(20);
        cliente.setNombre("David");
        cliente.setTelefono(2834120);
        cliente.setCredito((float)1572.52);
        trabajador.setSalario((float)46000.52);
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
        System.out.println(trabajador.getSalario());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getEdad (){
        return edad;
    }
    public String getNombre (){
        return nombre;
    }
    public int getTelefono (){
        return telefono;
    }
}
class Cliente extends Persona{
    private float credito;
    public void setCredito (float credito){
        this.credito = credito;
    }
    public float getCredito (){
        return credito;
    }
}
class Trabajador extends Persona{
    private float salario;
    public void setSalario (float salario){
        this.salario = salario;
    }
    public float getSalario (){
        return salario;
    }
}