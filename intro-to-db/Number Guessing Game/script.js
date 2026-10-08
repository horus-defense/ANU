var randomNum = Math.floor(Math.random() * 100) + 1;
var attemps = 0;
var guessButton = document.getElementById("guessButton");
function genRandomNum() {
    var userInput = document.getElementById("userInput").valueAsNumber;
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
    document.getElementById("attempsNum").innerHTML = attemps;
}
console.log(randomNum);
console.log(attemps);

