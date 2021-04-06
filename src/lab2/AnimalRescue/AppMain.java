package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog azor = new Dog();
        azor.setName("Azor");
        azor.setAge(2);
        azor.setFavoriteActivity("plimbe in parc");
        azor.setFavoriteFood("friptura de Steak");
        azor.setFeelingHungry(3);
        azor.setMoodLevel(7);
        azor.setLevelOfHealth(3);
        System.out.println(azor.getFeelingHungry());
        System.out.println(azor.getMoodLevel());
        azor.eat(5);
        azor.sleep(4);
        azor.bark();
        azor.health(6);


        Girl princess = new Girl();
        princess.setName("Gloria");
        princess.setAge(17);
        princess.setBudgetInEuro(323.456f);
        princess.setHair("blond");
        princess.setHeightInCm(165);
        princess.setWeightInKg(52.45f);


        princess.talk();
        princess.buy(234.44f);

        PetFood food = new PetFood();
        food.setName("Pedigree");
        food.setPriceProduct(10);
        food.setWeightProduct(2.456f);
        food.setStockProduct(5);

        RecreationActivity activity = new RecreationActivity();
        activity.setName("prinderea mingii");
        activity.setDistance(500.456f);
        activity.playing(3);
        activity.runDist(3);

        MedicalStaff doctor = new MedicalStaff();
        doctor.setName("Juned Baig");
        doctor.setSpecialization("medicina veterinara");
        doctor.setExperienceInYears(10);


        doctor.talk();
        doctor.treatment(3);

        System.out.println("Pe cainele meu il cheama " + azor.getName() + " si are varsta de " + azor.getAge() + " ani," + " iar cel mai mult ii place sa se " + azor.getFavoriteActivity() + " si mancarea lui favoritata este " + azor.getFavoriteFood() + "!");
        System.out.println("Pe prietena mea o cheama " + princess.getName() + " si are " + princess.getAge() + " ani" + " cu coloarea parului " + princess.getHair() + " si are o inaltime de " + princess.getHeightInCm() + " cm si o greutate de " + princess.getWeightInKg() + " kg!");
        System.out.println("Impreuna cu prietena mea " + princess.getName() + " mergem cu catelul meu " + azor.getName() + " la doctorul " + doctor.getName() + " care are ca si specializare " + doctor.getSpecialization() + " si o experienta de " + doctor.getExperienceInYears() + " ani.");
        System.out.println("Dupa ce am plecat de la doctor cu " + princess.getName() + " si " + azor.getName() + " am intrat in magazinul de mancare pentru caini pentru a cumpara " + food.getName() + " la pretul de " + food.getPriceProduct() + " euro care cantareste " + food.getWeightProduct() + " kg,");
        System.out.println("deoarece in stock mai erau doar " + food.getStockProduct() + " bucati. Apoi am mers in parc si ne-am jucat cu " + azor.getName() + " " + activity.getName() + " iar apoi am alergat " + activity.getDistance() + " metri.");


    }
}
