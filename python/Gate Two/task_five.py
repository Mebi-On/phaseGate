user_number = int(input("Enter a number: "))

result = 1

for number in range (1, user_number + 1):
    result *= number
print(f"The factorial of {user_number} is {result}")
