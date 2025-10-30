// Componente concreto
public class SuscripcionBasica implements Suscripcion {
    @Override
    public String getDescripcion() {
        return "Suscripción básica a Universidad Online";
    }

    @Override
    public double getCosto() {
        return 15000;
    }
}

