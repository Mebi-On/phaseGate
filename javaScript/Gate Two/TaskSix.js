const input = require("prompt-sync")(); 


let userNumber = input("Enter a number: ");
let result = 0;
 
for (let numbers = 1; numbers <= userNumber; numbers++){
	result += numbers;
	} 
console.log(`The sum of 1 to ${userNumber} is ${result}`);
	