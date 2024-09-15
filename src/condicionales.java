public class condicionales {
    public static void main(String[] args) throws Exception {
        int edad = 5;
        if (edad > 18) {
            System.out.println("Puedes entrar");

        } else if (edad==18) {
            System.out.println("Tines la edad justa para ingresar, no olvides tu identificcion");
        } else {
            System.out.println("No tienes edad sufuciente para ingresar");
        }
    }
}
