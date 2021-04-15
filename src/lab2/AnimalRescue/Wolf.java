package lab2.AnimalRescue;

public class Wolf extends Animal{
    public void howl() {
        System.out.println("Howling");
    }

    @Override
    public void speak() {
        System.out.println("Auuuuu");
    }

    @Override
    public void eat() {
        System.out.println("Eating a deer !");
    }
}
