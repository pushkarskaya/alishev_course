package day20;

public enum SeaPeaces {
    SHIP(1, "\uD83D\uDEE5"), SHIP_PART(2,"\uD83D\uDD25"), OREOL(0, "\uD83D\uDFE6"),
    EMPTY(0, "⬜"),FIRE(3,"\uD83D\uDD25");
    double value;
    String img;

    SeaPeaces(double value, String img) {
        this.value = value;
        this.img = img;
    }
    public String getImg(){
        return img;
    }
    public String toString(){
        return  getImg();
    }

}
