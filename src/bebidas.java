import java.util.Scanner;

public class bebidas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora de bebidas");
        System.out.println("Elegi una opcion de las siguientes");
        System.out.println("1 - Cafe");
        System.out.println("2 - Mate");
        System.out.println("3 - Mate");
        System.out.println("4 - Vino");
        // Que tipo de bebida te gusta?
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Buena eleccion");
                break;
            case 2:
                System.out.println("Debes ser Argentino");
                break;
            case 3:
                System.out.println("Cuidado con el exceso de azucar");
                break;
            case 4:
                System.out.println("Si tomaste vino , no debes conducir");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

        scanner.close();
    }
}