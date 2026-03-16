user_input = int(input("Enter a number between 1 and 7: "))

days_of_the_week = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

for index in range(len(days_of_the_week)):
    if index == user_input - 1:
        print(days_of_the_week[index])
