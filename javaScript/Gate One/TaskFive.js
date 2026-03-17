const input = require("prompt-sync")(); 


let celsius_temp = input("Enter temperature in C: ");
let fahrenheit = celsius_temp * 9/5 + 32

console.log(`The temperature is ${fahrenheit}F`)
 