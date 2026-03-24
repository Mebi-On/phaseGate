"""
Mini parking system
Create list of 20 eliments of 0
Get a random variable representing the amount of empty spaces
Randomly fill the list with 1 showing the parking space is full

Create match case; with users option: Enter free slot; Specific slot; leave slot
Prompt user
display parking status after each
"""

import random

def generate_parking_list():
    available_parking_spots = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    number_of_unavialble_parking = random.randint(10, 17)

    for parking_spot in range(number_of_unavialble_parking):
        parking_spots_index = random.randint(0, 19)
        if available_parking_spots[parking_spots_index] == 0:
            available_parking_spots[parking_spots_index] = 1

    return available_parking_spots


def mini_parking_system():
    available_parking_spots = generate_parking_list()
    continue_main_loop = True
    while continue_main_loop: 
        print("""
1. Are you parked?
0. Quit

Enter your choice: """)
        user_choice = int(input())

        match user_choice:
            case 1:
                continue_second_loop = True
                while continue_second_loop:
                    print("\nYes or No? \nEnter your choice: ")
                    user_answer = input().lower()
                    match user_answer :
                        case "yes":
                            continue_second_loop_yes = True
                            while continue_second_loop_yes: 
                                print("""
1. Show all unavailable parking spaces
2. Unpark Car
0. Back
Enter your choice: """)
                                user_choice = int(input())
                                match user_choice:
                                    case 1:
                                        print("Taken parking slots are: ", print_unavailable_parking(available_parking_spots))       
                                    case 2:
                                        unpark(available_parking_spots)
                                    case 0 :
                                        print("Returning to previous menu.")
                                        continue_second_loop = False
                                        break
                                    case _:
                                        print("Invalid, Please try again.")
                                    
                        case "no":
                            continue_second_loop_no = True
                            while continue_second_loop_no:
                                print("""
1. Show all availabe parking spaces
2. Choose your parking spot
3. Assign a Parking spot 
0. Back

Enter your choice: """)
                                user_choice = int(input())
                                match user_choice:
                                    case 1:
                                        print("Available Parking slots are: ", print_available_parking(available_parking_spots))
                                    case 2:
                                        user_parking_spot = choose_parking(available_parking_spots)
                                    case 3:
                                        user_parking_spot = get_assigned_parking(available_parking_spots)
                                    case 0:
                                        print("Returning to previous menu.")
                                        continue_second_loop = False
                                        break
                                    case _ :
                                        print("Invalid, Please try again.")
            case 0:
                print("Quiting Program.")
                break
            case _ :
                print("Invalid, Please try again.")




def get_assigned_parking(available_parking_spots):
    for parking_index in range (20):
        if available_parking_spots[parking_index] == 0:
            print(f"You are Now parked in slot {parking_index + 1}")
            available_parking_spots[parking_index] = 1
            break
    return parking_index + 1


def choose_parking(available_parking_spots):
    unavailable =  True
    while(unavailable):
        user_input = int(input("Enter which slot you want to park in (1 - 20): "))
        if available_parking_spots[user_input - 1] != 0:
            print("Parking space is unavailabe. Enter another space (1 - 20): ")
        else:
            available_parking_spots[user_input - 1] = 1
            print(f"You are Now parked in slot {user_input}")
            unavailable = False
    return user_input
        
            
def unpark(available_parking_spots):
    available =  True
    while(available):
        user_input = int(input("Enter your parking spot number (1 - 20): "))
        if available_parking_spots[user_input - 1] == 0:
            print("Parking space is availabe. You arent parked here. \nEnter another space (1 - 20)")
        else:
            available_parking_spots[user_input - 1] = 0
            print(f"You are Now unparked parked from slot {user_input}")
            available = False
    return user_input


def print_available_parking(available_parking_spots):
    available_slots = []
    for parking_index in range (20):
        if available_parking_spots[parking_index] == 0:
            available_slots += [parking_index + 1]
    return available_slots


def print_unavailable_parking(available_parking_spots):
    unavailable_slots = []
    for parking_index in range (20):
        if available_parking_spots[parking_index] == 1:
            unavailable_slots += [parking_index + 1]
    return unavailable_slots

mini_parking_system()












































            
