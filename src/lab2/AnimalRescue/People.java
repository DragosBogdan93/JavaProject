package lab2.AnimalRescue;

public class People {
    private String name;
    private int age;
    private float budgetInEuro;
    private String hair;
    private int heightInCm;
    private float weightInKg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getBudgetInEuro() {
        return budgetInEuro;
    }

    public void setBudgetInEuro(float budgetInEuro) {
        this.budgetInEuro = budgetInEuro;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(float weightInKg) {
        this.weightInKg = weightInKg;
    }

    public void talk() {
        System.out.println("Hey, what an amazing dog!");
    }

    public void buy(float value) {
        budgetInEuro -= value;
        System.out.println("The remaining available budget is: " + budgetInEuro + " Euro");
    }
}
