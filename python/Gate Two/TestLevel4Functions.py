import unittest
from level_4_functions import *

class TestLevel4Functions(unittest.TestCase):
    def test_addition_positive_numbers(self):
        actual = addition(20, 47)
        expected = 67
        self.assertEqual(actual, expected)
    def test_addition_negative_numbers(self):
        actual = addition(-20, 30)
        expected = 10
        self.assertEqual(actual, expected)
    def test_even_check_even_numbers(self):
        actual = even_check(20)
        expected = "Is Even"
        self.assertEqual(actual, expected)
    def test_even_check_odd_number(self):
        actual = even_check(7)
        expected = "Is not Even"
        self.assertEqual(actual, expected)

    def test_squared_positive_numbers(self):
        actual = squared(12)
        expected = 144
        self.assertEqual(actual, expected)
    def test_squared_negative_numbers(self):
        actual = squared(-4)
        expected = 16
        self.assertEqual(actual, expected)
    def test_celsius_to_farenheit_one(self):
        actual = celsius_to_farenheit(20)
        expected = 68
        self.assertEqual(actual, expected)
    def test_celsius_to_farenheit_two(self):
        actual = celsius_to_farenheit(1)
        expected = 33.8
        self.assertEqual(actual, expected)

    def test_is_prime_with_known_prime_numbers(self):
        actual = is_prime(17)
        expected = True
        self.assertEqual(actual, expected)
    def test_is_prime_with_random_numbers(self):
        actual = is_prime(1774567)
        expected = False
        self.assertEqual(actual, expected)
    def test_largest_of_three_numbers_one(self):
        actual = largest_of_three(20, 23, 76)
        expected = 76
        self.assertEqual(actual, expected)
    def test_largest_of_three_numbers_two(self):
        actual = largest_of_three(7, 3, 12)
        expected = 12
        self.assertEqual(actual, expected)

    def test_simple_intrest_one(self):
        actual = simple_intrest(1200, 12, 5)
        expected = 720
        self.assertEqual(actual, expected)
        
    def test_simple_intrest_two(self):
        actual = simple_intrest(6_000_000, 21, 10)
        expected = 12_600_000
        self.assertEqual(actual, expected)

    def test_multiplication_table_one(self):
        actual = multiplication_table(12)
        expected = "12 x 10 = 120"
        self.assertEqual(actual[10], expected)
    def test_multiplication_table_two(self):
        actual = multiplication_table(7)
        expected = "7 x 10 = 70"
        self.assertEqual(actual[10], expected)

    def test_area_of_rectangle_one(self):
        actual = area_of_rectangle(12, 20)
        expected = 240
        self.assertEqual(actual, expected)
    def test_area_of_rectangle_two(self):
        actual = area_of_rectangle(7, 3)
        expected = 21
        self.assertEqual(actual, expected)

    def test_reverse_number_one(self):
        actual = reverse_number(1202)
        expected = 2021
        self.assertEqual(actual, expected)
        
    def test_reverse_number_two(self):
        actual = reverse_number(123)
        expected = 321
        self.assertEqual(actual, expected)

