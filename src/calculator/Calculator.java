/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author John
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            CalculatorClass calculator = new CalculatorClass();
        double result = calculator.add(10, 50);
        if (result != 60) {
            System.out.println("Bad result :" + result);
        } else {
            System.out.println("Good result:" + result);
        }
    }
    }
    

