
def specify_list_length(list_of_numbers, length_of_new_list):
    new_list = []
    length_of_list_of_numbers = len(list_of_numbers)
    for index in range (length_of_new_list):
        if index < length_of_list_of_numbers:
            new_list += [list_of_numbers[index]]
        else:
            new_list += [-1]
    return new_list
