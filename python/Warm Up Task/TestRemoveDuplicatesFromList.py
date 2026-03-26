import unittest
from remove_duplicates_from_list import *

class TestRemoveDuplicatesFromList(unittest.TestCase):
    def test_remove_duplicates_from_list(self):
        list_of_numbers = [1, 2, 3, 2, 4]
        actual = remove_duplicates_from_list(list_of_numbers)
        expected = [1, 3, 4]
        self.assertEqual(actual, expected)

    def test_remove_duplicates_from_list_two(self):
        list_of_numbers = [1, 2, 3, 3, 4]
        actual = remove_duplicates_from_list(list_of_numbers)
        expected = [1, 2, 4]
        self.assertEqual(actual, expected)

    def test_remove_duplicates_from_list_no_duplicates(self):
        list_of_numbers = [1, 2, 3, 4, 5]
        actual = remove_duplicates_from_list(list_of_numbers)
        expected = [1, 2, 3, 4, 5]
        self.assertEqual(actual, expected)

    def test_remove_duplicates_from_list_all_duplicates(self):
        list_of_numbers = [1, 1, 2, 2, 3, 3, 4, 4]
        actual = remove_duplicates_from_list(list_of_numbers)
        expected = []
        self.assertEqual(actual, expected)
