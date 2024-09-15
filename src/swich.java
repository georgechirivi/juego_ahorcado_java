public class swich {
    public static void main(String[] args) throws Exception {
        // Que tipo de bebida te gusta?
        String bebida = "Jugo de naranja";

        switch (bebida) {
            case "Cafe":
                System.out.println("Buena eleccion");
                break;
            case "CMatee":
                System.out.println("Debes ser Argentino");
                break;
            case "gaseosa":
                System.out.println("Cuidado con el exceso de azucar");
                break;
            case "Vino":
                System.out.println("Si tomaste vino , no debes conducir");
                break;

            default:
                System.out.println("Disfruta tu bebida");
                break;
        }

        if (bebida == "Cafe") {
            System.out.println("Buena eleccion");
        } else if (bebida == "Mate") {
            System.out.println("Debes ser Argentino");
        } else if (bebida == "gaseosa") {
            System.out.println("Cuidado con el exceso de azucar");
        } else if (bebida == "Vino") {
            System.out.println("Si tomaste vino , no debes conducir");
        } else {
            System.out.println("Disfruta tu bebida");
        }
    }
}
