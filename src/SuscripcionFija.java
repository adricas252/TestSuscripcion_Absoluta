public class SuscripcionFija extends Suscripcion {
    private double cuotaMensual;

    public SuscripcionFija(String nombreUsuario, double cuotaMensual) {
        super(nombreUsuario);
        this.cuotaMensual = cuotaMensual;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public double calcularCuotaMensual() {
        return this.cuotaMensual;
    }
}
