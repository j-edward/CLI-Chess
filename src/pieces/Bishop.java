package pieces;

public class Bishop extends Piece {

    private final char whitePiece = '♗';
    private final char blackPiece = '♝';
    
    public Bishop(char inputColour) {
        super(inputColour);
        setPieceIcon();
    }
    
    @Override
    public void setPieceIcon() {
        switch (getColour()) {
            case 'W':
                this.setPieceIcon(whitePiece);
                break;
            case 'B':
                this.setPieceIcon(blackPiece);
                break;
        }
    }

    @Override
    public void onMove(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onDestroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
