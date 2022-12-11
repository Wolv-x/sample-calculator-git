package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();

        System.out.println("NEW Changes");

        int addition = c.addition(9, 10);
        System.out.println("c.addition(9, 10" + addition);

        int subtraction = c.subtraction(7, 1);
        System.out.println("c.subtraction(7, 1) = " + subtraction);

        double division = c.division(20,2);
        System.out.println("c.division(20,2) = " + division);


    }
}