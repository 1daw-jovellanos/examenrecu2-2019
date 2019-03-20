/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temas56;

import java.util.Arrays;
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
public class ExamenRecu56Test {

    public ExamenRecu56Test() {
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

    @Test(timeout=1000)
    public void testCuentaNinnos() {
        String[] ninnos = new String[0];
        assertEquals(0, ExamenRecu56.cuentaNinnos(ninnos));
        ninnos = new String[]{
            "a; 12; ew,,:rok", // sí
            "b; 15; qqw qw,.oqw oo", // no
            "c; 5 ; qqwEnCina oo", // no
            "d; 5; qqw qw,.oqw oo", // sí
            "e;   13  ; qqw qw,.oqw oo", // sí
            "f; 14; qqw qw,.oqw oo", // no
            "g;   13   ; asdsadencinaasads", // no
            "h; 0; ads", // sí
            "i; 9  ; asdo asda a d" // Sí
        };
        String[] copia = Arrays.copyOf(ninnos, ninnos.length);
        assertEquals(5, ExamenRecu56.cuentaNinnos(ninnos));
        assertArrayEquals(ninnos, copia);

    }

    @Test(timeout=1000)
    public void testDescifrarTeniente() {
        String exp = "En Villarriba, a 18 de Marzo de 2019";
        String mensaje = "En Villassiba, a 18 df Mas_zzo df 2019";
        assertEquals(exp, ExamenRecu56.descifrarTeniente(mensaje));
        exp = "Marzo lluvioso y Abril ventoso dejan a Mayo florido y hermoso";
        mensaje = "Mas_zzo ll_uuvio_sso z Absil vfnuo_sso dfjan a Mazo _fflosido z hfsmo_sso";
        assertEquals(exp, ExamenRecu56.descifrarTeniente(mensaje));
        exp = "1,2,3;9;0 ñÑlLmMvVaAuUtT";
        mensaje = "1,2,3;9;0 ñÑlLmMvVaA_uuUuT";
        assertEquals(exp, ExamenRecu56.descifrarTeniente(mensaje));
    }

}
