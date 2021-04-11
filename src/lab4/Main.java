package lab4;

import lab3.LogicalOp;

public class Main {
    public static void main(String[] args) {
        lab3.LogicalOp op = new LogicalOp();
        op.printToHundred(10);
        op.printToNegHundred(45);
        op.printFromTo(4,13);
        op.printFromLowertoBigger(34,23);
        op.printEvenNumbers(1,100);
        op.printOddNumbers(1,100);
        System.out.println(op.getSumFromInterval(1,100));
        System.out.println(op.getAverageFromInterval(100,1));
        op.drawPattern(2);
        op.printToHundredWhile(1);
        op.printToNegHundredWhile(50);
        op.printFromToWhile(10,20);
        op.printFromLowertoBiggerWhile(7,2);
        op.printEvenNumbersWhile(1,100);
        op.printOddNumbersWhile(1,100);
        System.out.println(op.getAverageFromIntervalWhile(111,8899));
        System.out.println(op.getAverageFromIntervalDivisible(23,123));
        op.printFibonacci(20);



    }
}
