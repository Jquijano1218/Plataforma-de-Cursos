// Decorador abstracto
public abstract class BeneficioDecorador implements Suscripcion {
    protected Suscripcion suscripcion;
    public BeneficioDecorador(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }
    public abstract String getDescripcion();
    public abstract double getCosto();
}