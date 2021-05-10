package TicTacToe.service;

import TicTacToe.model.GameMode;
import TicTacToe.model.GameStatus;
import TicTacToe.model.Move;
import TicTacToe.model.Player;

import static TicTacToe.model.GameStatus.DRAW;
import static TicTacToe.model.GameStatus.FINISHED;
import static TicTacToe.model.GameStatus.completedGameStatus;

public class AutomaticTicTacToeGame extends TicTacToeGame {

	private final GameMode gameMode = GameMode.AUTOMATIC;
	public AutomaticTicTacToeGame(Integer boardSize, Player firstPlayer, Player secondPlayer) {
		super(boardSize, firstPlayer, secondPlayer);
	}

	@Override
	public void startGame() {
		setGameStatus(GameStatus.IN_PROGRESS);
		while (!completedGameStatus().contains(getGameStatus())) {
			makeMove(getMoveForCurrentPlayer(getCurrentPlayer()));
			if (getCurrentPlayer() == getFirstPlayer()) {
				setCurrentPlayer(getSecondPlayer());
			} else {
				setCurrentPlayer(getFirstPlayer());
			}
		}

		if (DRAW.equals(getGameStatus())) {
			System.out.println(String.format("Game result is a DRAW between %s and %s",
					getFirstPlayer(), getSecondPlayer()));
		} else if (FINISHED.equals(getGameStatus())) {
			System.out.println(String.format("%s WON the Game", getWinner()));
		}
	}

	@Override
	public void makeMove(Move move) {
		validateMove(move);
		getTicTacToeBoard().updateCell(move.getyCordinate(), move.getxCordinate(), move.getPlayer().getSymbol());
		checkAndUpdateWinner(move.getPlayer());
	}

	private void checkAndUpdateWinner(Player player) {

	}

	private void validateMove(Move move) {
		if (move.getPlayer() != getFirstPlayer() && move.getPlayer() != getSecondPlayer()) {
			throw new IllegalArgumentException("Invalid player");
		}
		if ((move.getxCordinate() >= getTicTacToeBoard().getSize() && move.getxCordinate() < 0) ||
				(move.getyCordinate() >= getTicTacToeBoard().getSize() && move.getyCordinate() < 0)) {
			throw new IllegalArgumentException("Move is not a valid position on the board");
		}
	}

	private Move getMoveForCurrentPlayer(Player currentPlayer) {
		return new Move(currentPlayer, 0, 0);
	}

}
