public class Main {
    public static void main(String[] args) {
        int numeroif = 0;
        int numerowh = 0;
        int numerodo = 0;
        var estación = "verano";

        if (numeroif > 0) {
            System.out.println("es positivo");
        } else {
            if (numeroif < 0) {
                System.out.println("es negativo");
            } else {
                System.out.println("es cero");
            }
        }
        while (numerowh < 3) {
            numerowh = numerowh + 1;
            System.out.println(numerowh);
        }
        do {
            numerodo++;
            System.out.println(numerodo);
        } while(numerodo < 1);
        for (int numerofor = 0; numerofor <= 3; numerofor = numerofor+1 ) {
            System.out.println(numerofor);
        }
        switch (estación){
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            default:
                System.out.println("La estación esta equivocado");
                break;
        }
    }
}