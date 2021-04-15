package lab2.AnimalRescue;

public class Dog extends Animal {
   private String fur;

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public void speak() {
        System.out.println("Ham Ham !");
    }

    @Override
    public void eat() {
        System.out.println("Eating Pedigree");
    }
}
