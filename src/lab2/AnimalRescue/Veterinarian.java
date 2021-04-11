package lab2.AnimalRescue;

import lab3.Calculator;

public class Veterinarian extends MedicalStaff {
    Calculator calculate = new Calculator();
    Dog azor = new Dog();

    public void treatment(int value) {
        int newlevelOfHealth = calculate.sum(value, azor.getLevelOfHealth());
        System.out.println("The new level of health is: " + newlevelOfHealth);
    }
    public void giveShot() {
        System.out.println("The vet is giving a shot to ");
    }
}
