user_number = int(input("Enter a number: "))\

if user_number % 3 == 0 and user_number % 5 == 0:
    print(f"{user_number} is divisible by 5 and 3")
else:
    print(f"{user_number} is NOT divisible by 5 and 3")
