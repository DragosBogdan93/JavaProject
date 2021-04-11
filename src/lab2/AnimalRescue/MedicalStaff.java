package lab2.AnimalRescue;

import lab3.Calculator;

public class MedicalStaff {
    private String name;
    private String specialization;
    private int experienceInYears;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
    public void talk() {
        System.out.println("Hello, how can I help you?");
    }

}
