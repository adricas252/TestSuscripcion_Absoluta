public class SuscripcionPorUso extends Suscripcion {
    private double gigasConsumidos;
    private double precioPorGiga;

    public SuscripcionPorUso(String nombreUsuario, double gigasConsumidos, double precioPorGiga) {
        super(nombreUsuario);
        this.gigasConsumidos = gigasConsumidos;
    }

    public double getGigasConsumidos() {
        return gigasConsumidos;
    }

    public void setGigasConsumidos(double gigasConsumidos) {
        this.gigasConsumidos = gigasConsumidos;
    }

    public double getPrecioPorGiga() {
        return precioPorGiga;
    }

    public void setPrecioPorGiga(double precioPorGiga) {
        this.precioPorGiga = precioPorGiga;
    }

    @Override
    public double calcularCuotaMensual() {
        return gigasConsumidos * precioPorGiga;
    }
}
