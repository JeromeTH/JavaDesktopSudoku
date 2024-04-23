package sudoku.problemdomain;
public class SudokuGame{
    private final GameState gameState;
    private final int[][] gridState;

    public SudokuGame(int[][] gridState) {
        this.gridState = gridState;
    }
}