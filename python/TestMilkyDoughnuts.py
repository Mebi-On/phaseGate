import unittest
from milky_doughnuts import *

class TestMilkyDoughnuts(unittest.TestCase):
    def test_count_evens(self):
        actual = count_evens([5, 9, 3, 6, 2])
        expected = 2
        self.assertEqual(actual, expected)
    def test_count_evens_ordered(self):
        actual = count_evens([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
        expected = 5
        self.assertEqual(actual, expected)
    def test_count_evens_with_negative_numbers(self):
        actual = count_evens([-5, 2, 3, 5, -6, 12, -9, 17])
        expected = 3
        self.assertEqual(actual, expected)


    def test_linear_search_with_only_positive_numbers_list(self):
        actual = linear_search([5, -9, 3, -6, 2, -11], 2)
        expected = 4
        self.assertEqual(actual, expected)

    def test_linear_search_with_only_negative_numbers(self):
        actual = linear_search([-5, -9, -3, -6, -2, -11], -2)
        expected = 4
        self.assertEqual(actual, expected)
    
    def test_linear_search_edge_cases(self):
        actual = linear_search([0, -3, 0, -2, 4, 0, -9], -3)
        expected = 1
        self.assertEqual(actual, expected)


    def test_squares(self):
        actual = squares(5)
        expected = [1, 4, 9, 16, 25]
        self.assertEqual(actual, expected)

    def test_squares_with_negative_numbers(self):
        actual = squares(-4)
        expected = []
        self.assertEqual(actual, expected)
    
    def test_squares_edge_cases(self):
        actual = squares(0)
        expected = []
        self.assertEqual(actual, expected)
    
    
    def test_arrays_equal(self):
        array1 = [1, 2, 3, 4, 5]
        array2 = [1, 2, 3, 4, 5]
        actual = arrays_equal(array1, array2)
        expected = True
        self.assertEqual(actual, expected)

    def test_arrays_equal_two(self):
        array1 = []
        array2 = []
        actual = arrays_equal(array1, array2)
        expected = True
        self.assertEqual(actual, expected)
    
    def test_arrays_equal_edge_cases(self):
        array1 = [1, 2, 3, 4, 5]
        array2 = [5, 4, 3, 2, 1]
        actual = arrays_equal(array1, array2)
        expected = False
        self.assertEqual(actual, expected)



    def test_remove_duplicates(self):
        actual = remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3])
        expected = [1, 2, 3, 4, 5]
        self.assertEqual(actual, expected)

    def test_remove_duplicates_with_negative_numbers(self):
        actual = remove_duplicates([-1, -2, -3, -1, -2])
        expected = [-1, -2, -3]
        self.assertEqual(actual, expected)

    def test_remove_duplicates_edge_cases(self):
        actual = remove_duplicates([])
        expected = []
        self.assertEqual(actual, expected)


    def test_flatten_same_list_lenghts(self):
        matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        actual = flatten(matrix)
        expected = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        self.assertEqual(actual, expected)

    def test_flatten_different_list_lenghts(self):
        matrix = [[1, 2, 3], [4, 5, 6, 7], [ 8, 9, 10]]
        actual = flatten(matrix)
        expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        self.assertEqual(actual, expected)
    
    def test_flatten_edge_case(self):
        matrix = [[-43, 6, 20, 12], [1, 90], [17, 81, -5, 0, 3], [4, 5, 6, 7, 8, 9]]
        actual = flatten(matrix)
        expected = [-43, 6, 20, 12, 1, 90, 17, 81, -5, 0, 3, 4, 5, 6, 7, 8, 9]
        self.assertEqual(actual, expected)


    def test_intersectOf(self):
        array1 = [1, 2, 3, 5, 4, 7]
        array2 = [7, 2, 1, 6, 9]
        actual = intersectOf(array1, array2)
        expected = [1, 2, 7]
        self.assertEqual(actual, expected)

    def test_intersectOf_two(self):
        array1 = [10, 2, 23, 5, -14]
        array2 = [12, 32, 5, 89, 29]
        actual = intersectOf(array1, array2)
        expected = [5]
        self.assertEqual(actual, expected)
    
    def test_intersectOf_edge_cases(self):
        array1 = []
        array2 = []
        actual = intersectOf(array1, array2)
        expected = []
        self.assertEqual(actual, expected)