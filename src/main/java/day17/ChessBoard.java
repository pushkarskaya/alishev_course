package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces = new ChessPiece[8][8];

    public ChessBoard(ChessPiece[][] chessPieces) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.chessPieces[i][j] = chessPieces[i][j];
            }
        }
    }

    public static void print(ChessBoard chessBoard) {
        ChessPiece[][] chessPieces = chessBoard.chessPieces;
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces.length; j++) {
                System.out.print(chessPieces[i][j].toString());
            }
            System.out.println("");
        }
    }
}



