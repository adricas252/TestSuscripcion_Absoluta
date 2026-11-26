public class Main {
    public static void main(String[] args) {

        Suscripcion[] suscripciones = {
                new SuscripcionFija("Iker", 23.56),
                new SuscripcionPorUso("Clara", 50.0, 1.50),
                new SuscripcionFija("Sara", 35.02)
        };

        double totalCuotas = 0;
        for (Suscripcion suscripcion : suscripciones) {
            suscripcion.mostrarUsuario();
            double cuota = suscripcion.calcularCuotaMensual();
            totalCuotas += cuota;
        }

        System.out.println("Total cuotas: " + totalCuotas);

        try {
            new SuscripcionFija("SanJose", -165);
        } catch (IllegalArgumentException e) {
            System.out.println("Advertencia: " + e.getMessage());
        }
    }
}
