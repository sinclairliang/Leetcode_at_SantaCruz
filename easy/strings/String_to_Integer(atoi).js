/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function (str) {

    // trim out any spaces
    let newStr = str.trim();

    // check if negative or not
    let isNegative = false;
    if (newStr.charAt(0) == "-") {
        newStr = newStr.substr(1);
        isNegative = true;
    }

    // check if there's a non-numeric character after symbol
    if (isNaN(Number(newStr[0]))) {
        return 0;
    }
    if (newStr[0] == " ") {
        return 0
    }

    //check if there are any characters after the numbers
    let gotem = false;
    for (let index = 0; index < newStr.length; index++) {
        let char = newStr[index];
        if (isNaN(char) || char == " ") {
            newStr = newStr.substr(0, index);
            newStr = Number(newStr);
            gotem = true;
            break;
        }
    }
    if (!gotem) {
        newStr = Number(newStr);
    }

    //check if out of bounds
    if (isNegative) {
        newStr = -newStr;
        if (newStr < -Math.pow(2, 31)) {
            newStr = -Math.pow(2, 31);
        }
    } else {
        if (newStr > Math.pow(2, 31) - 1) {
            newStr = Math.pow(2, 31) - 1;
        }
    }
    return newStr;
};