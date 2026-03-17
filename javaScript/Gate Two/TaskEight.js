const input = require("prompt-sync")(); 

let sumOfNumbers = 0;
let continueAsking = true;


while(continueAsking == true){
		let userNumber = input("Enter a number (Enter 0 to stop): ")
		sumOfNumbers += Number(userNumber);
		
		if (userNumber == 0 ){
			continueAsking = false;
		}
	}
console.log(`The sum of all your numbers is ${sumOfNumbers}`);
