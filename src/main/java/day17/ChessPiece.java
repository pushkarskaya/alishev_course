package day17;

public enum ChessPiece {
    KING_WHITE(100, "\u2654"), KING_BLACK(100, "\u265A"), QWEEN_WHITE(9, "\u2655"),
    QWEEN_BLACK(9, "\u265B"), ROOK_WHITE(5, "\u2656"), ROOK_BLACK(5, "\u265C"),
    BISHOP_WHITE(3.5, "\u2657"), BISHOP_BLACK(3.5, "\u265D"), KNIGHT_WHITE(3, "\u2658"),
    KNIGHT_BLACK(3, "\u265E"), PAWN_WHITE(1, "\u2659"), PAWN_BLACK(1, "\u265F"),
    EMPTY(-1, "_");

    double value;
    String img;

    ChessPiece(double value, String img) {
        this.value = value;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String toString() {
        return getImg();
    }
}

