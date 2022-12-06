<center> <h1> Smart Healthcare Support System </h1> </center>

<h2>Introduction</h2>

For our Minor Proejct 1, me and my team have decided to make an online disease diagnosis system. We have decided to go for a web-based application, and use Java for our backend. For the main working of our project, we initially aimed to employ Machine Learning for our project, but due to the restriction on imported libraries, we have explored other approaches. One of those approaches has given us better results than the others. It is elaborated below:

<h3>Approach:</h3>
We have used elements of a decision tree model and a naive bayes classifier for our project. The algorithm would run as follows:

1. We created 2 hashmaps, one for the symptoms mapped to 0(if symptom is not chosen) or 1(if symptom is chosen), and one for diseases mapped to their respective probabilities(obtained from our algorithm).

2. The algorithm takes the user input as a list and iterates through each symptom, calculating the probabilities of all the diseases wrt to that symptom, then moves on to the next symptom and the process repeats.

3. The algorithm then calculates the probabilty of a disease with the conditional probability of the symptoms that the user has chosen.<br>
Formula: P(Disease) = Σ P(Symptom i | Disease) * symptomChosen; <br>
                where   i ∈ all symptoms for that disease <br>
                        symptomChosen = 0 if not chosen, 1 if chosen

4. The above process repeats for all the diseases

5. After we obtain the values of all the diseases, and store it in an array

6. The array is then sorted in a descending order so that we can retrieve the top 3 most probable diseases

7. After the top 3 diseases are retrieved, the individual percentage of their occurence is displayed to the user

8. If the user wishes, they can enter their location and get a list of doctors that specialize in treating their respective disease
