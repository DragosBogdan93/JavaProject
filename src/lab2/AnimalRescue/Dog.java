package lab2.AnimalRescue;

public class Dog {
    String name = "Azor";
    int age = 5;
    static int levelOfHealth = 5;
    int feelingHungry = 6;
    int moodLevel = 4;
    String favoriteFood = "Steak";
    String favoriteActivity = "Walking in the Park";

    public void bark() {
        System.out.println("Ham Ham!");
    }

    public void eat(int value) {
        feelingHungry -= value;
        System.out.println("Hmm, how well I ate, the level of feeling hungry is: " + feelingHungry);
    }

    public void sleep(int value) {
        moodLevel += value;
        System.out.println("I slept well and the mood level is: " + moodLevel);
    }

    public static void health(int value) {
        int health = levelOfHealth;
        System.out.println(health);
    }

}
