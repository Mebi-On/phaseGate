user_number = int(input("Enter a number: "))

result = 0

for number in range (1, user_number + 1):
    result += number
print(f"The sum of 1 to {user_number} is {result}")
