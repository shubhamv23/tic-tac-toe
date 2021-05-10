package TicTacToe.model;

import com.sun.tools.javac.util.List;

public enum GameStatus {
	NOT_STARTED,
	IN_PROGRESS,
	DRAW,
	FINISHED;

	public static List<GameStatus> completedGameStatus() {
		return List.of(DRAW, FINISHED);
	}
}
