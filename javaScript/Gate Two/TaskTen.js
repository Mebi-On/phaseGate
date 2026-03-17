const input = require("prompt-sync")(); 

let userNumber = input("Enter a number: ");
let number = userNumber;
let count = 0;

while(userNumber >= 1){
	count += 1;
	userNumber /= 10;
	}
console.log(`There are ${count} digits in the number ${number}`);
	