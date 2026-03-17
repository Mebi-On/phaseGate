const input = require("prompt-sync")(); 

let firstNumber = input("Enter a number ");
let secondNumber = input("Enter a number ");
let thirdNumber = input("Enter a number ");
let average = (+firstNumber + +secondNumber + +thirdNumber) / 3

console.log(`The average of your three numbers are ${average}`);
