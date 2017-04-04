package Entities;

/**
 * Created by Саня on 31.03.2017.
 */
public class Order {

    public static long id = 0;
    private String Film;
    private int ticketsCount;
    String time;

    public Order() {
    }

    public Order(long id, String film, int ticketsCount) {

        this.id = id;
        Film = film;
        this.ticketsCount = ticketsCount;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilm() {
        return Film;
    }

    public void setFilm(String film) {
        Film = film;
    }

    public int getTicketsCount() {
        return ticketsCount;
    }

    public void setTicketsCount(int ticketsCount) {
        this.ticketsCount = ticketsCount;
    }
}
