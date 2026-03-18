import unittest
from ramadan_kareem import *

class TestRamadanKareem(unittest.TestCase):
    def test_number_of_occurences_of_unique_characters_in_a_string_one(self):
        actual = number_of_occurences_of_unique_characters_in_a_string("AaaBBc")
        expected = "A1a2B2c1"
        self.assertEqual(actual, expected)
    def test_number_of_occurences_of_unique_characters_in_a_string_two(self):
        actual = number_of_occurences_of_unique_characters_in_a_string("EEEEnnnneee")
        expected = "E4n4e3"
        self.assertEqual(actual, expected)
    def test_number_of_occurences_of_unique_characters_in_a_string_three(self):
        actual = number_of_occurences_of_unique_characters_in_a_string ("ooooooYOO")
        expected = "o6Y1O2"
        self.assertEqual(actual, expected)
    def test_number_of_occurences_of_unique_characters_in_a_string_four(self):
        actual = number_of_occurences_of_unique_characters_in_a_string ("ooooooYOOoo")
        expected = "o8Y1O2"
        self.assertEqual(actual, expected)



    def test_largest_in_nested_list_ints_only(self):
        nested_list = [[10, 11, 12],[13, 14, 15],[20, 17, 18]]
        actual = largest_in_nested_list(nested_list)
        expected = [2, 0]
        self.assertEqual(actual, expected)
    def test_largest_in_nested_list_floats_only(self):
        nested_list = [[2.3, 23.9, 24.0],[43.5, 3.99, 7.7, 15.9],[2.0, 34.8, 43.59]]
        actual = largest_in_nested_list(nested_list)
        expected = [2, 2]
        self.assertEqual(actual, expected)
    def test_largest_in_nested_list_ints_and_floats(self):
        nested_list = [[10, 33.3, 54],[10, 43.7, 88],[21, 54, 6.5]]
        actual = largest_in_nested_list (nested_list)
        expected = [1, 2]
        self.assertEqual(actual, expected)
    def test_largest_in_nested_list_uneven_lists(self):
        nested_list = [[10, 11, 12],[13, 14, 15, 77],[20, 17, 18]]
        actual = largest_in_nested_list (nested_list)
        expected = [1, 3]
        self.assertEqual(actual, expected)







        
