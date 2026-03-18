function addition(number_one, number_two){
    return number_one + number_two;}
 
function even_check(number){
	
    if (number % 2 == 0){
        return "Is Even";}
    else{
        return "Is not Even";}
	}

function squared(number){
    return number ** 2;}

function celsius_to_farenheit(temperature){
    return temperature * 9/5 + 32;}

function is_prime(number){
    let prime = true;

    for (let numbers = 2; numbers < number/2; numbers ++){
        if (number % numbers == 0){
            prime = false;}
	}
    return prime;}

function largest_of_three(first_number, second_number, third_number){
    list_of_numbers = [first_number, second_number, third_number];
    largest = 0;
    for (let numbers of list_of_numbers){
        if (numbers > largest){
            largest = numbers;}
	}
    return largest;}
    
function simple_intrest(principal, intrest_rate, time){
    return principal * intrest_rate * 0.01 * time;}

function multiplication_table(number){
    list_of_table = [];
    for (let numbers = 0; numbers <= 10; numbers++){
        list_of_table += [`${number} x ${numbers} = ${number * numbers}`];}
    return list_of_table;}

function area_of_rectangle(length, width){
    return length * width;}

function reverse_number(number){
    let reversed_int = 0
    while (number != 0){
        let last_digit = number % 10;
        number /= 10;
        reversed_int = reversed_int * 10 + last_digit;}
    return reversed_int;}
        





        
