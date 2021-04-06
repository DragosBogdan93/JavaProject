package lab3;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
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


    }
}
