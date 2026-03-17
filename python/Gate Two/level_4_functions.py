def addition(number_one, number_two):
    return number_one + number_two

def even_check(number):
    if number % 2 == 0:
        return "Is Even"
    else:
        return "Is not Even"

def squared(number):
    return number ** 2

def celsius_to_farenheit(temperature):
    return temperature * 9/5 + 32

def is_prime(number):
    prime = True
    for numbers in range (2, number//2):
        if number % numbers == 0:
            prime = False

    return prime

def largest_of_three(first_number, second_number, third_number):
    list_of_numbers = [first_number, second_number, third_number]
    largest = 0
    for numbers in list_of_numbers:
        if numbers > largest:
            largest = numbers
    return largest
    
def simple_intrest(principal, intrest_rate, time):
    return principal * intrest_rate * 0.01 * time

def multiplication_table(number):
    list_of_table = []
    for numbers in range (11):
        list_of_table += [f"{number} x {numbers} = {number * numbers}"]
    return list_of_table

def area_of_rectangle(length, width):
    return length * width

def reverse_number(number):
    reversed_int = ""
    while (number != 0):
        last_digit = number % 10
        number //= 10
        reversed_int += str(last_digit)
    return int(reversed_int)
        





        
