/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

import junit.framework.TestCase;

/**
 *
 * @author Junior Mendes
 */
public class TrianguloTest extends TestCase {
    
    public TrianguloTest(String testName) {
        super(testName);
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of Classificar method, of class Triangulo.
     */
    public void testClassificar() {
        System.out.println("Classificar");
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        Triangulo instance = new Triangulo();
        String expResult = "";
        String result = instance.Classificar(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
