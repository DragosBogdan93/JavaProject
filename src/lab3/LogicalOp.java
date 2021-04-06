package lab3;

public class LogicalOp {
    public int checkBiggerNumber (int first, int second){
        if (first > second) {
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
    public String checkTextandNumber(String text,int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return (number + text);
        }
        return ("");

    }
    public String checkNumber (int number) {
        if (number > 8 || number == 6) {
            return ("The amount of snow this winter was: " + number + " cm.");
        } else {
            return ("The forecast snow is: " + number + " cm." );

        }
    }
    public String comparationNumber (int number) {
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
    public void searchNumber (int number) {
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
    public boolean isNumberEven (int chosenNumber) {
        if (chosenNumber % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isEligibleToVote(int age) {
        if (age > 18 ) {
            return true;
        }else if (age == 18) {
            return true;
        }else  {
            return false;
        }
    }
    public int getHigherNumber (int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }
}
