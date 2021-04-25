package lab2.AnimalRescue;

public abstract  class Cat extends Animal {
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




}
