package es.iessoterhernandez.daw.endes.fibonacciMain;

import java.util.Arrays;
import es.iessoterhernandez.daw.endes.*;

public class FibonacciMain {

    public static void main(String[] args) {

    	final int NUMBER = 23;
        int[] sequence = Fibonacci.fibonacci(NUMBER);

        System.out.println("F(" + NUMBER + ") = " + Arrays.toString(sequence));

    }

}
