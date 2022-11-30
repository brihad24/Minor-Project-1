import java.util.Scanner;

public class Algorithm{
    static double prob_fungalItch = 0.47, prob_fungalRash = 0.26, prob_fungalSkinNodes, prob_fungalPatches;

    static double prob_diabetesWeightLoss = 0.5, prob_diabetesFatigue = 0.16, prob_diabetesRestless = 1, prob_diabetesLaze, prob_diabetesSugar, prob_diabetesObesity, prob_diabetesVision, prob_diabetesHunger, prob_diabetesAppetite, prob_diabetesMoreUrine;

    static double prob_jaundiceItch = 0.53, prob_jaundiceVomit = 0.27, prob_jaundiceYellowSkin, prob_jaundiceFatigue = 0.16, prob_jaundiceWeightLoss = 0.5, prob_jaundiceFever = 0.16, prob_jaundiceDarkUrine, prob_jaundiceAbdomenPain = 0.5;

    static double prob_malariaChills = 0.19, prob_malariaVomit = 0.19, prob_malariaFever = 0.18, prob_malariaSweat = 0.5, prob_malariaHeadache = 0.24, prob_malariaNausea = 0.32, prob_malariaDiarrhoea = 0.47, prob_malariaMusclePain = 0.33;

    static double prob_dengueRash = 0.31, prob_dengueChills = 0.19, prob_dengueVomit = 0.27, prob_dengueJointPain, prob_dengueFever = 0.18, prob_dengueHeadache = 0.27, prob_dengueNausea = 0.36, prob_dengueAppetite, prob_dengueEyePain, prob_dengueBackPain, prob_dengueMusclePain = 0.37, prob_dengueMalaise = 0.33, prob_dengueRedSpots;

    static double prob_typhoidChills = 0.22, prob_typhoidVomiting = 0.25, prob_typhoidFatigue = 0.2, prob_typhoidFever = 0.18, prob_typhoidNausea = 0.32, prob_typhoidHeadache = 0.24, prob_typhoidConstipation, prob_typhoidAbdominalPain = 0.5, prob_typhoidDiarrhoea = 0.53, prob_typhoidTyphos, prob_typhoidBellyPain;

    static double prob_coldSneezing, prob_coldChills = 0.19, prob_coldFatigue = 0.16, prob_coldCough = 0.5, prob_coldFever = 0.16, prob_coldHeadache = 0.24, prob_coldSwelledLymphNodes, prob_coldMalaise = 0.29, prob_coldPhlegm = 0.53, prob_coldThroatIrritation, prob_coldRedEye, prob_coldSinusPressure, prob_coldRunnyNose, prob_coldCongestion, prob_coldChestPain = 0.45, prob_coldSmellLoss, prob_coldMusclePain  = 0.29;

    static double prob_pneumoniaChills = 0.19, prob_pneumoniaFatigue = 0.16, prob_pneumoniaCough = 0.5, prob_pneumoniaFever = 0.16, prob_pneumoniaBreathlessness, prob_pneumoniaSweating = 0.5, prob_pneumoniaMalaise = 0.37, prob_pneumoniaChestPain = 0.55, prob_pneumoniaFastHeartRate, prob_pneumoniaRustySuptum, prob_pneumoniaPhlegm = 0.47;

    static double prob_acneRash = 0.38, prob_acnePus, prob_acneBlackhead, prob_acneScurring;

    static int abdpainChosen = 0, chestpainChosen = 0, chillsChosen = 0, coughChosen = 0, diarrhoeaChosen = 0, fatigueChosen = 0, feverChosen = 0, headacheChosen = 0, high_feverChosen = 0, malaiseChosen = 0, muscle_painChosen = 0, nauseaChosen = 0, phlegmChosen = 0, skin_rashChosen = 0, sweatingChosen = 0, vomitingChosen = 0, weight_lossChosen = 0, itchingChosen = 0; 

    static void values(){
        return;
    }

