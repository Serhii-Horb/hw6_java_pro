package org.example.Ex3;

public class Concert<T extends Artist> {
    private T artist;

    public Concert(T artist) {
        this.artist = artist;
    }

    public void newConcert() {
        System.out.println("Всем тихо начинается концерт!");
        artist.showsTalent();
        System.out.println("Всем спасибо концерт окончен!");
    }

    public static void main(String[] args) {
        Singer singer = new Singer("Толя", 32, "петь!");
        Concert<Singer> concertHall1 = new Concert<>(singer);
        concertHall1.newConcert();

        System.out.println("-------------------------------------------------------");

        Dancer dancer = new Dancer("Валера", 55, "танцевать польку!");
        Concert<Dancer> concertHall2 = new Concert<>(dancer);
        concertHall2.newConcert();
    }
}
