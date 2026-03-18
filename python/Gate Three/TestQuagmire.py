import unittest
from quagmire import *

class TestQuagmire(unittest.TestCase):
    def test_specify_list_length_to_a_greater_numbers(self):
        actual = specify_list_length([1, 2, 3], 5)
        expected = [1, 2, 3, -1, -1]
        self.assertEqual(actual, expected)
    def test_specify_list_length_to_a_lesser_numbers(self):
        actual = specify_list_length([1, 2, 3, 4, 5, 6], 3)
        expected = [1, 2, 3]
        self.assertEqual(actual, expected)
    def test_specify_list_length_edge_case(self):
        actual = specify_list_length ([], 7)
        expected = [-1, -1, -1, -1, -1, -1, -1]
        self.assertEqual(actual, expected)
