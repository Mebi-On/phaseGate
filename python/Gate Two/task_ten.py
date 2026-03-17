user_number = int(input("Enter a number: "))
count = 0 
while user_number != 0:
    count += 1
    user_number //= 10

print(f"There are {count} digits in the number {user_number}")
