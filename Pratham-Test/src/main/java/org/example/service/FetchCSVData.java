package org.example.service;

import org.example.domain.Disease;
import org.example.domain.Doctor;

import javax.print.Doc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FetchCSVData {
    private String space = "";
    private String splitBy = ",";
    private Map<String, Set<Doctor>> doc = new LinkedHashMap<>();
    private Map<String, Set<String>> dis = new LinkedHashMap<>();

    public void fetchDoctorCSVData() {
        try {
            FileReader file = new FileReader("C:\\Users\\DELL\\Downloads\\Pratham-Test\\data\\doctor.csv"); // filepath change
            BufferedReader br = new BufferedReader(file);
            while ((space = br.readLine()) != null) {
                String[] dr = space.split(splitBy);
                Doctor doctor = new Doctor(dr[0], dr[1], dr[2], dr[3], dr[4]);

                if (doc.containsKey(doctor.getSpecialist())) {
                    doc.get(doctor.getSpecialist()).add(doctor);
                } else {
                    doc.put(doctor.getSpecialist(), new HashSet<>(Collections.singleton(doctor)));
                }
            }

            doc.forEach((k, v) -> {
                System.out.println(k);
                v.forEach(doctor -> System.out.println("Name: " + doctor.getName() + " | Contact: " + doctor.getContact() + " | Address: " + doctor.getAddress() + " | Availability: " + doctor.getAvaibilitySchedule()));
                System.out.println("");
            });
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fetchDiseaseCSVData() {
        try {
            FileReader file = new FileReader("C:\\Users\\DELL\\Downloads\\Pratham-Test\\data\\disease.csv"); // filepath change
            BufferedReader br = new BufferedReader(file);
            while ((space = br.readLine()) != null) {
                String[] di = space.split(splitBy);
                Disease disease = new Disease(di[1], di[0]);

                if (dis.containsKey(disease.getSpecialist())) {
                    dis.get(disease.getSpecialist()).add(disease.getDiseaseName());
                } else {
                    dis.put(disease.getSpecialist(), new HashSet<>(Collections.singleton(disease.getDiseaseName())));
                }
            }

            dis.forEach((k, v) -> {
                System.out.println(k);
                v.forEach(disease -> System.out.println("Disease: " + disease));
                System.out.println("");
            });
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        fetchDoctorCSVData();
        fetchDiseaseCSVData();
    }

    public void findNearByDoctor(String disease) {
        String spec = getSpec(disease);
        Set<Doctor> doctorSet = getDoctors(spec);
        System.out.println(doctorSet);
    }

    private Set<Doctor> getDoctors(String spec) {
        Set<Doctor> doctors = new HashSet<>();

        for (Map.Entry<String, Set<Doctor>> entry : doc.entrySet()) {
            if (entry.getKey().equals(spec)) {
                doctors.addAll(entry.getValue());
            }
        }

        return doctors;
    }
    
    private String getSpec(String disease) {
        String spec = "";

        for (Map.Entry<String, Set<String>> entry : dis.entrySet()) {
            if (entry.getValue().contains(disease)) {
                spec = entry.getKey();
            }
        }
        return spec;
    }
}
