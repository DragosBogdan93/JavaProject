package lab2.AnimalRescue;

public class Dog {
    private String name;
    private int age;
    private static int levelOfHealth;
    private int feelingHungry;
    private int moodLevel;
    private String favoriteFood;
    private String favoriteActivity;

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
    public int getLevelOfHealth() {
        return levelOfHealth;
    }
   public void setLevelOfHealth(int levelOfHealth) {
        this.levelOfHealth = levelOfHealth;
   }

   public int getFeelingHungry() {
        return feelingHungry;
   }
   public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;
   }
   public int getMoodLevel() {
        return moodLevel;
   }
   public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
   }
   public String getFavoriteFood() {
        return favoriteFood;
   }
   public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
   }
   public String getFavoriteActivity() {
        return favoriteActivity;
   }
   public void setFavoriteActivity(String favoriteActivity){
        this.favoriteActivity = favoriteActivity;
   }
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

    public void health(int value) {
        int health = levelOfHealth;
        System.out.println(health);
    }

}
