const input = require("prompt-sync")(); 

let userNumber = input("Enter a number: ");

for (let index = 0; index < 11; index++){
	console.log(`${userNumber} x ${index} = ${+userNumber * +index}`)
}

