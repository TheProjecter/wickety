package es.undesigned.services;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Soares (luizsoarez@gmail.com).
 * Date: 3/Mai/2009
 * Time: 16:40:01
 */
public class Band {
    private String name;
    private String country;
    private List<Album> albums;


    public Band(String name, String country) {
        this.name = name;
        this.country = country;
        this.albums = new ArrayList<Album>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
