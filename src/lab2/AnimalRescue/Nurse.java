package lab2.AnimalRescue;

public class Nurse extends MedicalStaff{
public void oversees () {
    System.out.println("I went to supervise a patient");
}

    @Override
    public void talk() {
        System.out.println("Wait here please, i need to find the Veterinarian ! ");
    }
}
