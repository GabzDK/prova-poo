package org.example;

import junit.framework.TestCase;
public class IngressoCinemaTest extends TestCase {

    public void testPrecoIngresso() {
        IngressoCinema ingresso = new IngressoCinema(DiaSemana.QUARTA, false);
         float expResult = 7.50f;
         float result = ingresso.precoIngresso();
          assertEquals(expResult, result);
    }
    public void testPrecoIngresso2() {
        IngressoCinema ingresso = new IngressoCinema(DiaSemana.QUARTA, true);
        float expResult = 7.50f;
        float result = ingresso.precoIngresso();
        assertEquals(expResult, result);
    }
    public void testPrecoIngresso3() {
        IngressoCinema ingresso = new IngressoCinema(DiaSemana.SEGUNDA, true);
        float expResult = 10.50f;
        float result = ingresso.precoIngresso();
        assertEquals(expResult, result);
    }
    public void testPrecoIngresso4() {
        IngressoCinema ingresso = new IngressoCinema(DiaSemana.SABADO, true);
        float expResult = 16.50f;
        float result = ingresso.precoIngresso();
        assertEquals(expResult, result);
    }
    public void testPrecoIngresso5() {
        IngressoCinema ingresso = new IngressoCinema(DiaSemana.SABADO, false);
        float expResult = 21.0f;
        float result = ingresso.precoIngresso();
        assertEquals(expResult, result);
    }
}