    static void decision()
    {
        Scanner sc = new Scanner(System.in);
        String DiagnosedDisease = "";
        double DiseaseProb[] = new double[9];

        while(true) // Runs while the statement is true
        {
        String symptom = sc.next();

            if(symptom.equals("done"))
            {
                System.out.println("Thank you for choosing the symptoms. Your disease is displayed below");
                break;
            }
// Definitive diagnosis
// Dengue
            if(symptom.equals("back_pain") || symptom.equals("joint_pain") || symptom.equals("loss_of_appetite") || symptom.equals("pain_behind_the_eyes") || symptom.equals("red_spots_over_body"))
            {
                DiagnosedDisease = "Dengue";
            } 
// Typhoid
            if(symptom.equals("belly_pain") || symptom.equals("constipation") || symptom.equals("toxic_look_(typhos)"))     
            {
                DiagnosedDisease = "Typhoid";
            }
// Acne
            if(symptom.equals("blackheads") || symptom.equals("pus_filled_pimples") || symptom.equals("scurring"))  
            {
                DiagnosedDisease = "Acne";
            }
//Diabetes
            if(symptom.equals("blurred_and_distorted_vision") || symptom.equals("excessive_hunger") ||  symptom.equals ("increased_appetite") ||  symptom.equals("irregular_sugar_level") || symptom.equals("lethargy") || symptom.equals("obesity") || symptom.equals("polyuria") || symptom.equals("restlessness"))  
            {
                DiagnosedDisease = "Diabetes";
            }
// Pneumonia
            if(symptom.equals("breathlessness") || symptom.equals("fast_heart_rate") || symptom.equals("rusty_sputum"))
            {
                DiagnosedDisease = "Pneumonia";
            }
// Common Cold
            if(symptom.equals("congestion") || symptom.equals("continuous_sneezing") ||  symptom.equals("loss_of_smell") || symptom.equals("redness_of_eyes") || symptom.equals("runny_nose") || symptom.equals("sinus_pressure") || symptom.equals("swelled_lymph_nodes") || symptom.equals("throat_irritation"))  
            {
                DiagnosedDisease = "Common Cold";
            }
// Jaundice
            if(symptom.equals("dark_urine") || symptom.equals("yellowish_skin")) 
            {
                DiagnosedDisease = "Jaundice";
            }
// Fungal Infection
            if(symptom.equals("dischromic_patches") || symptom.equals("nodal_skin_eruptions"))                                                                               
            {
                DiagnosedDisease = "FungalInfection";
            }

            //System.out.println(DiagnosedDisease);
// Probabilistic diagnosis
            if(symptom.equals("abdominal_pain")) 
            {
                abdpainChosen = 1;
            }
            if(symptom.equals("chest_pain"))  
            {
                chestpainChosen = 1;
            }
            if(symptom.equals("chills")) 
            {
                chillsChosen = 1;
            }
            if(symptom.equals("cough")) 
            {
                coughChosen = 1;
            }
            if(symptom.equals("diarrhoea")) 
            {
                diarrhoeaChosen = 1;
            }
            if(symptom.equals("fatigue")) 
            {
                fatigueChosen = 1;
            }
            if(symptom.equals("high_fever")) 
            {
                feverChosen = 1;
            }
            if(symptom.equals("headache")) 
            {
                headacheChosen = 1;
            }
            if(symptom.equals("high_fever")) 
            {
                high_feverChosen = 1;
            }
            if(symptom.equals("malaise")) 
            {
                malaiseChosen = 1;
            }
            if(symptom.equals("muscle_pain"))  
            {
                muscle_painChosen = 1;
            }
            if(symptom.equals("nausea"))  
            {
                nauseaChosen = 1;
            }
            if(symptom.equals("phlegm"))  
            {
                phlegmChosen = 1;
            }
            if(symptom.equals("skin_rash"))  
            {
                skin_rashChosen = 1;
            }
            if(symptom.equals("sweating"))  
            {
                sweatingChosen = 1;
            }
            if(symptom.equals("vomiting"))  
            {
                vomitingChosen = 1;
            }
            if(symptom.equals("weight_loss"))  
            {
                weight_lossChosen = 1;
            }
            if(symptom.equals("itching"))  
            {
                itchingChosen = 1;
            }

            else
            {
                //System.out.println(DiagnosedDisease);
                //System.out.println(".");

                double prob_Fungal = (prob_fungalItch * itchingChosen) + (prob_fungalRash * skin_rashChosen);
                DiseaseProb[0] = prob_Fungal;

                double prob_Diabetes = (prob_diabetesWeightLoss * weight_lossChosen) + (prob_diabetesFatigue * fatigueChosen);
                DiseaseProb[1] = prob_Diabetes;

                double prob_Jaundice = (prob_jaundiceItch * itchingChosen) + (prob_jaundiceVomit * vomitingChosen) + (prob_jaundiceFatigue * fatigueChosen) + (prob_jaundiceWeightLoss * weight_lossChosen) + (prob_jaundiceFever * feverChosen) + (prob_jaundiceAbdomenPain * abdpainChosen);
                DiseaseProb[2] = prob_Jaundice;

                double prob_Malaria = (prob_malariaChills * chillsChosen) + (prob_malariaVomit * vomitingChosen) + (prob_malariaFever * feverChosen) +  (prob_malariaSweat * sweatingChosen) + (prob_malariaHeadache * headacheChosen) + (prob_malariaNausea * nauseaChosen) + (prob_malariaDiarrhoea * diarrhoeaChosen) + (prob_malariaMusclePain * muscle_painChosen);
                DiseaseProb[3] = prob_Malaria;

                double prob_Dengue = (prob_dengueRash * skin_rashChosen) + (prob_dengueChills * chillsChosen) + (prob_dengueVomit * vomitingChosen) + (prob_dengueFever * feverChosen) + (prob_dengueHeadache * headacheChosen) + (prob_dengueNausea * nauseaChosen) + (prob_dengueMusclePain * muscle_painChosen) +  (prob_dengueMalaise * malaiseChosen);
                DiseaseProb[4] = prob_Dengue;

                double prob_Typhoid = (prob_typhoidChills * chillsChosen) + (prob_typhoidVomiting * vomitingChosen) + (prob_typhoidFatigue * fatigueChosen) + (prob_typhoidFever * feverChosen) + (prob_typhoidNausea * nauseaChosen) + (prob_typhoidHeadache * headacheChosen) + (prob_typhoidAbdominalPain * abdpainChosen) + (prob_typhoidDiarrhoea * diarrhoeaChosen);
                DiseaseProb[5] = prob_Typhoid;

                double prob_Cold =  (prob_coldChills * chillsChosen) + (prob_coldFatigue * fatigueChosen) + (prob_coldCough * coughChosen) + (prob_coldFever * feverChosen) + ( prob_coldHeadache * headacheChosen) + ( prob_coldMalaise* malaiseChosen) + (prob_coldPhlegm * phlegmChosen) + ( prob_coldChestPain * chestpainChosen) + (prob_coldMusclePain * muscle_painChosen);
                DiseaseProb[6] = prob_Cold;

                double prob_Pneumonia = (prob_pneumoniaChills * chillsChosen) + (prob_pneumoniaFatigue * fatigueChosen) + (prob_pneumoniaCough * coughChosen) + (prob_pneumoniaFever * feverChosen) + (prob_pneumoniaSweating * sweatingChosen) + ( prob_pneumoniaMalaise * malaiseChosen) + (prob_pneumoniaChestPain * chestpainChosen) + (prob_pneumoniaPhlegm * phlegmChosen);
                DiseaseProb[7] = prob_Pneumonia;

                double prob_Acne = (prob_acneRash * skin_rashChosen);
                DiseaseProb[8] = prob_Acne;

                Double max = DiseaseProb[0];  
                
                for (int i = 0; i < DiseaseProb.length; i++) 
                {  
                    if(DiseaseProb[i] > max)  
                    max = DiseaseProb[i];  
                    //System.out.println(DiseaseProb[i]);
                }  

                if (max == prob_Acne && max != 0.0) //Acne
                {
                    DiagnosedDisease = "Acne";
                }
                if (max == prob_Dengue && max != 0.0) // Dengue
                {
                    DiagnosedDisease = "Dengue";
                }
                if (max == prob_Cold && max != 0.0) // Cold
                {
                    DiagnosedDisease = "Cold";
                }
                if (max == prob_Diabetes && max != 0.0) // Diabetes
                {
                    DiagnosedDisease = "Diabetes";
                }
                if (max == prob_Fungal && max != 0.0) // Fungal
                {
                    DiagnosedDisease = "Fungal Infection";
                }
                if (max == prob_Jaundice && max != 0.0) // Janudice
                {
                    DiagnosedDisease = "Jaundice";
                }
                if (max == prob_Malaria && max != 0.0) // Malaria
                {
                    DiagnosedDisease = "Malaria";
                }
                if (max == prob_Typhoid && max != 0.0) // Typhoid
                {
                    DiagnosedDisease = "Typhoid";
                }
                if (max == prob_Pneumonia && max != 0.0) // Pneumonia
                {
                    DiagnosedDisease = "Pneumonia";
                }
                // else
                // {
                //     System.out.println("Please enter symptom from above");
                // }
                
                //System.out.println(DiagnosedDisease);
                // System.out.println("Please enter a symptom from the list above");
            }
        }
        System.out.println(DiagnosedDisease);
        sc.close();
    }

