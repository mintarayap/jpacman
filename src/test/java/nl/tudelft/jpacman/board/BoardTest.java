package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Test
 *
 * @author Araya Prateepthintong 
 *
 */
public class BoardTest {

    private final Square square = new BasicSquare();
    /**
     * testBoard.
     */
    @Test
    void testBoard() {
        Square[][] grid = new Square[][]{{square, square}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isEqualTo(true);
    }
    /**
     * testSquareAt.
     */
    @Test
    void testSquareAt() {
        Square[][] grid = new Square[][]{{square, null}};
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }
}
