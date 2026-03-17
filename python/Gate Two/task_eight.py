
sum_of_numbers = 0
continue_asking = True

while(continue_asking):
    user_input = int(input("Enter a number (Enter 0 to stop): "))
    sum_of_numbers += user_input
    if user_input == 0:
        continue_asking = False

print(f"The sum of all your numbers is {sum_of_numbers}")
    
