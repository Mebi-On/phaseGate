
function countEvens(numbers){
    let evenCount = 0;

    for (let number of numbers){
        if (number % 2 == 0){
            evenCount += 1;
        }
    }

    return evenCount;

}

numbers = [5, 9, 3, 6, 2];
console.log(countEvens(numbers))

function linearSearch(numbers, target){
    for (let index = 0; index < numbers.length; index++){
        if (numbers[index] == target){
            return index;
        }
    }

    return -1;

}

numbers = [5, -9, 3, -6, 2, -11];
console.log(linearSearch(numbers, 2))

function squares(numbers){
    if (numbers <= 0){
        return new int[0];
    }

    let squaredNumbers = [];

    for (let number = 1; number <= numbers; number++){
        squaredNumbers[number - 1] = number * number;
    }

    return squaredNumbers;

}
console.log(squares(4))

function arraysEqual(array1, array2){
    if (array1.length != array2.length){
        return false;
    }

    for(let index = 0; index < array1.length; index++){
        if (array1[index] != array2[index]){
            return false;
        }
    }

    return true;

}

array1 = [1,2,3,4,5];
array2 = [1,2,3,4,5];
console.log(arraysEqual(array1, array2))

function removeDuplicates(numbers){
    let newArray = [];

    for (let number of numbers){
        if (!newArray.includes(number)){
            newArray.push(number);
        }
    }
    
    return newArray;

}

numbers = [1,2,3,4,5,1,2,3];
console.log(removeDuplicates(numbers))

function flatten(matrix){
    let result = [];

    for (let rowIndex = 0; rowIndex < matrix.length; rowIndex++){
        for (let columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++){
            result.push(matrix[rowIndex][columnIndex]);
        }
    }

    return result;

}

matrix = [[1,2,3], [4,5,6], [7,8,9]];
console.log(flatten(matrix))

function intersectOf(array1, array2){
    let intersectElements = [];

    for (let number1 of array1){
        for (let number2 of array2){
        if (number1 == number2){
            intersectElements.push(number1);
            break;
        }
        }
    }

    return intersectElements;
}

array1 = [1,2,3,5,4,7];
array2 = [7,2,1,6,9];
console.log(intersectOf(array1, array2))
