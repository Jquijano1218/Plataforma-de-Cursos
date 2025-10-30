// Decorador concreto: Material descargable
public class MaterialDescargable extends BeneficioDecorador {
    public MaterialDescargable(Suscripcion suscripcion) {
        super(suscripcion);
    }

    @Override
    public String getDescripcion() {
        return suscripcion.getDescripcion() + ", con material descargable";
    }

    @Override
    public double getCosto() {
        return suscripcion.getCosto() + 3000;
    }
}