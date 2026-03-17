const input = require("prompt-sync")(); 

let itemPrice = input("Enter the price of your item: ");


console.log(`Your total plus tax is $${+itemPrice + +itemPrice/10}`);
