package lab3;

public class LogicalOp {


    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public int checkLowerNumber(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }

    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public String checkTextandNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return (number + text);
        }
        return ("");

    }

    public String checkNumber(int number) {
        if (number > 8 || number == 6) {
            return ("The amount of snow this winter was: " + number + " cm.");
        } else {
            return ("The forecast snow is: " + number + " cm.");

        }
    }

    public String comparationNumber(int number) {
        if (number > 3 && number != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            return ("The number is equal to 4");
        } else if (number == 3) {
            return ("The number is equal to 3");
        } else {
            return ("The number is lower than 3");
        }

    }

    public void searchNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is: 1");
                break;
            case 2:
                System.out.println("The number is: 2");
                break;
            case 3:
                System.out.println("The number is: 3");
                break;
            case 4:
                System.out.println("The number is: 4");
                break;
            case 10:
                System.out.println("The number is: 10");
                break;
            default:
                System.out.println("The number is not: 1,2,3,4 or 10");
                break;

        }
    }

    public boolean isNumberEven(int chosenNumber) {
        if (chosenNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        } else if (age == 18) {
            return true;
        } else {
            return false;
        }
    }

    public int getHigherNumber(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }

    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println("The number is: " + i);
        }
    }

    public void printToNegHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println("The number is: " + i);
        }
    }

    public void printFromTo(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }

    public void printFromLowertoBigger(int first, int second) {
        LogicalOp op = new LogicalOp();
        int bigger = op.checkBiggerNumber(first, second);
        int small = op.checkLowerNumber(first, second);
        for (int x = small; x <= bigger; x++) {
            System.out.println(x);
        }
    }

    public void printEvenNumbers(int first, int second) {
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int first, int second) {
        for (int i = first; i <= second; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int getSumFromInterval(int first, int second) {
        int sum = 0;
        for (int i = first; i <= second; i++) {
            sum += i;
        }
        return sum;
    }

    public float getAverageFromInterval(int first, int second) {
        LogicalOp op = new LogicalOp();
        int small = op.checkLowerNumber(first, second);
        int bigger = op.checkBiggerNumber(first, second);
        float sum = 0;
        int count = 0;
        for (int i = small; i <= bigger; i++) {
            sum += i;
            count++;
        }
        return sum / count;
    }

    public void drawPattern(int n) {
        for (int column = 0; column < n; column++) {
            for (int row = 0; row < n - column; row++) {
                System.out.print("*");
            }
            for (int k = 0; k <= column; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printToHundredWhile(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public void printToNegHundredWhile(int number) {
        int i = number;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    public void printFromToWhile(int first, int second) {
        int i = first;
        while (i <= second) {
            System.out.println(i);
            i++;
        }
    }

    public void printFromLowertoBiggerWhile(int first, int second) {
        LogicalOp op = new LogicalOp();
        int small = op.checkLowerNumber(first, second);
        int bigger = op.checkBiggerNumber(first, second);
        int x = small;
        while (x <= bigger) {
            System.out.println(x);
            x++;
        }
    }

    public void printEvenNumbersWhile(int first, int second) {
        int i = first;
        while (i <= second) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void printOddNumbersWhile(int first, int second) {
        int i = first;
        while (i <= second) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public float getAverageFromIntervalWhile(int first, int second) {
        LogicalOp op = new LogicalOp();
        int small = op.checkLowerNumber(first, second);
        int bigger = op.checkBiggerNumber(first, second);
        float sum = 0;
        int count = 0;
        int i = small;
        while (i <= bigger) {
            sum += i;
            count++;
            i++;
        }
        return sum / count;
    }

    public float getAverageFromIntervalDivisible(int first, int second) {

        float sum = 0;
        int count = 0;
        int i = first;
        while (i <= second) {
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        return sum / count;
    }

    public void printFibonacci(int maxLenght) {
        int i = 0;
        int y = 1;
        int count = 0;
        while (count < maxLenght) {
            System.out.println(i);
            int nextNumber = y + i;
            i = y;
            y = nextNumber;
            count++;
        }
    }

    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void setArray(int[] array, int maxValue) {
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
        }
    }

    public void getEvenNumberArray(int[] array, int maxValue) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public float getAverageFromArray(int[] array) {
        float sum = 0f;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        float average = sum / array.length;
        return average;
    }

    public boolean isInArray(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(text)) {
                return true;
            }
        }
        return false;
    }

    public void isNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("That number was found at index: " + i);
            }
        }
    }
}


