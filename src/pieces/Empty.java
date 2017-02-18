package pieces;

public class Empty extends Piece {

    private final char pieceType = ' ';

    public Empty() {
        super.setAlive('N');
    }

    public char getPieceIcon() {
        return pieceType;
    }

    @Override
    public void onMove(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onDestroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPieceIcon(char side) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
