package pl.comarch.szkolenia.enkapsulacja;

class Square {
    private int bok;
    private int obw;
    private int pole;

    public Square(int bok, int obw, int pole) {
        this.bok = bok;
        this.obw = obw;
        this.pole = pole;
    }

    private Square(int pole) {

    }

    public int getBok() {
        return bok;
    }

    public int getObw() {
        return obw;
    }

    public int getPole() {
        return pole;
    }

    public void setBok(int bok) {
        this.bok = bok;
        this.pole = bok*bok;
        this.obw = 4 * bok;
        System.out.println("ustawilo sie !!!");
    }

    public void setObw(int obw) {
        this.obw = obw;
    }
}
