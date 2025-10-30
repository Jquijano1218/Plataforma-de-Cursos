// Decorador concreto: Tutor personal
public class TutorPersonal extends BeneficioDecorador {
    public TutorPersonal(Suscripcion suscripcion) {
        super(suscripcion);
    }

    @Override
    public String getDescripcion() {
        return suscripcion.getDescripcion() + ", con tutor personalizado";
    }

    @Override
    public double getCosto() {
        return suscripcion.getCosto() + 8000;
    }
}