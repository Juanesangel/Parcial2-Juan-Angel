package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import logica.Parcial;

public class ParcialTest {

    private Parcial parcial;

    @BeforeEach
    public void setUp() {
        parcial = new Parcial();
    }

    @Test
    public void ecuacionestest() throws Exception {
        double[] ecuaciones = parcial.ecuacionsegundogrado(1, -2, 1);
        assertEquals(1.0, ecuaciones[0]);
        assertEquals(1.0, ecuaciones[1]);
    }
    @Test
    public void testdiscriminant0() {
        Exception e = assertThrows(Exception.class, () -> {
            parcial.ecuacionsegundogrado(1, 2, 5);
        });
        assertTrue(e.getMessage().contains("raíces"));
    }

    @Test
    public void testa0() {
        Exception e = assertThrows(Exception.class, () -> {
            parcial.ecuacionsegundogrado(0, 4, 2);
        });
        assertTrue(e.getMessage().contains("no valido"));
    }
}
