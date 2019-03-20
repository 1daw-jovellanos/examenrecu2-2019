/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.time.LocalDate;
import java.util.*;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victor
 */
public class ExamenRecu7Test {
    
    public ExamenRecu7Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test(timeout = 100)
    public void testQuedaAlgunMesVacio() {
        Set<Alumno> alumnos = new HashSet<>();
        assertEquals(true, ExamenRecu7.quedaAlgunMesVacio(alumnos));
        for (int i = 1; i <= 10; i++) { // Febrero a Octubre
            alumnos.add(new Alumno(LocalDate.of(2000,i,2)));
            alumnos.add(new Alumno(LocalDate.of(2000,i,3)));
        }
        assertEquals(true, ExamenRecu7.quedaAlgunMesVacio(alumnos));
        for (int i = 1; i <= 12; i++) {
            alumnos.add(new Alumno(LocalDate.of(1900+1,i,2+i)));
        }
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < 1000; j++) {
                alumnos.add(new Alumno(LocalDate.of(2000,i,2+i)));
            }
        }
        assertEquals(false, ExamenRecu7.quedaAlgunMesVacio(alumnos));
    }

    @Test(timeout = 1000)
    public void testAleatorio() {
        boolean hayExcepcion = false;
        try {
            ExamenRecu7.aleatorio(1000, 2000, 2500); // No hay 1000 valores distintos posibles
        } catch (IllegalArgumentException ex) {
            hayExcepcion = true;
        }
        assertEquals(true, hayExcepcion);
        
        SortedSet<Integer> h = new TreeSet<>(ExamenRecu7.aleatorio(1000, 2000, 3100));
        
        assertEquals(1000, h.size());;
        assertEquals(true, h.first() >= 2000);
        assertEquals(true, h.last() < 3100);
    }

    
}
