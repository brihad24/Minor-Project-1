package org.example;
import org.example.service.FetchCSVData;
// package org.example.service;
// import org.example.service.FetchCSVData;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;
import java.text.DecimalFormat;

public class Algorithm{
    static double prob_fungalItch = 0.47, prob_fungalRash = 0.26, prob_fungalSkinNodes = 1, prob_fungalPatches = 1;

    static double prob_diabetesWeightLoss = 0.5, prob_diabetesFatigue = 0.16, prob_diabetesRestless = 1, prob_diabetesLaze = 1, prob_diabetesSugar = 1, prob_diabetesObesity = 1, prob_diabetesVision = 1, prob_diabetesHunger = 1, prob_diabetesAppetite = 1, prob_diabetesMoreUrine = 1;

    static double prob_jaundiceItch = 0.53, prob_jaundiceVomit = 0.27, prob_jaundiceYellowSkin = 1, prob_jaundiceFatigue = 0.16, prob_jaundiceWeightLoss = 0.5, prob_jaundiceFever = 0.16, prob_jaundiceDarkUrine = 1, prob_jaundiceAbdomenPain = 0.5;

    static double prob_malariaChills = 0.19, prob_malariaVomit = 0.19, prob_malariaFever = 0.18, prob_malariaSweat = 0.5, prob_malariaHeadache = 0.24, prob_malariaNausea = 0.32, prob_malariaDiarrhoea = 0.47, prob_malariaMusclePain = 0.33;

    static double prob_dengueRash = 0.31, prob_dengueChills = 0.19, prob_dengueVomit = 0.27, prob_dengueJointPain = 1, prob_dengueFever = 0.18, prob_dengueHeadache = 0.27, prob_dengueNausea = 0.36, prob_dengueAppetite = 1, prob_dengueEyePain = 1, prob_dengueBackPain = 1, prob_dengueMusclePain = 0.37, prob_dengueMalaise = 0.33, prob_dengueRedSpots = 1;

    static double prob_typhoidChills = 0.22, prob_typhoidVomiting = 0.25, prob_typhoidFatigue = 0.2, prob_typhoidFever = 0.18, prob_typhoidNausea = 0.32, prob_typhoidHeadache = 0.24, prob_typhoidConstipation = 1, prob_typhoidAbdominalPain = 0.5, prob_typhoidDiarrhoea = 0.53, prob_typhoidTyphos = 1, prob_typhoidBellyPain = 1;

    static double prob_coldSneezing = 1, prob_coldChills = 0.19, prob_coldFatigue = 0.16, prob_coldCough = 0.5, prob_coldFever = 0.16, prob_coldHeadache = 0.24, prob_coldSwelledLymphNodes = 1, prob_coldMalaise = 0.29, prob_coldPhlegm = 0.53, prob_coldThroatIrritation = 1, prob_coldRedEye = 1, prob_coldSinusPressure = 1, prob_coldRunnyNose = 1, prob_coldCongestion = 1, prob_coldChestPain = 0.45, prob_coldSmellLoss = 1, prob_coldMusclePain  = 0.29;

    static double prob_pneumoniaChills = 0.19, prob_pneumoniaFatigue = 0.16, prob_pneumoniaCough = 0.5, prob_pneumoniaFever = 0.16, prob_pneumoniaBreathlessness = 1, prob_pneumoniaSweating = 0.5, prob_pneumoniaMalaise = 0.37, prob_pneumoniaChestPain = 0.55, prob_pneumoniaFastHeartRate = 1, prob_pneumoniaRustySuptum, prob_pneumoniaPhlegm = 0.47;

    static double prob_acneRash = 0.38, prob_acnePus = 1, prob_acneBlackhead = 1, prob_acneScurring = 1;

