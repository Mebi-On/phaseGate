import random

def random_number_generator():
    random_number = random.randint(1, 100)
    return random_number

def track_and_display_rating(attempts):
    if attempts == 1:
        return "Legendary"
    elif attempts == 2:
        return "Excellent"
    elif attempts == 3 or attempts == 4:
        return "Good"
    elif attempts == 5:
        return "Close!"
    else:
        return "Better luck"

def number_guessing_game(random_number):
    attempts = 1
    
    while (attempts <= 5):
        user_input = input("Guess the random number: ")
       
        if (input_validator(user_input) == True):
            user_input = int(user_input)
            if user_input != random_number:
                if user_input < random_number:
                    print ("Guess too low")
                if user_input > random_number:
                    print ("Guess too high")
                attempts += 1
            else:
                print("Correct!")
                break
        else: 
             print(f"Invalid input, you are on attempt {attempts + 1}")
        
    return attempts


def input_validator(user_input: str):
    is_valid = False
    if str(user_input).isdigit():
        if int(user_input) >= 1 and int(user_input) <= 100:
            is_valid = True 
        else:
            is_valid = False
            
    else:
        is_valid = False
    return is_valid
    

def deisplay_summary(random_number, attempts):
    correct_number = random_number
    rating = track_and_display_rating(attempts)
    
    return f"The Correct number is {correct_number}, you took {attempts} attempts, {rating}"
























