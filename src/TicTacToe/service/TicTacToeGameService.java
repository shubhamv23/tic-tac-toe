package TicTacToe.service;

import TicTacToe.model.Move;
import TicTacToe.model.Player;

public interface TicTacToeGameService {
	void startGame();

	void restartGame();

	void restartGame(Player firstPlayer, Player secondPlayer);

	void makeMove(Move move);
}
