package lab2.AnimalRescue;

public class Cat extends Animal {
    private boolean fur;

    public boolean hasFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void purr () {
        System.out.println("Purring");
    }

    @Override
    public void speak() {
        System.out.println("Miauuuu");
    }

    @Override
    public void eat() {
        System.out.println("Eating milk !");
    }
}
