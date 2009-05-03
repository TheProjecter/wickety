package es.undesigned.services;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

/**
 * Created by Luis Soares (luis.soares@tomtom.com)
 * Date: 3/Mai/2009
 * Time: 15:28:31
 */
public class BandService {
private Map<Integer, Band> bands;
    private Map<Integer, Album> albums;

    public BandService() {
        // initialization
        // bands
        bands = new HashMap<Integer, Band>();
        bands.put( 1, new Band("Green Day", "US"));
        bands.put(2, new Band("PJ Harvey", "UK"));
        bands.put(3, new Band("Radiohead", "US"));

        //albums
        albums = new HashMap<Integer, Album>();
        albums.put( 1, new Album("Shenanigans",  2002));
        albums.put( 2, new Album("Nimrod",  1997));
        albums.put( 3, new Album("21st Century Breakdown",  2009));
        albums.put( 4, new Album("Uh huh her",  2004));
        albums.put( 5, new Album("Is this desire",  1998));
        albums.put( 6, new Album("To bring you my love",  1995));
        albums.put( 7, new Album("Ok computer",  1997));
        albums.put( 8, new Album("Amnesiac",  2001));
        albums.put( 9, new Album("Pablo honey",  1993));

        //connect both
        bands.get(1).addAlbum(albums.get(1));
        bands.get(1).addAlbum(albums.get(2));
        bands.get(1).addAlbum(albums.get(3));
        bands.get(2).addAlbum(albums.get(4));
        bands.get(2).addAlbum(albums.get(5));
        bands.get(2).addAlbum(albums.get(6));
        bands.get(3).addAlbum(albums.get(7));
        bands.get(3).addAlbum(albums.get(8));
        bands.get(3).addAlbum(albums.get(9));
    }

    public List<Band> readAllBands() {
        return (List<Band>) bands.values();
    }

    public List<Album> readAllAlbumsByBandID(int id) {
        return  bands.get(id).getAlbums();
    }
}
