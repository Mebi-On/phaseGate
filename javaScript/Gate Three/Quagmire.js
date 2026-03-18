

function specifyListLength(listOfNumbers, lengthOfNewList){
	let newListOfNumbers = [];
	let lengthOfListOfNumbers = listOfNumbers.length;
	for (let index = 0; index < lengthOfNewList; index++){
			if (index < lengthOfListOfNumbers){
				newListOfNumbers[index] = listOfNumbers[index];
			}
			else{
				newListOfNumbers[index] = -1;
			}
		}
		return newListOfNumbers;
}

console.log(specifyListLength([1, 2, 3, 4], 6))
console.log(specifyListLength([1, 2, 3, 4], 2))
console.log(specifyListLength([], 4))