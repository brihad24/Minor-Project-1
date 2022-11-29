package org.example.domain;

public class Disease {
    private String diseaseName;
    private String specialist;

    public Disease(String diseaseName, String specialist) {
        this.diseaseName = diseaseName;
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "diseaseName='" + diseaseName + '\'' +
                ", specialist='" + specialist + '\'' +
                '}';
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
