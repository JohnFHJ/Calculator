/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import calculator.CalculatorClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

// ejemplo actualizado
/**
 *
 * @author Estudiante
 */
public class CalculatorJUnitTest {

    public CalculatorJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAdd() {
        CalculatorClass calculator = new CalculatorClass();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
        assertNotNull("Bad result :" + result);
    }

    @Test
    public void testResta() {
        CalculatorClass calculator = new CalculatorClass();
        double result = calculator.resta(40, 10);
        assertEquals(30, result, 0);
    }

    @Test
    public void testMultiplicacion() {
        CalculatorClass calculator = new CalculatorClass();
        double result = calculator.multiplicacion(5, 5);
        assertEquals(25, result, 0);
    }

    @Test
    public void testDivision() {
        CalculatorClass calculator = new CalculatorClass();
        double result = calculator.division(10, 2);
        assertEquals(5, result, 0);
    }
}
