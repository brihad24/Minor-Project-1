package org.example.domain;

public class Doctor {
    private String name;
    private String contact;
    private String address;
    private String avaibilitySchedule;
    private String specialist;

    public Doctor(String name, String contact, String address, String avaibilitySchedule, String specialist) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.avaibilitySchedule = avaibilitySchedule;
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", avaibilitySchedule='" + avaibilitySchedule + '\'' +
                ", specialist='" + specialist + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvaibilitySchedule() {
        return avaibilitySchedule;
    }

    public void setAvaibilitySchedule(String avaibilitySchedule) {
        this.avaibilitySchedule = avaibilitySchedule;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
