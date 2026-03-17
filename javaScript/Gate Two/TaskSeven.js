const input = require("prompt-sync")(); 

let sumOfNumbers = 0;
let count = 0;

while(count != 5){
		let userNumber = input(`Enter number ${count + 1}: `)
		sumOfNumbers += Number(userNumber);
		count += 1;
		}
console.log(`The sum of all your numbers is ${sumOfNumbers}`);
	
