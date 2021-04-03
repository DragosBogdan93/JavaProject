package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog azor = new Dog();
        System.out.println(azor.age);
        System.out.println(azor.favoriteActivity);
        azor.eat(3);
        System.out.println(azor.favoriteFood);
        System.out.println(azor.favoriteActivity);
        azor.sleep(4);
        azor.bark();
        System.out.println(azor.levelOfHealth);

        Girl Princess = new Girl();
        System.out.println(Princess.name);
        System.out.println(Princess.age + " Age");
        System.out.println("The current budget is: " + Princess.budgetInEuro + " Euro ");
        Princess.talk();
        Princess.buy(234.44f);

        PetFood steak = new PetFood();
        steak.totalWeight(5);
        steak.totalPrice(12);
        Princess.buy(steak.totalPrice(24));

        RecreationActivity playingWithTheBall = new RecreationActivity();
        playingWithTheBall.playing(3);
        RecreationActivity running = new RecreationActivity();
        playingWithTheBall.runDist(3);

        MedicalStaff Doctor = new MedicalStaff();
        System.out.println(Doctor.name);
        System.out.println(Doctor.experienceInYears + " Years");
        System.out.println("My specialization is: " + Doctor.specialization);
        Doctor.talk();
        Doctor.treatment(5);


    }
}
