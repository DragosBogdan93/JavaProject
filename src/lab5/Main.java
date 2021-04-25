package lab5;

import lab3.LogicalOp;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int[] myArray = new int[100];
        op.setArray(myArray, 100);
        op.printArray(myArray);
        op.getEvenNumberArray(myArray, 100);
        System.out.println(op.getAverageFromArray(myArray));
        String[] newArray = new String[5];
        newArray[0] = "Loca";
        newArray[1] = "Boca";
        newArray[2] = "Minus";
        newArray[3] = "Plus";
        newArray[4] = "Alabala";
        System.out.println(op.isInArray(newArray, "Alabala"));
        int[] numberArray = {2, 4, 5, 6, 7, 4, 43, 21213, 343, 4};
        op.isNumberInArray(numberArray, 4);



    }

}

