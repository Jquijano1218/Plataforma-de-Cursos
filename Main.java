// Programa principal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PLANES DE SUSCRIPCIÓN ===");
        System.out.println("1. Plan Básico");
        System.out.println("2. Plan con Certificado");
        System.out.println("3. Plan Premium (Certificado + Tutor Personal)");
        System.out.println("4. Plan Premium (Certificado + Tutor Personal + Material descargable)");
        System.out.print("Elige tu plan (1-4): ");
        int opcion = sc.nextInt();

        // 🔹 Declarar la variable aquí para usarla en todos los casos
        Suscripcion suscripcion = new SuscripcionBasica();

        switch (opcion) {
            case 1:
                System.out.println("\nResumen de tu suscripción:");
                System.out.println(suscripcion.getDescripcion());
                System.out.println("Costo total: $" + suscripcion.getCosto());
                break;

            case 2:
                Suscripcion certificado = new Certificado(suscripcion);
                System.out.println("\nResumen de tu suscripción:");
                System.out.println(certificado.getDescripcion());
                System.out.println("Costo total: $" + certificado.getCosto());
                break;

            case 3:
                Suscripcion tutor = new TutorPersonal(new Certificado(suscripcion));
                System.out.println("\nResumen de tu suscripción:");
                System.out.println(tutor.getDescripcion());
                System.out.println("Costo total: $" + tutor.getCosto());
                break;

            case 4:
                Suscripcion material = new MaterialDescargable(new Certificado(new TutorPersonal(suscripcion)));
                System.out.println("\nResumen de tu suscripción:");
                System.out.println(material.getDescripcion());
                System.out.println("Costo total: $" + material.getCosto());
                break;

            default:
                System.out.println("Opción no válida. Se aplicará el plan básico por defecto.");
                System.out.println("\nResumen de tu suscripción:");
                System.out.println(suscripcion.getDescripcion());
                System.out.println("Costo total: $" + suscripcion.getCosto());
                break;
        }

        sc.close();
    }
}
