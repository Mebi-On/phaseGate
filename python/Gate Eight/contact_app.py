contacts = [["John", "John", "Dera", "Jane"],["Doe", "Smith", "Oko", "Doe"],["08012345678", "09087654321", "08032145678", "07011112222"]]

def valid_phone_number(contact_number):
    isValid = True
    for first_list_index in range(len(contacts)):
        for second_list_index in range(len(contacts[first_list_index])):
            if contacts[first_list_index][second_list_index] == contact_number:
                isValid = False
            if len(contact_number) != 11:
                isValid = False
    return isValid


def find_contact_name(contact_name):
    all_contacts_with_name = []
    for first_list_index in range(len(contacts)):
        for second_list_index in range(len(contacts[first_list_index])):
            if contacts[first_list_index][second_list_index].lower() == contact_name.lower():
                all_contacts_with_name += [second_list_index]
    return all_contacts_with_name

            
def find_contact_number(contact_number):
    for first_list_index in range(len(contacts)):
        for second_list_index in range(len(contacts[first_list_index])):
            if contacts[first_list_index][second_list_index] == contact_number:
                return second_list_index 


def print_contact_info_from_number(contact_number):
    second_list_index = find_contact_number(contact_number)
    if second_list_index != None:
        for first_list_index in range(len(contacts)- 1):
            print(contacts[first_list_index][second_list_index], end= " ")
        return ("\n" + contact_number)
    else:
        return "Number not in contacts"


def print_contact_info_from_name(contact_name):
    all_contacts_with_name = find_contact_name(contact_name)
    if all_contacts_with_name != []:
        for contacts_index in all_contacts_with_name:
            for first_list_index in range(len(contacts)):
                print(contacts[first_list_index][contacts_index], end= " ")
            print()
        return len(all_contacts_with_name)
    else:
        return ("Name not in contacts")
 

def get_contact_info():
    new_contact_info_list = []
    first_name = input("Enter First Name: ")
    last_name = input("Enter Last Name: ")

    checking_if_number_valid = True
    while (checking_if_number_valid):
        contact_number = input("Enter Phone Number: ")
        if valid_phone_number(contact_number) == True:
            break
        else:
            print("Phone number already in contacts or Too short. Try Again")
    new_contact_info_list = [first_name, last_name, contact_number]
    return new_contact_info_list


def add_new_contact(new_contact_info_list):
    for elements in range(3):
        contacts[elements].append(new_contact_info_list[elements])
    print("Contact Added Successfully!")
    return contacts

    
def remove_contact(contact_number):
    contact_index = find_contact_number(contact_number)
    if contact_index != None:
        if (valid_phone_number(contact_number) == False):
            for first_list_index in range(len(contacts)):
                contacts[first_list_index].pop(contact_index)
                return contacts
    else:
        return "Number not in contacts"


#def edit_contact_information(contact_number, option_selected):
 #   if option_selected












