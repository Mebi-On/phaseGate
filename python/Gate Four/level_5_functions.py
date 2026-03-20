def list_of_prime_numbers(list_of_numbers):
    prime_numbers = []
    for numbers in list_of_numbers:
        if numbers > 1:
            for divisor in range(2, numbers//2 + 1):
                if (numbers % divisor) == 0:
                    break
            else:
                prime_numbers += [numbers]
    return prime_numbers

def only_positive_numbers_list(list_of_numbers):
    for index in range (len(list_of_numbers)):
        if list_of_numbers[index] < 0:
            list_of_numbers[index] = 0
    return list_of_numbers

def move_all_zeros(list_of_numbers):
    for index in range (len(list_of_numbers) - 1):
         if list_of_numbers[index] == 0:
            list_of_numbers.pop(index)
            list_of_numbers.append(0)
    return list_of_numbers

def list_of_duplicates(list_of_numbers):
    list_of_duplicates = []
    for index in range(len(list_of_numbers)):
        count = 0
        for second_index in range(len(list_of_numbers)):
            if list_of_numbers[index] == list_of_numbers[second_index]:
                count += 1
        if count > 1:
            if list_of_numbers[index] not in list_of_duplicates:
                list_of_duplicates += [list_of_numbers[index]]
    return list_of_duplicates
