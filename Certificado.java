// Decorador concreto: Certificado
public class Certificado extends BeneficioDecorador {
    public Certificado(Suscripcion suscripcion) {
        super(suscripcion);
    }

    @Override
    public String getDescripcion() {
        return suscripcion.getDescripcion() + ", con certificado oficial";
    }

    @Override
    public double getCosto() {
        return suscripcion.getCosto() + 5000;
    }
}