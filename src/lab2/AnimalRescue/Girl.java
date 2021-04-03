package lab2.AnimalRescue;

public class Girl {
    String name = "Gloria";
    int age = 19;
    float budgetInEuro = 545.55f;
    String hair = "Blond";
    int heightInCm = 175;
    float weightInKg = 53;

    public void talk() {
        System.out.println("Hey, what an amazing dog!");
    }

    public void buy(float value) {
        budgetInEuro -= value;
        System.out.println("The remaining available budget is: " + budgetInEuro + " Euro");
    }


}
