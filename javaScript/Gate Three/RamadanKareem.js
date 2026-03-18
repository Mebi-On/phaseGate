
function largest_in_nested_list(nested_list){
    let largest_number = 0;
    let result = [];
    for (let row_index = 0; row_index < nested_list.length; row_index++){
        for (let column_index = 0; column_index < nested_list[row_index].length; column_index++ ){
            if (nested_list[row_index][column_index] > largest_number){
                largest_number = nested_list[row_index][column_index];
                result = [row_index, column_index];
	    }
	}
    }

    return result
}

nested_list = [[10, 11, 12],[13, 14, 15],[20, 17, 18]];
console.log(largest_in_nested_list(nested_list)) 
nested_list = [[2.3, 23.9, 24.0],[43.5, 3.99, 7.7, 15.9],[2.0, 34.8, 43.59]]
console.log(largest_in_nested_list(nested_list)) 
nested_list = [[10, 33.3, 54],[10, 43.7, 88],[21, 54, 6.5]]
console.log(largest_in_nested_list(nested_list)) 
nested_list = [[10, 11, 12],[13, 14, 15, 77],[20, 17, 18]]
console.log(largest_in_nested_list(nested_list)) 


function numberOfOccurencesOfUniqueCharactersInAString(string){
    let result_string = "";
    for (let letters_index = 0; letters_index < string.length; letters_index++){
	
        if (!result_string.contains (string[letters_index])){
            result_string += string[letters];
	    console.log(result_string)
            for (let index = 0; index < result_string.length; index ++){
		let count = 0;
                for (let secondIndex = 0; secondIndex < string.length; secondIndex ++){
                    if (string[secondIndex] = result_string[index]){
                        count += 1;
			}
		    }
		
		}
		result_string += String(count);
	    }

	}
            
    return result_string;
}
console.log(numberOfOccurencesOfUniqueCharactersInAString("AaaBBc"))