public abstract class Suscripcion {
    private String nombreUsuario;

    public Suscripcion(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isBlank()) {
            throw new IllegalArgumentException("El nombre del usuario no puede ser nulo ni estar vacio");
        }
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public abstract double calcularCuotaMensual();

    public void mostrarUsuario() {
        System.out.println("Usuario: " + this.nombreUsuario);
    }

    protected static double validarNegativo(double valor, String nombreCampo) {
        if (valor <= 0) {
            throw new IllegalArgumentException("El valor del usuario no puede ser negativo");
        }
        return valor;
    }
}
