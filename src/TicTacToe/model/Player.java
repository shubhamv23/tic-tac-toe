package TicTacToe.model;

public class Player {
	private String name;
	private PlayerType playerType;
	private Symbol symbol;

	public Player(String name, PlayerType playerType, Symbol symbol) {
		this.name = name;
		this.playerType = playerType;
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return playerType.name() + " " + name + " " + symbol.name();
	}
}
