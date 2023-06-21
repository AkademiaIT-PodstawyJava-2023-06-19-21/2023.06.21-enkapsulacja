package pl.comarch.szkolenia.enkapsulacja;

public class App {
    public static void main(String[] args) {
        Square square = new Square(5, 20, 25);

        System.out.println(square.getBok());
        System.out.println(square.getObw());
        System.out.println(square.getPole());

        square.setBok(10);

        System.out.println(square.getBok());
        System.out.println(square.getObw());
        System.out.println(square.getPole());


        square.setBok(10);


        square.setBok(10);


        square.setBok(10);
    }
}
