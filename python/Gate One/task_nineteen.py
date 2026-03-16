user_age = int(input("Enter your age: "))

if 0 <= user_age <= 12:
    print("Child")
elif 13 <= user_age <= 17:
    print("Teen")
else:
    print("Adult")
