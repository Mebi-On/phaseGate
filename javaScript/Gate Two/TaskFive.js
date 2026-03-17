const input = require("prompt-sync")(); 


let userNumber = input("Enter a number: ")
let result = 1;
 
for (let numbers = 1; numbers <= userNumber; numbers++){
	result *= numbers;
	} 
console.log(`The factorial of ${userNumber} is ${result}`);
	