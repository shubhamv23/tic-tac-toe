package TicTacToe;

import TicTacToe.model.Player;
import TicTacToe.model.PlayerType;
import TicTacToe.model.Symbol;
import TicTacToe.service.AutomaticTicTacToeGame;
import TicTacToe.service.TicTacToeGame;

public class GameDriver {
	public static void main(String[] args) {
		int boardSize = 3;
		Player firstPlayer = new Player("Shubham", PlayerType.HUMAN, Symbol.X);
		Player secondPlayer = new Player("TacBot", PlayerType.COMPUTER, Symbol.O);

		TicTacToeGame game = new AutomaticTicTacToeGame(boardSize, firstPlayer, secondPlayer);
		game.startGame();
	}
}
