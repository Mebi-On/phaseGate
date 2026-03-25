import unittest
from number_guessing_app import *

class TestNumberGuessingApp(unittest.TestCase):
    def test_random_number_generator(self):
        actual = (random_number_generator() >= 1 and random_number_generator() <= 100)
        expected = True
        self.assertEqual(actual, expected)
        
    def test_track_and_display_rating_one(self):
        actual = track_and_display_rating(2)
        expected = "Excellent"
        self.assertEqual(actual, expected)

    def test_track_and_display_rating_two(self):
        actual = track_and_display_rating(3)
        expected = "Good"
        self.assertEqual(actual, expected)

    def test_track_and_display_rating_fail(self):
        actual = track_and_display_rating(6)
        expected = "Better luck"
        self.assertEqual(actual, expected)


    def test_number_guessing_game(self):
        actual = number_guessing_game(20)
        expected = 5
        self.assertEqual(actual, expected)
        

    def test_input_validator_with_a_number(self):
        actual = input_validator("5")
        expected = True
        self.assertEqual(actual, expected)

    def test_input_validator_with_a_letter(self):
        actual = input_validator("e")
        expected = False
        self.assertEqual(actual, expected)


    def test_input_validator_out_of_range(self):
        actual = input_validator("200")
        expected = False
        self.assertEqual(actual, expected)

    def test_deisplay_summary(self):
        actual = deisplay_summary(20, 3)
        expected = "The Correct number is 20, you took 3 attempts, Good"
        self.assertEqual(actual, expected)

    def test_deisplay_summary_failure(self):
        actual = deisplay_summary(50, 6)
        expected = "The Correct number is 50, you took 6 attempts, Better luck"
        self.assertEqual(actual, expected)






        
