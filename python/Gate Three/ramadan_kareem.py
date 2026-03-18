
def number_of_occurences_of_unique_characters_in_a_string(string):
    result_string = ""
    for letters in string:
        if letters not in result_string:
            result_string += letters
            for index in range(len(result_string)):
                count = 0
                for second_index in range(len(string)):
                    if string[second_index] == result_string[index]:
                        count += 1
            result_string += str(count)
    return result_string


def largest_in_nested_list(nested_list):
    largest_number = 0
    result = []
    for row_index in range (len(nested_list)):
        for column_index in range (len(nested_list[row_index])):
            if nested_list[row_index][column_index] > largest_number:
                largest_number = nested_list[row_index][column_index]
                result = [row_index, column_index]

    return result


