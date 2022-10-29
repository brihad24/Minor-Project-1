<center> <h1> Smart Healthcare Support System </h1> </center>

<h2>Abstract</h2>
Sometimes you come across small problems where you need to consult doctors about your health problems or go to the nearest ones and follow their prescriptions. A few online services will give you the power to communicate directly with the doctors of your choice as and when required for all your small problems. Using a few of the already available web applications, patients will be able to fill out an online form in just a few seconds before entering the virtual office room. Through our project, we aim to create a similar application that will help users get a diagnosis for their disease from the comfort of their homes. Moreover, if the patient chooses, they can also see a list of doctors near them who are available for further consultation/check-ups.

<h2>Introduction</h2>

For our Minor Proejct 1, me and my team have decided to make an online disease diagnosis system. We have decided to go for a web-based application, and use Java for our backend. For the main working of our project, we initially aimed to employ Machine Learning for our project, but due to the restriction on imported libraries, we have explored other approaches. One of those approaches has given us better results than the others. It is elaborated below:

<h3>Approach:</h3>
We have used elements of a decision tree model and a naive bayes classifier for our project. The algorithm would run as follows:

1. Identify the defining sypmtoms of a disease. For example, Diabetes has high sugar level

2. If that respective symptom is selected, diagnose the user with that disease, based on the defining symptom

3. If the user has not chosen that defining symptom, use ocnditional probability to calculate the probablities of all the symptoms that the user has chosen w.r.t to a disease.<br>
Formula: P(Disease) = Σ P(Symptom i | Disease) * symptomChosen; <br>
                where   i ∈ all symptoms for that disease <br>
                        symptomChosen = 0 if not chosen, 1 if chosen

4. We then calculate the value for all the diseases

5. After we obtain the values of all the diseases, we compare to see which disease has the highest probablity

6. The disease with the highest probablity is then chosen as the diagnosed disease

For example, if the user has chosen high sugar level as a symptom, we can diagnose the user with Diabetes. But if the user has not chosen high sugar level, the algorithm will check the other symptoms chosen by the user and then calculate the conditional probability of all the symptoms w.r.t. to the disease to return the disease with the highest probability of ocurring.

<h2>Target Beneficiary</h2>

The target beneficiaries of this project are people, local to Dehradun, who are in need to book appointments with doctors on an urgent basis or otherwise. For booking an appointment the patient wouldn’t need to search up a list of multiple doctors around the city, they shall be provided with a list of doctors to choose from and they can do so by taking into consideration the location and experience of the doctor in question. 

<h2>Project Scope</h2>
	
The scope of our project is to provide the user with the most probable diagnosis of their ailment according to their symptoms, the prediction would be done using conditional probability. The prototype that we build shall be hosted on the cloud and all the data that would be needed to be stored would also be stored on the cloud.
