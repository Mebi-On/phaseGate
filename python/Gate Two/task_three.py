print("All even numbers between 1 and 50 are: ", end = "")
for numbers in range(1, 51):
    if numbers % 2 == 0:
        print(numbers, end = ", ")
