def remove_duplicates_from_list(list_of_numbers):
    result = []
    for numbers_first_loop in list_of_numbers:
        count = 0
        for numbers_second_loop in list_of_numbers:
            if numbers_first_loop == numbers_second_loop:
                count += 1
        
        if count == 1:
            result.append(numbers_first_loop)
    return result
