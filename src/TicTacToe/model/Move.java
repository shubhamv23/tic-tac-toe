package TicTacToe.model;

public class Move {
	private Player player;
	private int xCordinate;
	private int yCordinate;

	public Move(Player player, int xCordinate, int yCordinate) {
		this.player = player;
		this.xCordinate = xCordinate;
		this.yCordinate = yCordinate;
	}

	public Player getPlayer() {
		return player;
	}

	public int getxCordinate() {
		return xCordinate;
	}

	public int getyCordinate() {
		return yCordinate;
	}

}
