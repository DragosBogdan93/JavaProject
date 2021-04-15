package lab2.AnimalRescue;

import lab3.Calculator;

public class Food {
    Calculator calculate = new Calculator();
    private String nameProduct;
    private int priceProduct;
    private int stockProduct;
    private float weightProduct;
    private boolean eatAble;


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(int stockProduct) {
        this.stockProduct = stockProduct;
    }

    public float getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(float weightProduct) {
        this.weightProduct = weightProduct;
    }

    public boolean isEatAble() {
        return eatAble;
    }

    public void setEatAble(boolean eatAble) {
        this.eatAble = eatAble;

    }

    public void buyProduct(int value) {
        stockProduct -= value;
        System.out.println(stockProduct);
    }

    public void totalWeight(float value) {
        float totalWeight = calculate.multiplication(weightProduct, value);
        System.out.println("The total weight is: " + totalWeight + "kg");
    }

    public float totalPrice(float value) {
        float totalPrice = calculate.multiplication(priceProduct, value);
        System.out.println("The total payment to be paid is: " + totalPrice + " Euro");
        return totalPrice;
    }
}
