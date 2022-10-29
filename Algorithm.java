import java.util.Scanner;

public class Algorithm{
    static int prob_fungalItch, prob_fungalRash, prob_fungalSkinNodes, prob_fungalPatches;

    static int prob_diabetesWeightLoss, prob_diabetesFatigue, prob_diabetesRestless, prob_diabetesLaze, prob_diabetesSugar, prob_diabetesObesity, prob_diabetesVision, prob_diabetesHunger, prob_diabetesAppetite, prob_diabetesDarkUrine, prob_diabetesMoreUrine;

    static int prob_jaundiceItch, prob_jaundiceVomit, prob_jaundiceYellowSkin, prob_jaundiceFatigue, prob_jaundiceWeightLoss, prob_jaundiceFever, prob_jaundiceDarkUrine, prob_jaundiceAbdomenPain;

    static int prob_malariaChills, prob_malariaVomit, prob_malariaFever, prob_malariaSweat, prob_malariaHeadache, prob_malariaNausea, prob_malariaDiarrhoea, prob_malariaMusclePain;

    static int prob_dengueRash, prob_dengueChills, prob_dengueVomit, prob_dengueJointPain, prob_dengueFever, prob_dengueHeadache, prob_dengueNausea, prob_dengueAppetite, prob_dengueEyePain, prob_dengueBackPain, prob_dengueMusclePain, prob_dengueMalaise, prob_dengueRedSpots;

    static int prob_typhoid;

    static int prob_cold;

    static int prob_pneumonia;

    static int prob_acne;

    static void values(){
        return;
    }

    static void decision()
    {
        Scanner sc = new Scanner(System.in);
        String DiagnosedDisease = "";

        while(1 > 0) // Runs while the statement is true
        {
        String symptom = sc.nextLine();

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
            if(symptom.equals("breathlessness") || symptom.equals("fast_heart_rate") || symptom.equals("rusty sputum"))                                    
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

            // Probabilistic diagnosis
            if(symptom.equals("dischromic_patches")) // Fungal Infection symptoms
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection symptoms
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection
            {
                DiagnosedDisease = "FungalInfection";
            }
            if(symptom.equals("dischromic_patches")) // Fungal Infection
            {
                DiagnosedDisease = "FungalInfection";
            }

            else
            {
                System.out.println("Please enter a symptom from the list above");
            }
        }
        System.out.println(DiagnosedDisease);
        sc.close();
    }
    public static void main(String[] args) 
    {
        System.out.println("Disclaimer: This is an automated program that works on a dataset made my physicians. Although the diagnosis is fairly accurate, please consult a doctor to be safe and not take this program at face value");
        System.out.println("Choose what symptoms you have from the list and type them below. Once you're done, type 'done'");

        System.out.println("List of symptoms:" + '\n' + "A:" + " abdominal_pain" + '\n' + "B:" + " back_pain, belly_pain, blackheads, blurred_and_distorted_vision, breathlessness" + '\n' + "C:" + " chest_pain, chills, congestion, constipation, continuous_sneezing, cough" + '\n' + "D:" + " dark_urine, diarrhoea, dischromic _patches" + '\n' + "E:" + " excessive_hunger" + '\n' + "F:" + " fast_heart_rate, fatigue" + '\n' + "G:" + "" + '\n' + "H:" + " headache, high_fever" + '\n' + "I:" + " increased_appetite, irregular_sugar_level, itching" + '\n' + "J:" + " joint_pain" + '\n' + "K:" + "" + '\n' + "L:" + " lethargy, loss_of_appetite, loss_of_smell, malaise" + '\n' + "M:" + " muscle_pain, nausea" + '\n' + "N:" + " nodal_skin_eruptions" + '\n' + "O:" + " obesity, " + '\n' + "P:" + "pain_behind_the_eyes, phlegm, polyuria, pus_filled_pimples" + '\n' + "Q:" + "" + '\n' + "R:" + " red_spots_over_body, redness_of_eyes, restlessness, runny_nose, rusty_sputum" + '\n' + "S:" + " scurring, sinus_pressure, skin_rash, sweating, swelled_lymph_nodes" + '\n' + "T:" + " throat_irritation, toxic_look_(typhos)" + '\n' + "U:" + "" + '\n' + "V:" + " vomiting" + '\n' + "W:" + " weight_loss" + '\n' + "X:" + "" + '\n' + "Y:" + " yellowish_skin" + '\n' + "Z:" + "");

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
