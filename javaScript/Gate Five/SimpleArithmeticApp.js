
//Create a loop for the number of questions
//Create variables fot the score, number of questions and attempts made
//Generate 2 random variable, and check if valid
//If the second variable is greater than the first, it does not count as a question
//Create a loop so for if the answer is correct or incorrect
//For valid questions prompt the user to give an answer
//If the user get the question correct print correct answer, end loop and increase score by 1
//If user gets the question incorrect re-prompts the user, they have two attempts 
//If the user fails both attempts it moves to the next question and they score 0 for that question
//Print the users final score


const input = require("prompt-sync")(); 

let numberOfQuestions = 10;
		let questionNumber = 0;
		let score = 0;

		while ( questionNumber < numberOfQuestions ){
			let attempts = 0;
			let firstNumber = Math.floor(Math.random() * 100) + 1;
			let secondNumber = Math.floor(Math.random() * 100) + 1;


			if (firstNumber > secondNumber){
				let answer = firstNumber - secondNumber;
				questionNumber ++;
				console.log(`${firstNumber} - ${secondNumber}`);

				while (attempts <=2 ){
					let userAnswer = input("Enter answer = ");

					if ( userAnswer == answer ){
						console.log("Correct answer");
						attempts = 3;
						score ++;
						break;
					}
					else if ( userAnswer != answer && attempts < 1){
						console.log("Incorrect answer, 1 more try"); attempts = 2;
						continue;
					}
					else if ( userAnswer != answer && attempts <= 2){
						console.log("Incorrect answer, out of trys"); attempts = 2;
						break;
					}
				}
			}
		}
		console.log(score + " / 10 ");

