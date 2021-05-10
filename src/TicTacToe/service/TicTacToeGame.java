package TicTacToe.service;

import TicTacToe.model.GameStatus;
import TicTacToe.model.Player;
import TicTacToe.model.TicTacToeBoard;

public abstract class TicTacToeGame implements TicTacToeGameService {
	private TicTacToeBoard ticTacToeBoard;
	private Player firstPlayer;
	private Player secondPlayer;
	private Player winner;
	private Player currentPlayer;
	private GameStatus gameStatus = GameStatus.NOT_STARTED;

	public TicTacToeGame(Integer boardSize, Player firstPlayer, Player secondPlayer) {
		this.ticTacToeBoard = new TicTacToeBoard(boardSize);
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void restartGame(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		this.restartGame();
	}

	public void restartGame() {
		this.currentPlayer = this.firstPlayer;
		this.winner = null;
		this.gameStatus = GameStatus.NOT_STARTED;
		this.ticTacToeBoard.clear();
		this.startGame();
	}

	public Player getWinner() {
		return this.winner;
	}

	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public Player getFirstPlayer() {
		return firstPlayer;
	}

	public Player getSecondPlayer() {
		return secondPlayer;
	}

	TicTacToeBoard getTicTacToeBoard() {
		return ticTacToeBoard;
	}

	void setWinner(Player winner) {
		this.winner = winner;
	}

	void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

}
