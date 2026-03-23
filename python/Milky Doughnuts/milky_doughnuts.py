
def count_evens(numbers: list):
    even_count = 0
    for number in numbers:
        if number % 2 == 0:
            even_count += 1
    return even_count


def linear_search(numbers: list, target: int):
    for index in range(len(numbers)):
        if numbers[index] == target:
            return index
    return -1


def squares(numbers: int):
    squared_numbers = []
    if numbers <= 0:
        return []
    for number in range(1, numbers + 1):
        squared_numbers.append(number * number)
    return squared_numbers


def arrays_equal(array1: list, array2: list):
    if len(array1) != len(array2):
        return False
    for index in range(len(array1)):
        if array1[index] != array2[index]:
            return False
    return True


def remove_duplicates(numbers: list):
    new_list = []
    for number in numbers:
        if number not in new_list:
           new_list.append(number)
    return new_list


def flatten(matrix):
    result = []
    for row_index in range(len(matrix)):
        for colum_index in range(len(matrix[row_index])):
            result.append(matrix[row_index][colum_index])
    return result


def intersect_of(array1, array2):
    intersect_elements = []
    for numbers in array1:
        if numbers in array2:
            intersect_elements.append(numbers)
    return intersect_elements

