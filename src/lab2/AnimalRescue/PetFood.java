package lab2.AnimalRescue;

public class PetFood {
    String nameProduct = "Steak";
    String nameProduct1 = "Fish";
    String nameProduct2 = "Pedigree";
    int priceProduct = 10;
    int priceProduct1 = 5;
    int priceProduct2 = 20;
    int stockProduct = 95;
    int stockProduct1 = 50;
    int stockProduct2 = 30;
    float weightProduct = 1.250f;
    float weightProduct1 = 0.500f;
    int weightProduct2 = 10;

    public void buyProduct(int value) {
        stockProduct -= value;
        System.out.println(stockProduct);
    }

    public void buyProduct1(int value) {
        stockProduct1 -= value;
        System.out.println(stockProduct1);
    }

    public void buyProduct2(int value) {
        stockProduct2 -= value;
        System.out.println(stockProduct2);
    }

    public void totalWeight(float value) {
        float totalWeight = lab2.Main.multiplication1(weightProduct, value);
        System.out.println("The total weight is: " + totalWeight + "kg");
    }

    public float totalPrice(float value) {
        float totalPrice = lab2.Main.multiplication1(priceProduct, value);
        System.out.println("The total payment to be paid is: " + totalPrice + " Euro");
        return totalPrice;
    }

}
