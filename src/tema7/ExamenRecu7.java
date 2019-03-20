package tema7;

import java.util.*;

public class ExamenRecu7 {

    public static boolean quedaAlgunMesVacio(Set<Alumno> alumnos) {
        Set<Integer> meses = new HashSet<Integer>(); // un set de meses
        for (Alumno alu : alumnos) {
            meses.add(alu.getFechaNacimiento().getMonthValue()); // ir añadiendo
            if (meses.size() == 12) { // Si tengo los 12 ya puedo parar
                return false;
            }
        }
        return true;
    }

    public static Collection<Integer> aleatorio(int n, int min, int max) {
        if (max - min < n) { // si no puedo gereralos
            throw new IllegalArgumentException(); // lanzar excepción
        }
        Set<Integer> numeros = new HashSet<Integer>(); // un set, para evitar repes
        Random random = new Random();
        while (numeros.size() < n) { // Mientras no tenga n números.
            numeros.add(random.nextInt(max - min) + min);
        }
        return numeros;
    }

}
