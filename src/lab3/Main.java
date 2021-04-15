package lab3;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        Calculator calculate = new Calculator();
        int biggest = op.checkBiggerNumber(23,45);
        System.out.println("The bigger number is: " + biggest);
        String text = op.checkText("Let is fly!");
        System.out.println(text);
        String textAndNumber = op.checkTextandNumber("Happy Birthday" , 4);
        System.out.println(textAndNumber);
        String verifyNumber = op.checkNumber(10);
        System.out.println(verifyNumber);
        String compareNumber = op.comparationNumber(2) ;
        System.out.println(compareNumber);
        op.searchNumber(4);
        boolean number = op.isNumberEven(5);
        System.out.println("Is the chosen number even: " + number);
        boolean youCanVote = op.isEligibleToVote(19);
        System.out.println("Have you the right to vote: " + youCanVote);
        int biggestNumber = op.getHigherNumber(23,34,124);
        System.out.println("The bigger number is: " + biggestNumber);

        System.out.println();
        System.out.println("Rezolvarea temei pentru laboratorul 5 !");
        System.out.println(calculate.sum(23.5f,45.7f));
        System.out.println(calculate.sum(5,3,4));
        System.out.println(calculate.substract(23,12,5));
        System.out.println(calculate.substract(23.6f,11.23f,4.55f));
        System.out.println(calculate.multiplication(23,34));
        System.out.println(calculate.multiplication(22.33f,23.56f,23.56f));
        System.out.println(calculate.division(23,34,11));
        System.out.println(calculate.division(100,22,22,11));
        System.out.println(calculate.mod(23,2,11));
        System.out.println(calculate.mod(111.456,10.234,3.222));
        System.out.println(calculate.equation(1111.11f,22.546f,22.765f));
        System.out.println(calculate.equation(56.45f,22,34));




    }
}
