// Ricardo Rhone | May 16, 2019

let hands = ['rock', 'paper', 'scissors']; // Define a hands array with the values 'rock', 'paper', and 'scissors';

function getHand(hands) { //Define a function called getHand() that returns a hand from the array using parseInt(Math.random()*10)%3
	return hands[parseInt(Math.random() * hands.length) % 3];
}

//Define two objects for two players. Each player has name and getHand() properties.

let player1Obj = {
	name: 'Ricardo',
	getHand: getHand

}

let player2Obj = {
	name: 'Sariah',
	getHand: getHand
}

//Define a function called playGame() that takes arguments player1, player2, and playUntil.
function playGame(player1, player2, playUntil) {
	let Player1 = player1;
	let Player2 = player2;

	// Define a function called playRound() that
	function playRound(Player1, Player2) { //Takes the player object as arguements

		//Declaring and Initializing Variables
		let player1Hand, player2Hand;
		let player1Wins = 0;
		let player2Wins = 0;
		let handsplayed = 0;

		while (player1Wins < playUntil && player2Wins < playUntil) {

			//Gets hands from each player object
			player1Hand = Player1.getHand(hands);
			player2Hand = Player2.getHand(hands);
			console.log('\n' + Player1.name + ' hand: ' + player1Hand);
			console.log(Player2.name + ' hand: ' + player2Hand);

			//Determines who wins the round or if it is a draw
			if (player1Hand == "rock" && player2Hand == "scissors") {
				console.log(Player1.name + " wins this round");
				player1Wins += 1;
				handsplayed += 1;
				console.log("Number of rounds won: " + player1Wins)

			} else if (player2Hand == "rock" && player1Hand == "scissors") {
				console.log(Player2.name + " wins this round");
				player2Wins += 1;
				handsplayed += 1;
				console.log("Number of rounds won: " + player2Wins)

			} else if (player2Hand == "rock" && player1Hand == "rock") {
				console.log("Round tied, new round");
				handsplayed += 1;

			} else if (player2Hand == "scissors" && player1Hand == "scissors") {
				console.log("Round tied, new round");
				handsplayed += 1;

			} else if (player2Hand == "paper" && player1Hand == "paper") {
				console.log("Round tied, new round");
				handsplayed += 1;

			} else if (player1Hand == "paper" && player2Hand == 'rock') {
				console.log(Player1.name + ' wins this round');
				player1Wins += 1;
				handsplayed += 1;
				console.log("Number of rounds won: " + player1Wins)

			} else if (player2Hand == "paper" && player1Hand == "rock") {
				console.log(Player2.name + ' wins this round');
				player2Wins += 1;
				handsplayed += 1;
				console.log("Number of rounds won: " + player2Wins)

			} else if (player1Hand == "scissors" && player2Hand == "paper") {
				console.log(Player1.name + ' wins this round');
				player1Wins += 1;
				handsplayed += 1;
				console.log("Number of rounds won: " + player1Wins)

			} else if (player2Hand == "scissors" && player1Hand == "paper") {
				console.log(Player2.name + ' wins this round');
				player2Wins += 1;
				handsplayed += 1;
				console.log("Number of rounds won: " + player2Wins)
			}
		}

		//Displays the outcome (winner or draw) of the round 
		if (player1Wins == playUntil) {
			console.log('\n' + Player1.name + ' you are the Winner!!!');
			console.log('Number of hands played: ' + handsplayed + '\n');
			return Player1; //Returns the winner object (null if no winner)
		} else if (player2Wins == playUntil) {
			console.log('\n' + Player2.name + ' you are the Winner!!!')
			console.log('Number of hands played: ' + handsplayed + '\n');
			return Player2; //Returns the winner object (null if no winner)
		}
	}

	return playRound(Player1, Player2); //calls the playRound Function and returns the winnor object to the playgame function

}

// BONUS

/*
Take 4 players and playUntil as arguments
Play a game between the first two players, and the second two players
Play a game between the winners of the first round.
Announce the tournament winner's name "[name] is the world champion";
*/

//Defines two more objects for two additional players to be used in Tournament Play

let player3Obj = {
	name: 'Denise',
	getHand: getHand
}

let player4Obj = {
	name: 'Jhayden',
	getHand: getHand
}

//Define a function called playTournament()
function playTournament(player1, player2, player3, player4, playUntil) {

	console.log('\nROUND 1: FIRST TO WIN ' + playUntil + ' ROUNDS');
	let winningPlayerGame1 = playGame(player1, player2, playUntil); //plays a game between players 1 and 2
	console.log(winningPlayerGame1.name + ' You are the winner of ROUND 1');

	console.log('\nROUND 2: FIRST TO WIN ' + playUntil + ' ROUNDS');
	let winningPlayerGame2 = playGame(player3, player4, playUntil); //plays a game between players 3 and 4
	console.log(winningPlayerGame2.name + ' You are the winner of ROUND 2');

	console.log('\nCHAMPIONSHIP ROUND: FIRST TO WIN ' + playUntil + ' ROUNDS');
	let tournamentWinner = playGame(winningPlayerGame1, winningPlayerGame2, playUntil); //plays the final game between the players that won games 1 and 2

	console.log(tournamentWinner.name + ' is the WORLD CHAMPION!!!!!! \n');
}

playTournament(player1Obj, player2Obj, player3Obj, player4Obj, 5); //calls the playTournament Function 