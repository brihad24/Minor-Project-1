package org.example.service;

import org.example.domain.Disease;
import org.example.domain.Doctor;

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

            // doc.forEach((k, v) -> {
            //     System.out.println(k);
            //     v.forEach(doctor -> System.out.println("Name: " + doctor.getName() + " | Contact: " + doctor.getContact() + " | Address: " + doctor.getAddress() + " | Availability: " + doctor.getAvaibilitySchedule()));
            //     System.out.println("");
            // });
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

            // dis.forEach((k, v) -> {
            //     System.out.println(k);
            //     v.forEach(disease -> System.out.println("Disease: " + disease));
            //     System.out.println("");
            // });
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        fetchDoctorCSVData();
        fetchDiseaseCSVData();
    }

    public void findNearByDoctor(List<String> disease, String location) {
        Set<String> spec = getSpec(disease);
        for(String di : spec) {
            Set<Doctor> doctorSet = getDoctors(di, location);
            doctorSet.forEach(d -> {
                System.out.println("Name: " + d.getName() + " | Contact: " + d.getContact() + " | Address: " + d.getAddress() + " | Availability: " + d.getAvaibilitySchedule() + " | Spec: " + d.getSpecialist());
            });
        }
        // System.out.println(doctorSet);
    }

    private Set<Doctor> getDoctors(String spec, String location) {
        Set<Doctor> doctors = new HashSet<>();

        for (Map.Entry<String, Set<Doctor>> entry : doc.entrySet()) {
            if (entry.getKey().equals(spec)) {
                for (Doctor child : entry.getValue()) {
                    if (child.getAddress().equals(location)) {
                        doctors.add(child);
                    }
                }
            }
        }

        return doctors;
    }
    
    private Set<String> getSpec(List<String> disease) {
        Set<String> spec = new HashSet<>();

        for (Map.Entry<String, Set<String>> entry : dis.entrySet()) {
            // System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
            for (String dead: disease) {
                if (entry.getValue().contains(dead)) {
                    spec.add(entry.getKey());
                }
            }
            // if (entry.getValue().contains(disease)) {
            //     spec.add(entry.getKey());
            // }
        }
        return spec;
    }
}


// Pinetown