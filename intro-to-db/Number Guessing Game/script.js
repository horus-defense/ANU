var randomNum = Math.floor(Math.random() * 100) + 1;
var guessButton = document.getElementById("guessButton");
var userInput = document.getElementById("userInput").valueAsNumber;
var attemps = 0;
document.getElementById("attempsNum").innerHTML = attemps;
function genRandomNum() {
    if (userInput < 0 || userInput > 100){
        document.getElementById("result").innerHTML = "You entered an incorrect number";
    }
    else if (randomNum === userInput) {
        document.getElementById("result").innerHTML = "Your Guess is correct";
        guessButton.disabled = true;
        attemps = attemps + 1;
    } else if (randomNum > userInput) {
        document.getElementById("result").innerHTML = "Your Guess is Too Low";
        attemps = attemps + 1;
    } else if (randomNum < userInput) {
        document.getElementById("result").innerHTML = "Your Guess is Too High";
        attemps = attemps + 1;
    }
}
console.log(randomNum);

