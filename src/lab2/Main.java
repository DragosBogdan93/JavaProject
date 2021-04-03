package lab2;

public class Main {
    private static final float distance = 13245;
    private static final float hr = 3;
    private static final float min = 23;
    private static final float sec = 43;

    public static void main(String[] args) {
        printName("Dragos");
        System.out.println("Rezultatul inmultirii este: " + multiplication(12, 32));
        System.out.println("Rezultatul impartirii este: " + division(11, 3));
        System.out.println("Restul impartirii a doua numere este: " + mod(34, 13));
        System.out.println("Rezultatul adunarii este: " + sum(23, 123));
        System.out.println("Rezultatul scaderii este: " + substract(65, 33));
        System.out.println("Rezultatul ecuatiei este: " + equation(45, 34, 55));
        System.out.println("Rezultatul inmultirii este: " + multiplication1(45, 4));
        printModel();
        printModel1();
        printModel2();
        printModel3();
        System.out.println("Media a trei numere este:" + division(equation1(12, 23, 21), 3));
        printDrawing();
        printDrawing1();
        printDrawing2();
        printDrawing3();
        printDrawing4();
        System.out.println("Temperatura in grade Celsius este " + gradeFahrenheit(89));
        System.out.println("Distanta in metrii este: " + distanceInch(222));
        System.out.println("Viteza in metrii pe secunde este: " + mps());
        System.out.println("Viteza in kilometrii pe ora este: " + kph());
        System.out.println("Viteza in mile pe ora este: " + mph());


    }

    public static int multiplication(int first, int second) {
        int multiplication = first * second;
        return multiplication;
    }

    public static float division(float first, float second) {
        float division = first / second;
        return division;
    }

    public static int mod(int first, int second) {
        int mod = first % second;
        return mod;
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int substract(int first, int second) {
        int substract = first - second;
        return substract;
    }

    public static float equation(float first, float second, float third) {
        float equation = first + second - third;
        return equation;
    }

    public static float multiplication1(float first, float second) {
        float multiplication1 = first * second;
        return multiplication1;
    }

    public static void printName(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void printModel() {
        System.out.println("   J    a   v     v   a");
    }

    public static void printModel1() {
        System.out.println("   J   a a   v   v   a a");
    }

    public static void printModel2() {
        System.out.println("J  J  aaaaa   v v   aaaaa");
    }

    public static void printModel3() {
        System.out.println(" JJ  a     a   v   a     a");
    }

    public static int equation1(int first, int second, int third) {
        int equation1 = first + second + third;
        return equation1;
    }

    public static void printDrawing() {
        System.out.println(" +”””””+ ");
    }

    public static void printDrawing1() {
        System.out.println("[| o o |]");
    }

    public static void printDrawing2() {
        System.out.println(" |  ^  |");
    }

    public static void printDrawing3() {
        System.out.println(" | ´-´ |");
    }

    public static void printDrawing4() {
        System.out.println(" +_____+");
    }

    public static float gradeFahrenheit(int first) {
        int gradeFahrenheit = substract(first, 32);
        float gradeCelsius = multiplication1(division(5, 9), gradeFahrenheit);
        return gradeCelsius;
    }

    public static float distanceInch(float first) {
        float distanceInch = first;
        float paraMeter = (float) 39.370;
        float distanceMeter = division(distanceInch, paraMeter);
        return distanceMeter;
    }

    public static float mps() {
        float timeSeconds = (multiplication1(hr, 3600) + multiplication1(min, 60) + sec);
        float mps = division(distance, timeSeconds);
        return mps;
    }

    public static float kph() {
        float timeSeconds = (multiplication1(hr, 3600) + multiplication1(min, 60) + sec);
        float kph = division(division(distance, 1000.0f), division(timeSeconds, 3600.0f));
        return kph;
    }

    public static float mph() {
        float timeSeconds = (multiplication1(hr, 3600) + multiplication1(min, 60) + sec);
        float kph = division(division(distance, 1000.0f), division(timeSeconds, 3600.0f));
        float mph = division(kph, 1.609f);
        return mph;

    }


}

