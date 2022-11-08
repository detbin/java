package Coches;

public class Coche {

    String Matricula;
    String Marca;
    String Modelo;
    String Color;

    public Coche(String Matricula,String Marca, String Modelo, String Color) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;

    }
    public Coche(){
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}

