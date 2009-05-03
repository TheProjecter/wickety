package es.undesigned.services;

/**
 * Created by Luis Soares (luis.soares@tomtom.com).
 * Date: 3/Mai/2009
 * Time: 16:38:01
 */
public class Album {
    private String name;
    private int year;

    public Album(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
