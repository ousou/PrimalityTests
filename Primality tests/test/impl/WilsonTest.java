package impl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Björkqvist
 */
public class WilsonTest {

    public WilsonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testIsPrime2() {
        assertTrue(Wilson.isPrime(2));
    }

    @Test
    public void testIsPrime3() {
        assertTrue(Wilson.isPrime(3));
    }    

    @Test
    public void testIsPrime4() {
        assertFalse(Wilson.isPrime(4));
    }      

    @Test
    public void testIsPrime5() {
        assertTrue(Wilson.isPrime(5));
    }       

    @Test
    public void testIsPrime7() {
        assertTrue(Wilson.isPrime(7));
    }      

    @Test
    public void testIsPrime9() {
        assertFalse(Wilson.isPrime(9));
    }      

    @Test
    public void testIsPrime17() {
        assertTrue(Wilson.isPrime(17));
    }      

    @Test
    public void testIsPrime39() {
        assertFalse(Wilson.isPrime(39));
    }      

    @Test
    public void testIsPrime79() {
        assertTrue(Wilson.isPrime(79));
    }     
    
    @Test
    public void testIsPrime221() {
        assertFalse(Wilson.isPrime(221));
    }
}