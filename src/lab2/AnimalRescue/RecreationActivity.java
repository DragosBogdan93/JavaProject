package lab2.AnimalRescue;

public class RecreationActivity {
    private String nameRecreation;
    private float distance;

    public String getName() {
        return nameRecreation;
    }

    public void setName(String nameProduct) {
        this.nameRecreation = nameProduct;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void playing(int value) {
        int playing = value;
        System.out.println("I feel very happy that I played " + playing + " hours with Azor!");
    }

    public void runDist(int value) {
        int runDist = value;
        System.out.println("I ran: " + runDist + " Km");

    }
}
