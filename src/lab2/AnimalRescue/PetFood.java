package lab2.AnimalRescue;

import lab3.Calculator;

public class PetFood {
    Calculator calculate = new Calculator();
    private String nameProduct;
    private int priceProduct;
    private int stockProduct;
    private float weightProduct;

    public String getName() {
        return nameProduct;
    }

    public void setName(String nameProduct) {
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


    public void buyProduct(int value) {
        stockProduct -= value;
        System.out.println(stockProduct);
    }

    public void totalWeight(float value) {
        float totalWeight = calculate.multiplication1(weightProduct, value);
        System.out.println("The total weight is: " + totalWeight + "kg");
    }

    public float totalPrice(float value) {
        float totalPrice = calculate.multiplication1(priceProduct, value);
        System.out.println("The total payment to be paid is: " + totalPrice + " Euro");
        return totalPrice;
    }

}
