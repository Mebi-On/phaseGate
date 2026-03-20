import unittest
from level_5_functions import *

class TestLevel5Functions(unittest.TestCase):
    def test_list_of_prime_numbers(self):
        actual = list_of_prime_numbers([5, 9, 3, 6, 2])
        expected = [5, 3, 2]
        self.assertEqual(actual, expected)
    def test_list_of_prime_numbers_ordered(self):
        actual = list_of_prime_numbers([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
        expected = [2, 3, 5, 7]
        self.assertEqual(actual, expected)
    def test_list_of_prime_numbers_with_negative_numbers(self):
        actual = list_of_prime_numbers([-5, 2, 3, 5, -6, 12, -9, 17])
        expected = [2, 3, 5, 17]
        self.assertEqual(actual, expected)


    def test_only_positive_numbers_list(self):
        actual = only_positive_numbers_list([5, -9, 3, -6, 2, -11])
        expected = [5, 0, 3, 0, 2, 0]
        self.assertEqual(actual, expected)

    def test_only_positive_numbers_list_with_only_negative_numbers(self):
        actual = only_positive_numbers_list([-5, -9, -3, -6, -2, -11])
        expected = [0, 0, 0, 0 , 0, 0]
        self.assertEqual(actual, expected)
    
    def test_only_positive_numbers_list_edge_cases(self):
        actual = only_positive_numbers_list([0, -3, 0, -2, 4, 0, -9])
        expected = [0, 0, 0, 0, 4, 0, 0]
        self.assertEqual(actual, expected)


    def test_move_all_zeros(self):
        actual = move_all_zeros([5, 0, 3, 0, 2, 0])
        expected = [5, 3, 2, 0, 0, 0]
        self.assertEqual(actual, expected)

    def test_move_all_zeros_with_negative_numbers(self):
        actual = move_all_zeros([-5, -9, 0, -6, -2, 0])
        expected = [-5, -9, -6, -2, 0, 0]
        self.assertEqual(actual, expected)
    
    def test_move_all_zeros_edge_cases(self):
        actual = move_all_zeros([0, 32, 0, 4, 0, 9, 9, 0, 0])
        expected = [32, 4, 9, 9, 0, 0, 0, 0, 0]
        self.assertEqual(actual, expected)
    
    
    def test_list_of_duplicates(self):
        actual = list_of_duplicates([5, 0, 3, 0, 2, 0])
        expected = [0]
        self.assertEqual(actual, expected)

    def test_list_of_duplicates_two(self):
        actual = list_of_duplicates([45, 60, 3, 0, 67, 2, 45, 3, 22, 0])
        expected = [45, 3, 0]
        self.assertEqual(actual, expected)
    
    def test_list_of_duplicates_edge_cases(self):
        actual = list_of_duplicates([0, 32, 0, 4, 0, 9, 9, 0, 0])
        expected = [0, 9]
        self.assertEqual(actual, expected)