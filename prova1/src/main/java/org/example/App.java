package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       IngressoCinema ingresso = new IngressoCinema(DiaSemana.SABADO, true);
       System.out.println("valor ingresso " + ingresso.precoIngresso());
    }
}
