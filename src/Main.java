public class Main {
    public static void main(String[] args) {
        int opcion = 4;
        int a = 5;
        int b = 5;

        // Base para el ejercicio: este switch debe ser trabajado en varias feature/*.
        // El conflicto intencional se genera cuando dos o mas features editan las mismas lineas.
        switch (opcion) {
            case 1:
                System.out.println("TODO: implementar suma");
                break;
            case 2:
                System.out.println("TODO: implementar resta");
                break;
            case 3:
                System.out.println("Multiplicación:" + (a*b));
                break;
            case 4:
                System.out.println("Divición: " + (a/b));
                break;
            default:
                System.out.println("TODO: implementar menu y validaciones");
                break;
        }

        // Evita warnings de variables no usadas en esta base inicial.
        if (a == b) {
            System.out.print("");
        }
    }
}
