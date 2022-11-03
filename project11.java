package com.examples;
public class project11 {
    public static void main(String[] args) {
        SmartDevice Tablet = new SmartDevice();
        Tablet.model="X25";
        Tablet.marca="Toshiva";
        Tablet.conexion="4G";
        SmartDevice Notebook = new SmartDevice("X26","Androide",32,"4G","plana");
        System.out.println(Tablet.model);
        System.out.println(Tablet.marca);
        System.out.println(Tablet.conexion);
        System.out.println(Notebook.model);
        System.out.println(Notebook.marca);
        System.out.println(Notebook.conexion);
        SmartPhone Phone = new SmartPhone();
        SmartWatch Watch = new SmartWatch();
        Phone.model="iPhone";
        Phone.marca="Apple";
        Phone.conexion="4G";
        Watch.model="AppleWatch";
        Watch.marca="Androide";
        Watch.conexion="5G";
        System.out.println(Phone.conexion);
        System.out.println(Phone.marca);
        System.out.println(Phone.conexion);
        System.out.println(Watch.model);
        System.out.println(Watch.marca);
        System.out.println(Watch.conexion);
        SmartPhone Samsung7 = new SmartPhone("Samsung7","Androide",156,"5G","curva");
        SmartWatch Epsilon = new SmartWatch("Samsung7","Androide",156,"5G","curva");
    }

    public static class SmartDevice {
        //atributos//
        public String model;
        public String marca;
        public int memoria;
        public String conexion;
        public String pantalla;

        //constructores//
        public SmartDevice(){

        }
        public SmartDevice(String model, String marca, int memoria, String conexion, String pantalla) {
            this.model = model;
            this.marca = marca;
            this.memoria = memoria;
            this.conexion = conexion;
            this.pantalla = pantalla;
        }





        //metodos//
        /*public void setModel(String model){
            this.model = model;
        }
        public void setMarca(String marca){
            this.marca = marca;
        }
        public void setCapMemoria(int capMemoria){
            this.capMemoria =capMemoria;
        }
        public void setConexionInternet(String conexionInternet){
            this.conexionInternet = conexionInternet;
        }
        public void setTipoPantalla(String tipoPantalla){
            this.tipoPantalla = tipoPantalla;
        }
        public String getModel() {
            return model;
        }
        public String getMarca() {
            return marca;
        }
        public int getCapMemoria() {
            return capMemoria;
        }
        public String getConexionInternet() {
            return conexionInternet;
        }
        public String getTipoPantalla() {
            return tipoPantalla;
        }
*/

    }

    static class SmartPhone extends SmartDevice {
        SmartPhone() {
        }
        public SmartPhone(String model, String marca, int memoria, String conexion, String pantalla) {
            this.model = model;
            this.marca = marca;
            this.memoria = memoria;
            this.conexion = conexion;
            this.pantalla = pantalla;
        }
    }

    static class SmartWatch extends SmartDevice {
        SmartWatch() {
        }
        public SmartWatch(String model, String marca, int memoria, String conexion, String pantalla) {
            this.model = model;
            this.marca = marca;
            this.memoria = memoria;
            this.conexion = conexion;
            this.pantalla = pantalla;
    }




}
