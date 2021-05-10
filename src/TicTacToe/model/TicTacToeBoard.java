package TicTacToe.model;

public class TicTacToeBoard {
	private Integer size;
	private Symbol[][] grid;

	public TicTacToeBoard(Integer size) {
		this.size = size;
		this.grid = new Symbol[size][size];
		clear();
	}

	public void updateCell(int i, int j, Symbol symbol) {
		this.grid[i][j] = symbol;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				System.out.print(this.grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				this.grid[i][j] = Symbol.N;
			}
		}
	}

	public Integer getSize() {
		return size;
	}

	public Symbol[][] getGrid() {
		return grid;
	}
}
