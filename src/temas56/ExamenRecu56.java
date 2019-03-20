package temas56;

public class ExamenRecu56 {

    public static int cuentaNinnos(String[] datos) {
        int cuenta = 0; // un contador, porque vamos a contar
        for (String datosNinno : datos) {
            String[] trozos = datosNinno.split(";");
            int edad = Integer.parseInt(trozos[1].trim());
            String direccion = trozos[2];
            if (edad < 14 && !direccion.toLowerCase().contains("encina")) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static String descifrarTeniente(String mensaje) {
        String resultado = ""; // vamos a generar una cadena
        int ignorar = 0; // Cuando encontramos un _, indica cuantos caracteres quedan por ignorar
        for (int i = 0; i < mensaje.length(); i++) {
            if (ignorar > 0) { // si estamos en modo ignorar
                ignorar--; // descontamos este caracter ignorado y no hacemos nada
            } else {
                char c = mensaje.charAt(i);
                if (c == '_') {
                    resultado += mensaje.charAt(i + 1); // el siguiente caracter del mesaje al resultado
                    ignorar = 2; // ignoramos los dos siguientes
                } else if ("rxfsuz".indexOf(c) >= 0) { // rxfsuz son las siguientes a qwerty
                    resultado += (char) (c - 1); // Se puede restar a un char, pero el tipo es int
                } else { // cualquier otro caracter
                    resultado += c; // a la salida.
                }
            }
        }
        return resultado;
    }

}
