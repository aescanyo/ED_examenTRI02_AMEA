/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.examen.tri02;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anton
 */
public class ExamenTest {

    public ExamenTest() {
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

    /**
     * Test of elMayorDe method, of class Examen.
     */
    @Test
    public void testArrayElMayorEsElPriemro() throws Exception {
        System.out.println("elMayorDe");
        int[] listaEnteros={3,2,1};
        //listaEnteros=new int[]{1,2,3};
        int expResult = 3;
        int result = Examen.elMayorDe(listaEnteros);
        System.out.println(""+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
   }
    
 
    
    
    
    /**
     * el mayor es el ultimo
     * 
     */
    @Test
    public void testArrayElUltimoEsMayor() {
        System.out.println("mayor de un array es el ultimo valor: ");
        int[] listaEnteros = {1, 2, 3};
        //listaEnteros=new int[]{1,2,3};
        int expResult = 3;

        try {
            int result = Examen.elMayorDe(listaEnteros);
            assertTrue(result == expResult);
        } catch (Exception e) {
            System.out.println("nooopppp");
        }

    }
    
    
    /**
     * array de un elemento
     */
    
        @Test
    public void arrayDeUnElemento() {
        System.out.println("Array de un elemento: ");
        int[] listaEnteros = {100};
        int expResult = 100;

        try {
            int result = Examen.elMayorDe(listaEnteros);
            assertTrue(result == expResult);
        } catch (Exception e) {
            System.out.println("nooopppp");
        }

    }
    
    
    @Test
    public void arrayDeUnElemento_BIEN() {
        System.out.println("listado con un solo elemento");
        int[] arrayPasadoAlMetodo = {10,9};
        int respuestaesperado = 11;
        try {
            //int mayorDeLaLista = Examen.elMayorDe(arrayPasadoAlMetodo);
            if (Examen.elMayorDe(arrayPasadoAlMetodo) == respuestaesperado) {
                assertTrue("Test pasado",respuestaesperado==Examen.elMayorDe(arrayPasadoAlMetodo));
            }
        } catch (Exception e) {
            assertTrue(false);
        }
    }
    
    
    
       /**
     * array de mas de un valor donde el mayor no es el primero
     */
    
        @Test
    public void arrayDondeElMayorNoEsElPrimero() {
        System.out.println("mayor de un array esta colocado en ultima posicion : ");
        int[] listaEnteros = {2,3,4,1};
        int expResult = 4;

        try {
            int result = Examen.elMayorDe(listaEnteros);
            assertTrue(result == expResult);
        } catch (Exception e) {
            System.out.println("nooopppp");
        }

    }
    
    
    @Test
    public void testArray_vacio() {
        System.out.println("AAAAHHHHH vacio");
        
        int[] listaEnteros;
        listaEnteros = new int [Examen.TAMAÑOMAXIMO];
        
        try {
            int mayordelalista = Examen.elMayorDe(listaEnteros);
        } catch (Exception e) {
            assertTrue("Test pasado",true);
        }
    }

    @Test
    public void conListaTamañoGrande() {
        System.out.println("Tamaño maximoggdf + 1");
        int[] listaEnteros = new int[Examen.TAMAÑOMAXIMO + 1];
        for (int i = 0; i < (Examen.TAMAÑOMAXIMO + 1); i++) {
            listaEnteros[i] = i;
        }
        try {
            int mayordelalista = Examen.elMayorDe(listaEnteros);
        } catch (Exception e) {
            assertTrue("Test pasado", true);
        }
    }


}
