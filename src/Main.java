import lab3.Calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Dragos Bogdan Dumitras");
        System.out.println(3+3);
        System.out.println(234/11f);
        System.out.print("Rezultatul operatiei a. este:");
        System.out.println(-5+8*6);
        System.out.print("Rezultatul operatiei b. este:");
        System.out.println((55+9)%9);
        System.out.print("Rezultatul operatiei c. este:");
        System.out.println(20+ -3*5/8f);
        System.out.print("Rezultatul operatiei d. este:");
        System.out.println(5+15/3*2-8%3);

        System.out.println("De aici am facut pentru tema din laboratorul 2 de java");
        System.out.println("Eu am creat metodele in lab2 si de acolo le-am chemat aici sa pot rezolva ecuatiile");

        printHello();
        printMyName();
        Calculator calculate = new Calculator();
        int i = calculate.sum(3,3);
        System.out.println("Rezultatul adunarii este: " +  i);
        float j = calculate.division(234,11);
        System.out.println("Rezultatul impartirii este: " + j);
        int x = -5;
        int y = calculate.multiplication(8,6);
        int z = x + y;
        System.out.println("Rezultatul operatiei a. este: " + z);
        int a = calculate.sum(55,9);
        int b = calculate.mod(a,9);
        System.out.println("Rezultatul operatiei b. este: " + b);
        int c = 20;
        int d = calculate.multiplication(-3,5);
        float e = calculate.division(-15,8);
        float f = c + e;
        System.out.println("Rezultatul operatiei c. este: " + f);
        int g = 5;
        float h = calculate.division(15,3);
        float k = calculate.multiplication1(h,2);
        int l = calculate.mod(8,3);
        float Result = calculate.equation(g,k,l);
        System.out.println("Rezultatul operatiei d. este: " + Result);
    }
    public static void printHello() {
        System.out.println("Hello World!");
    }
    public static void printMyName(){
        System.out.println("Dragos Bogdan Dumitras");
    }



}
