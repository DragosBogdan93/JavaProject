package lab2.AnimalRescue;

public class MedicalStaff {
    String name = "Juned Baig";
    String specialization = "Veterinary medicine";
    int experienceInYears = 15;

    public void talk() {
        System.out.println("Hello, how can I help you?");
    }

    public void treatment(int value) {
        int levelOfHealth = 5;
        int newlevelOfHealth = lab2.Main.sum(value, Dog.levelOfHealth);
        System.out.println("The new level of health is: " + newlevelOfHealth);
    }
}
