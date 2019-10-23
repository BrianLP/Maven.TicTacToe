package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public boolean checkHorizontal(Character xO){
        return false;
    }

    public boolean checkVertical(Character xO){
        return false;
    }

    public boolean checkDiagonal(Character xO){
        return false;
    }

    public Boolean isInFavorOfX() {
        return false;
    }

    public Boolean isInFavorOfO() {
        return null;
    }
        
    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
