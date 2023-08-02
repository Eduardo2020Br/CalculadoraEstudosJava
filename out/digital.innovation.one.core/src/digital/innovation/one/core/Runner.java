package digital.innovation.one.core;

import digital.innovation.one.utils.Calculator;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("divisão de 10 por 2        = "+ calculator.div(10,3));
        //System.out.println(calculator.div(10,2));
        System.out.println("multiplicação de 43456 por 1389 = " + calculator.mult(43456,1389));
        System.out.println("soma de 8 com 34           = " + calculator.sum(8,34) );
        System.out.println("subtrair 34 de 222         = " + calculator.sub(34,222) );
    }
}
