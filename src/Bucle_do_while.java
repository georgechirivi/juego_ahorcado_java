public class Bucle_do_while {
    public static void main(String[] args) throws Exception {

        int contador = 1;
        do {
            System.out.println("Esto sucede antes de la condicion");
            System.out.println(contador);
            // Actualizacion de la variable
            contador++;
        }

        while (contador <= 5);
        System.out.println(contador);

    }

}
