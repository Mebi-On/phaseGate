first_number = int(input("Enter a number: "))
second_number = int(input("Enter a number: "))
third_number = int(input("Enter a number: "))

if first_number >= second_number and first_number >= third_number:
    print(f"The larger number is {first_number}")
elif second_number >= first_number and second_number >= third_number:
    print(f"The larger number is {second_number}")
else:
    print(f"The larger number is {third_number}")
