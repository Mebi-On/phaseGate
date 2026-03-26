import unittest
from contact_app import *

class TestContactApp(unittest.TestCase):
    def test_valid_phone_number_False(self):
        contact_number = "08012345678"
        actual = valid_phone_number(contact_number)
        expected = False
        self.assertEqual(actual, expected)

    def test_valid_phone_number_True(self):
        contact_number = "09011186297"
        actual = valid_phone_number(contact_number)
        expected = True
        self.assertEqual(actual, expected)

    def test_find_contact_name_single_first_name(self):
        contact_name = "Dera"
        actual = find_contact_name(contact_name)
        expected = [2]
        self.assertEqual(actual, expected)

    def test_find_contact_name_multiple_first_name(self):
        contact_name = "John"
        actual = find_contact_name(contact_name)
        expected = [0, 1]
        self.assertEqual(actual, expected)

    def test_find_contact_name_single_last_name(self):
        contact_name = "Oko"
        actual = find_contact_name(contact_name)
        expected = [2]
        self.assertEqual(actual, expected)

    def test_find_contact_name_multiple_last_name(self):
        contact_name = "Doe"
        actual = find_contact_name(contact_name)
        expected = [0, 3]
        self.assertEqual(actual, expected)
