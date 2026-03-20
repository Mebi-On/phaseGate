def even_and_odd_lists(list_of_numbers):
    result = []
    even_list = []
    odd_list = []
    for numbers in list_of_numbers:
        if numbers % 2 == 0:
            even_list += [numbers]
        else:
            odd_list += [numbers]
    result = [odd_list, even_list]
    return result

def is_list_a_palindrom(list_of_numbers):
    
    for index in range(len(list_of_numbers)):
        if list_of_numbers[index] == list_of_numbers[len(list_of_numbers) - 1 - index]:
            continue
        else:
            return False
    return True

def list_of_perfect_squares(list_of_numbers):
    list_of_perfect_squares = []
    for numbers in list_of_numbers:
        if numbers < 0:
            continue
        val = numbers ** 0.5
        if val.is_integer() == True:
            list_of_perfect_squares += [numbers]
    return list_of_perfect_squares

def list_of_non_perfect_squares(list_of_numbers):
    for index in range(len(list_of_numbers)):
        val = list_of_numbers[index] ** 0.5
        if val.is_integer() != True:
            list_of_numbers[index] = -1
    return list_of_numbers
