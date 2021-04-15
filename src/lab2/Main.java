package lab2;


import lab3.Calculator;

public class Main {


    public static void main(String[] args) {
        printName("Dragos");
        Calculator calculate = new Calculator();
        calculate.setDistance(12000);
        calculate.setHr(5);
        calculate.setMin(45);
        calculate.setSec(34);
        System.out.println("Rezultatul inmultirii este: " + calculate.multiplication(12, 32));
        System.out.println("Rezultatul impartirii este: " + calculate.division(11,3));
        System.out.println("Restul impartirii a doua numere este: " + calculate.mod(34, 13));
        System.out.println("Rezultatul adunarii este: " + calculate.sum(23, 123));
        System.out.println("Rezultatul scaderii este: " + calculate.substract(65, 33));
        System.out.println("Rezultatul ecuatiei este: " + calculate.equation(45, 34, 55));
        System.out.println("Rezultatul inmultirii este: " + calculate.multiplication(45, 4));
        printModel();
        System.out.println("Media a trei numere este: " + calculate.division(calculate.equation(12, 23, 21), 3));
        printDrawing();
        System.out.println("Temperatura in grade Celsius este " + calculate.gradeFahrenheit(33));
        System.out.println("Distanta in metrii este: " + calculate.distanceInch(222));
        System.out.println("Viteza in metrii pe secunde este: " + calculate.mps());
        System.out.println("Viteza in kilometrii pe ora este: " + calculate.kph());
        System.out.println("Viteza in mile pe ora este: " + calculate.mph());


    }

    public static void printName(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void printModel() {
        System.out.println("   J    a   v     v   a");
        System.out.println("   J   a a   v   v   a a");
        System.out.println("   J   a a   v   v   a a");
        System.out.println("J  J  aaaaa   v v   aaaaa");
        System.out.println(" JJ  a     a   v   a     a");
    }
    public static void printDrawing() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | ´-´ |");
        System.out.println(" +_____+");
    }
}

