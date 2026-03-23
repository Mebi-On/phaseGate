"""
Create a loop for the number of questions
Create variables for the score, number of questions and attempts made
Generate 2 random variable, and check if valid
If the second variable is greater than the first, it does not count as a question
Create a loop so for if the answer is correct or incorrect
For valid questions prompt the user to give an answer
If the user get the question correct print correct answer, end loop and increase score by 1
If user gets the question incorrect re-prompts the user, they have two attempts 
If the user fails both attempts it moves to the next question and they score 0 for that question
Print the users final score

"""

import random

def substraction_problem():
    number_of_questions = 10
    question_number = 0
    score = 0
    while(question_number < number_of_questions):
        attempts = 0
        first_number = random.randint(1, 100)
        second_number = random.randint(1, 100)
    
        if first_number > second_number:
            answer = first_number - second_number
            question_number += 1
            print(f"{first_number} - {second_number}")
            while(attempts < 2):
                user_answer = (input("Enter answer: "))
                if user_answer.isdigit():
                    user_answer = int(user_answer)
                if user_answer == answer:
                    print("Correct answer")
                    attempts = 2
                    score += 1
                elif user_answer != answer and attempts < 1:
                    attempts += 1
                    print("Incorrect answer, 1 more try")
                elif user_answer != answer and attempts < 2:
                    attempts += 1
                    print("Incorrect answer, out of trys")

    print(score, "/ 10")
                

substraction_problem()
