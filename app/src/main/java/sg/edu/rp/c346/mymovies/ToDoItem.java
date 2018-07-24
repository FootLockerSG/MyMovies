package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private String year;
    private String rated;
    private int stars;
    private String genre;
    private Calendar watched_on;
    private String in_threatre;
    private String description;

    public ToDoItem(String title, String year, String rated, int stars, String genre, Calendar watched_on, String in_threatre, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.stars = stars;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_threatre = in_threatre;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public String getWatchedString() {
        String str = watched_on.get(Calendar.DAY_OF_MONTH)+"/"+watched_on.get(Calendar.MONTH)+"/"+watched_on.get(Calendar.YEAR);
        return str;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_threatre() {
        return in_threatre;
    }

    public void setIn_threatre(String in_threatre) {
        this.in_threatre = in_threatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", stars=" + stars +
                ", genre='" + genre + '\'' +
                ", watched_on=" + watched_on +
                ", in_threatre='" + in_threatre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String message() {
        String str = getTitle() + "\n" + getYear() + " - " + getGenre() + "\n" + "\n" +
                getDescription() + "\n" + "Watch on: " + getWatchedString() + "\n" +
                "In theatre: " + getIn_threatre();
        return str;
    }
}
