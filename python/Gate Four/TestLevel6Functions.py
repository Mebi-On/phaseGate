import unittest
from level_6_functions import * 

class TestLevel6Functions(unittest.TestCase):
    def test_even_and_odd_lists(self):
        actual = even_and_odd_lists([45, 60, 3, 10, 9, 22])
        expected = [[45, 3, 9], [60, 10, 22]]
        self.assertEqual(actual, expected)
    def test_even_and_odd_lists_ordered(self):
        actual = even_and_odd_lists([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
        expected = [[1, 3, 5, 7, 9], [2, 4, 6, 8, 10]]
        self.assertEqual(actual, expected)
    def test_list_of_prime_numbers_with_negative_numbers(self):
        actual = even_and_odd_lists([-5, 2, 3, 5, -6, 12, -9, 17])
        expected = [[-5, 3, 5, -9, 17], [2, -6, 12]]
        self.assertEqual(actual, expected)


    def test_is_list_a_palindrom(self):
        actual = is_list_a_palindrom([1, 2, 3, 2, 1])
        expected = True
        self.assertEqual(actual, expected)

    def test_is_list_a_palindrom_with_negative_numbers(self):
        actual = is_list_a_palindrom([45, 0, 8, 0, 45])
        expected = True
        self.assertEqual(actual, expected)
    
    def test_is_list_a_palindrom_edge_cases(self):
        actual = is_list_a_palindrom([4])
        expected = True
        self.assertEqual(actual, expected)


    def test_list_of_perfect_squares(self):
        actual = list_of_perfect_squares([4, 7, 9, 10, 16, 18])
        expected = [4, 9, 16]
        self.assertEqual(actual, expected)

    def test_list_of_perfect_squares_with_negative_numbers(self):
        actual = list_of_perfect_squares([20, -100, 24, 144, 69,-36, 0])
        expected = [144, 0]
        self.assertEqual(actual, expected)
    
    def test_list_of_perfect_squares_edge_cases(self):
        actual = list_of_perfect_squares([32, 4, 9, 10, 49, 6])
        expected = [4, 9, 49]
        self.assertEqual(actual, expected)
    
    
    def test_list_of_non_perfect_squares(self):
        actual = list_of_non_perfect_squares([4, 7, 9, 10, 49, 6])
        expected = [4, -1, 9, -1, 49, -1]
        self.assertEqual(actual, expected)

    def test_list_of_non_perfect_squares_two(self):
        actual = list_of_non_perfect_squares([32, 4, 9, 10, 49, 6])
        expected = [-1, 4, 9, -1, 49, -1]
        self.assertEqual(actual, expected)
    
    def test_list_of_non_perfect_squares_edge_cases(self):
        actual = list_of_non_perfect_squares([0, 36, 0, 16, 0, 9, 7])
        expected = [0, 36, 0, 16, 0, 9, -1]
        self.assertEqual(actual, expected)