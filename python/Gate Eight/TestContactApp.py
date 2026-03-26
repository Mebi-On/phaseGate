import unittest
from contact_app import *

class TestContactApp(unittest.TestCase):
    def test_valid_phone_number_False(self):
        contact_number = "08012345678"
        actual = valid_phone_number(contact_number)
        expected = False
        self.assertEqual(actual, expected)

    def test_valid_phone_number_True(self):
        contact_number = "09012345698"
        actual = valid_phone_number(contact_number)
        expected = True
        self.assertEqual(actual, expected)

    def test_valid_phone_number_less_that_11(self):
        contact_number = "090111625"
        actual = valid_phone_number(contact_number)
        expected = False
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

    def test_find_contact_name_fail(self):
        contact_name = "Baron"
        actual = find_contact_name(contact_name)
        expected = []
        self.assertEqual(actual, expected)

    def test_find_contact_number(self):
        contact_number = "08012345678"
        actual = find_contact_number(contact_number)
        expected = 0
        self.assertEqual(actual, expected)

    def test_find_contact_number_fail(self):
        contact_number = "08012345699"
        actual = find_contact_number(contact_number)
        expected = None
        self.assertEqual(actual, expected)

    def test_print_contact_info_from_number(self):
        contact_number = "08012345678"
        actual = print_contact_info_from_number(contact_number)
        expected = "\n08012345678"
        self.assertEqual(actual, expected)

    
    def test_print_contact_info_from_number(self):
        contact_number = "080123456699"
        actual = print_contact_info_from_number(contact_number)
        expected = 'Number not in contacts'
        self.assertEqual(actual, expected)


    
    def test_print_contact_info_from_first_name(self):
        contact_number = "Dera"
        actual = print_contact_info_from_name(contact_number)
        expected = 1
        self.assertEqual(actual, expected)

    
    def test_print_contact_info_from_first_name_multiple(self):
        contact_number = "John"
        actual = print_contact_info_from_name(contact_number)
        expected = 2
        self.assertEqual(actual, expected)
    

    def test_print_contact_info_from_last_name(self):
        contact_number = "Smith"
        actual = print_contact_info_from_name(contact_number)
        expected = 1
        self.assertEqual(actual, expected)

    
    def test_print_contact_info_from_last_name_multiple(self):
        contact_number = "Doe"
        actual = print_contact_info_from_name(contact_number)
        expected = 2
        self.assertEqual(actual, expected)

    def test_print_contact_info_from_name_fail(self):
        contact_number = "Bill"
        actual = print_contact_info_from_name(contact_number)
        expected = "Name not in contacts"
        self.assertEqual(actual, expected)


    def test_get_contact_info(self):
        actual = get_contact_info()
        expected = ['Bill', 'Nye', '09012345678']
        self.assertEqual(actual, expected)







