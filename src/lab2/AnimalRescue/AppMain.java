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
        azor.setColor("Black");
        azor.setHeight(65);
        azor.setWeight(34);
        azor.setMale(true);
        System.out.println(azor.getFeelingHungry());
        System.out.println(azor.getMoodLevel());
        azor.sleep();
        azor.eat();
        azor.speak();
        azor.run();



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
        food.setNameProduct("Pedigree");
        food.setPriceProduct(10);
        food.setWeightProduct(2.456f);
        food.setStockProduct(5);

        RecreationActivity recreation = new RecreationActivity();
        recreation.setNameRecreation("Aducerea mingii");
        FitnessActivity fitness = new FitnessActivity();
        fitness.setDistance(456.34f);

        Veterinarian doctor = new Veterinarian();
        doctor.setName("Juned Baig");
        doctor.setSpecialization("medicina veterinara");
        doctor.setExperienceInYears(10);
        doctor.talk();
        doctor.treatment(3);

        System.out.println("Pe cainele meu il cheama " + azor.getName() + " si are varsta de " + azor.getAge() + " ani," + " iar cel mai mult ii place sa se " + azor.getFavoriteActivity() + " si mancarea lui favoritata este " + azor.getFavoriteFood() + "!");
        System.out.println("Pe prietena mea o cheama " + princess.getName() + " si are " + princess.getAge() + " ani" + " cu coloarea parului " + princess.getHair() + " si are o inaltime de " + princess.getHeightInCm() + " cm si o greutate de " + princess.getWeightInKg() + " kg!");
        System.out.println("Impreuna cu prietena mea " + princess.getName() + " mergem cu catelul meu " + azor.getName() + " la doctorul " + doctor.getName() + " care are ca si specializare " + doctor.getSpecialization() + " si o experienta de " + doctor.getExperienceInYears() + " ani.");
        System.out.println("Dupa ce am plecat de la doctor cu " + princess.getName() + " si " + azor.getName() + " am intrat in magazinul de mancare pentru caini pentru a cumpara " + food.getNameProduct() + " la pretul de " + food.getPriceProduct() + " euro care cantareste " + food.getWeightProduct() + " kg,");
        System.out.println("deoarece in stock mai erau doar " + food.getStockProduct() + " bucati. Apoi am mers in parc si ne-am jucat cu " + azor.getName() + " " + recreation.getNameRecreation() + " iar apoi am alergat " + fitness.getDistance() + " metri.");


        Cat tommy = new Cat();
        Wolf jack = new Wolf();
        Nurse emilia = new Nurse();
        tommy.speak();
        tommy.eat();
        azor.speak();
        azor.eat();
        jack.speak();
        jack.eat();
        emilia.talk();



    }
}
