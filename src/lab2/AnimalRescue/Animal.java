package lab2.AnimalRescue;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private float height;
    private float weight;
    private int feelingHungry;
    private int moodLevel;
    private int levelOfHealth;
    private String favoriteFood;
    private String favoriteActivity;
    private boolean isMale;

    public  String getName() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
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

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public int getLevelOfHealth() {
        return levelOfHealth;
    }

    public void setLevelOfHealth(int levelOfHealth) {
        this.levelOfHealth = levelOfHealth;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public abstract void eat();
    public abstract void speak();
    public abstract void run();
    public abstract void sleep();

}
