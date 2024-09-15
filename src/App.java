public class App {
    public static void main(String[] args) throws Exception {
        String texto = "Este es un texto asignado a una variable string";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud);

        char caracter = texto.charAt(9);
        System.out.println(caracter);

        String subcadena = texto.substring(6, 16);
        System.out.println(subcadena);

        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        int indice = texto.indexOf("variable", caracter);
        System.out.println(indice);

        String reemplazado = texto.replace("texto", "parrafo");
        System.out.println(reemplazado);
    }
}