    static String DiagnosedDisease1 = "", DiagnosedDisease2 = "", DiagnosedDisease3 = "";
    static String[] tempsArray = {}, inputSymptoms = {};
    static HashMap<String, Integer> symptomsMap = new HashMap<String, Integer>();
    static HashMap<String, Double> diseaseMap = new HashMap<String, Double>();
    static double DiseaseProb[] = new double[9];
    static String[] diseaseList = {"Fungal Infection", "Diabetes", "Jaundice", "Malaria", "Typhoid", "Cold", "Pneumonia", "Acne"};
    static List<String> TopDiseases = new ArrayList<String>();

// Reads the downloaded text file
    static void readTxt() throws FileNotFoundException  
    {
        String token1 = "";
        File text = new File("D:\\College stuff\\3rd year\\Minor\\Project 2.0\\Back end\\src\\main\\java\\org\\example\\symptoms.txt");
        Scanner inFile1 = new Scanner(text);

        List<String> temps = new ArrayList<String>();

        // while loop
        while (inFile1.hasNext()) {
        // find next line
        token1 = inFile1.next();
        temps.add(token1);
        }
        inFile1.close();

        String[] tempsArray = temps.toArray(new String[0]);

        inputSymptoms = tempsArray[0].split("[,]",0);
        text.delete();
    }

// Reads the CSV file and creates a hashmap
    static void createHashMap()
    {
        String[] symptomsList = {"abdominal_pain", "back_pain","belly_pain","blackheads","blurred_and_distorted_vision","breathlessness","chest_pain","chills","congestion","constipation","continuous_sneezing","cough","dark_urine","diarrhoea","dischromic_patches","excessive_hunger","fast_heart_rate","fatigue","headache","high_fever","increased_appetite","irregular_sugar_level","joint_pain","lethargy","loss_of_appetite","loss_of_smell","malaise","muscle_pain","nausea","nodal_skin_eruptions","obesity","pain_behind_the_eyes","phlegm","polyuria","pus_filled_pimples","red_spots_over_body","redness_of_eyes","restlessness","runny_nose","rusty_sputum","scurring","sinus_pressure","skin_rash","sweating","swelled_lymph_nodes","throat_irritation","toxic_look_(typhos)","vomiting","weight_loss","yellowish_skin","itching"};
        for(String s : symptomsList)  //returns a boolean value  
        {
            symptomsMap.put(s, 0);
        }

        for(String d : diseaseList)  //returns a boolean value  
        {
            diseaseMap.put(d, 0.0);
        }
    }

// Calculates the probability
    static void decision()
    {
        Scanner sc = new Scanner(System.in);
        DiagnosedDisease1 = "";
        DiagnosedDisease2 = "";
        DiagnosedDisease3 = "";
        double DiseaseProb[] = new double[9];

        // Calculating Probability for each disease to occur
        for (String symptom : inputSymptoms)
        {
            if (symptomsMap.containsKey(symptom)) 
            {
                symptomsMap.replace(symptom, 1);
            }

            double prob_Fungal = (prob_fungalItch * symptomsMap.get("itching")) + (prob_fungalRash * symptomsMap.get("skin_rash")) + (prob_fungalSkinNodes * symptomsMap.get("nodal_skin_eruptions")) + (prob_fungalPatches * symptomsMap.get("dischromic_patches"));
            DiseaseProb[0] = prob_Fungal;
    
            double prob_Diabetes = (prob_diabetesWeightLoss * symptomsMap.get("weight_loss")) + (prob_diabetesFatigue * symptomsMap.get("fatigue")) + (prob_diabetesRestless * symptomsMap.get("restlessness")) + (prob_diabetesLaze * symptomsMap.get("lethargy")) + (prob_diabetesSugar * symptomsMap.get("irregular_sugar_level")) + (prob_diabetesObesity * symptomsMap.get("obesity")) + (prob_diabetesVision * symptomsMap.get("blurred_and_distorted_vision")) + (prob_diabetesHunger * symptomsMap.get("excessive_hunger")) + (prob_diabetesAppetite * symptomsMap.get("loss_of_appetite")) + (prob_diabetesMoreUrine * symptomsMap.get("polyuria"));
            DiseaseProb[1] = prob_Diabetes;
    
            double prob_Jaundice = (prob_jaundiceItch * symptomsMap.get("itching")) + (prob_jaundiceVomit * symptomsMap.get("vomiting")) + (prob_jaundiceYellowSkin * symptomsMap.get("yellowish_skin")) + (prob_jaundiceFatigue * symptomsMap.get("fatigue")) + (prob_jaundiceWeightLoss * symptomsMap.get("weight_loss")) + (prob_jaundiceFever * symptomsMap.get("high_fever")) + (prob_jaundiceDarkUrine * symptomsMap.get("dark_urine")) + (prob_jaundiceAbdomenPain * symptomsMap.get("abdominal_pain"));
            DiseaseProb[2] = prob_Jaundice;
    
            double prob_Malaria = (prob_malariaChills * symptomsMap.get("chills")) + (prob_malariaVomit * symptomsMap.get("vomiting")) + (prob_malariaFever * symptomsMap.get("high_fever")) +  (prob_malariaSweat * symptomsMap.get("sweating")) + (prob_malariaHeadache * symptomsMap.get("headache")) + (prob_malariaNausea * symptomsMap.get("nausea")) + (prob_malariaDiarrhoea * symptomsMap.get("diarrhoea")) + (prob_malariaMusclePain * symptomsMap.get("muscle_pain"));
            DiseaseProb[3] = prob_Malaria;
    
            double prob_Dengue = (prob_dengueRash * symptomsMap.get("skin_rash")) + (prob_dengueChills * symptomsMap.get("chills")) + (prob_dengueVomit * symptomsMap.get("vomiting")) + (prob_dengueJointPain * symptomsMap.get("joint_pain")) + (prob_dengueFever * symptomsMap.get("high_fever")) + (prob_dengueHeadache * symptomsMap.get("headache")) + (prob_dengueNausea * symptomsMap.get("nausea")) + (prob_dengueAppetite * symptomsMap.get("loss_of_appetite")) + (prob_dengueEyePain * symptomsMap.get("pain_behind_the_eyes")) + (prob_dengueBackPain * symptomsMap.get("back_pain")) + (prob_dengueMusclePain * symptomsMap.get("muscle_pain")) + (prob_dengueMalaise * symptomsMap.get("malaise")) + (prob_dengueRedSpots * symptomsMap.get("red_spots_over_body"));
            DiseaseProb[4] = prob_Dengue;
    
            double prob_Typhoid = (prob_typhoidChills * symptomsMap.get("chills")) + (prob_typhoidVomiting * symptomsMap.get("vomiting")) + (prob_typhoidFatigue * symptomsMap.get("fatigue")) + (prob_typhoidFever * symptomsMap.get("high_fever")) + (prob_typhoidNausea * symptomsMap.get("nausea")) + (prob_typhoidHeadache * symptomsMap.get("headache")) + (prob_typhoidConstipation * symptomsMap.get("constipation")) + (prob_typhoidAbdominalPain * symptomsMap.get("abdominal_pain")) + (prob_typhoidDiarrhoea * symptomsMap.get("diarrhoea")) + (prob_typhoidTyphos * symptomsMap.get("toxic_look_(typhos)")) + (prob_typhoidBellyPain * symptomsMap.get("belly_pain"));
            DiseaseProb[5] = prob_Typhoid;
    
            double prob_Cold =  (prob_coldSneezing * symptomsMap.get("continuous_sneezing")) + (prob_coldChills * symptomsMap.get("chills")) + (prob_coldFatigue * symptomsMap.get("fatigue")) + (prob_coldCough * symptomsMap.get("cough")) + (prob_coldFever * symptomsMap.get("high_fever")) + (prob_coldHeadache * symptomsMap.get("headache")) + (prob_coldSwelledLymphNodes * symptomsMap.get("swelled_lymph_nodes")) + (prob_coldMalaise * symptomsMap.get("malaise")) + (prob_coldPhlegm * symptomsMap.get("phlegm")) + (prob_coldThroatIrritation * symptomsMap.get("throat_irritation")) + (prob_coldRedEye * symptomsMap.get("redness_of_eyes")) + (prob_coldSinusPressure * symptomsMap.get("sinus_pressure")) + (prob_coldRunnyNose * symptomsMap.get("runny_nose")) + (prob_coldCongestion * symptomsMap.get("congestion")) + (prob_coldChestPain * symptomsMap.get("chest_pain")) + (prob_coldSmellLoss * symptomsMap.get("loss_of_smell")) + (prob_coldMusclePain * symptomsMap.get("muscle_pain"));
            DiseaseProb[6] = prob_Cold;
    
            double prob_Pneumonia = (prob_pneumoniaChills * symptomsMap.get("chills")) + (prob_pneumoniaFatigue * symptomsMap.get("fatigue")) + (prob_pneumoniaCough * symptomsMap.get("cough")) + (prob_pneumoniaFever * symptomsMap.get("high_fever")) + (prob_pneumoniaBreathlessness * symptomsMap.get("breathlessness")) + (prob_pneumoniaSweating * symptomsMap.get("sweating")) + (prob_pneumoniaMalaise * symptomsMap.get("malaise")) + (prob_pneumoniaChestPain * symptomsMap.get("chest_pain")) + (prob_pneumoniaFastHeartRate * symptomsMap.get("fast_heart_rate")) + (prob_pneumoniaRustySuptum * symptomsMap.get("rusty_sputum")) + (prob_pneumoniaPhlegm * symptomsMap.get("phlegm"));
            DiseaseProb[7] = prob_Pneumonia;
    
            double prob_Acne = (prob_acneRash * symptomsMap.get("skin_rash")) + (prob_acnePus * symptomsMap.get("pus_filled_pimples")) + (prob_acneBlackhead * symptomsMap.get("blackheads")) + (prob_acneScurring * symptomsMap.get("scurring"));
            DiseaseProb[8] = prob_Acne;
        }

        // Assigning values to diseaseMap
        int a = 0;
        for(String disease : diseaseList)
        {
            diseaseMap.replace(disease, DiseaseProb[a]);
            a++;
        } 

        // Sorting the array
        double temp = 0.0; 
        for (int i = 0; i < DiseaseProb.length; i++) 
        {     
            for (int j = i+1; j < DiseaseProb.length; j++) 
            {     
                if(DiseaseProb[i] < DiseaseProb[j]) 
                {    
                    temp = DiseaseProb[i];    
                    DiseaseProb[i] = DiseaseProb[j];    
                    DiseaseProb[j] = temp;    
                }
            }
        }

        // Retrieveing the top 3 diseases
        for(Entry<String, Double> entry: diseaseMap.entrySet()) 
        {
            if(entry.getValue() == DiseaseProb[0]) 
            {
                DiagnosedDisease1 = entry.getKey();
                TopDiseases.add(DiagnosedDisease1);
            }
        }

        for(Entry<String, Double> entry: diseaseMap.entrySet()) 
        {
            if(entry.getValue() == DiseaseProb[1]) 
            {
                DiagnosedDisease2 = entry.getKey();
                TopDiseases.add(DiagnosedDisease2);
            }
        }

        for(Entry<String, Double> entry: diseaseMap.entrySet()) 
        {
            if(entry.getValue() == DiseaseProb[2]) 
            { 
                DiagnosedDisease3 = entry.getKey();
                TopDiseases.add(DiagnosedDisease3);
            }
        }

        // Calculating the chance of getting a disease 
        DecimalFormat decfor = new DecimalFormat("##.00");

        double Disease1chance = (DiseaseProb[0] / (DiseaseProb[0] + DiseaseProb[1] + DiseaseProb[2])) * 100;
        double Disease2chance = (DiseaseProb[1] / (DiseaseProb[0] + DiseaseProb[1] + DiseaseProb[2])) * 100;
        double Disease3chance = (DiseaseProb[2] / (DiseaseProb[0] + DiseaseProb[1] + DiseaseProb[2])) * 100;

        System.out.println("You have a " + decfor.format(Disease1chance) + "% chance that you have " + DiagnosedDisease1);
        System.out.println("You have a " + decfor.format(Disease2chance) + "% chance that you have " + DiagnosedDisease2);
        System.out.println("You have a " + decfor.format(Disease3chance) + "% chance that you have " + DiagnosedDisease3);
        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException 
    {
        readTxt();
        createHashMap();
        decision();
        
        FetchCSVData fetchCSVData = new FetchCSVData();
        fetchCSVData.display();
        Scanner sc= new Scanner(System.in);
        String loc = "";

        System.out.println("Would you like to see a list of doctors? Yes (or) No");

        if(sc.nextLine().toLowerCase().equals("Yes"))
        {
            System.out.println("Enter your location: ");
            loc = sc.nextLine();
            fetchCSVData.findNearByDoctor(TopDiseases, loc);
        }

        else
        {
            System.out.println("Thank you for using our app :)");
        }
    }
}