    public static void main(String[] args) 
    {
        System.out.println("Disclaimer: This is an automated program that works on a dataset made my physicians. Although the diagnosis is fairly accurate, please consult a doctor to be safe and not take this program at face value");
        System.out.println("Choose what symptoms you have from the list and type them below. Once you're done, type 'done'");

        System.out.println("List of symptoms:" + '\n' + "A:" + " abdominal_pain" + '\n' + "B:" + " back_pain, belly_pain, blackheads, blurred_and_distorted_vision, breathlessness" + '\n' + "C:" + " chest_pain, chills, congestion, constipation, continuous_sneezing, cough" + '\n' + "D:" + " dark_urine, diarrhoea, dischromic_patches" + '\n' + "E:" + " excessive_hunger" + '\n' + "F:" + " fast_heart_rate, fatigue" + '\n' + "G:" + "" + '\n' + "H:" + " headache, high_fever" + '\n' + "I:" + " increased_appetite, irregular_sugar_level, itching" + '\n' + "J:" + " joint_pain" + '\n' + "K:" + "" + '\n' + "L:" + " lethargy, loss_of_appetite, loss_of_smell, malaise" + '\n' + "M:" + " muscle_pain" + '\n' + "N:" + " nodal_skin_eruptions, nausea" + '\n' + "O:" + " obesity, " + '\n' + "P:" + "pain_behind_the_eyes, phlegm, polyuria, pus_filled_pimples" + '\n' + "Q:" + "" + '\n' + "R:" + " red_spots_over_body, redness_of_eyes, restlessness, runny_nose, rusty_sputum" + '\n' + "S:" + " scurring, sinus_pressure, skin_rash, sweating, swelled_lymph_nodes" + '\n' + "T:" + " throat_irritation, toxic_look_(typhos)" + '\n' + "U:" + "" + '\n' + "V:" + " vomiting" + '\n' + "W:" + " weight_loss" + '\n' + "X:" + "" + '\n' + "Y:" + " yellowish_skin" + '\n' + "Z:" + "");

        decision();

            /*
            Write an if else condition for each symptom
            For example
            If the symptom is a defining symptom, return the disease that symptom belongs to
            If the symptom is not a defining symptom, set the symptomChosen value to 1
            After all the if statements are done, include an else statement that will calculate the conditional probability of all the diseases using the algorithm mention below, then return the disease with the highest probability of occurence

            1. Identify the defining sypmtoms of a disease. For example, Diabetes has high sugar level

            2. If that respective symptom is selected, diagnose the user with that disease, based on the defining symptom

            3. If the user has not chosen that defining symptom, use ocnditional probability to calculate the probablities of all the symptoms that the user has chosen w.r.t to a disease.
            Formula: P(Disease) = Σ P(Symptom i | Disease) * symptomChosen; 
                            where   i ∈ all symptoms for that disease
                                    symptomChosen = 0 if not chosen
                                                    1 if chosen

            4. We then calculate the value for all the diseases

            5. After we obtain the values of all the diseases, we compare to see which disease has the highest probablity

            6. The disease with the highest probablity is then chosen as the diagnosed disease
            */
    }
}
