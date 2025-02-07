package service;

import model.Album;
import model.LiveSong;
import model.Song;

import java.util.ArrayList;

public class LoaderService {

    static final ArrayList<Album> albums = new ArrayList<>(){
        {
            add(new Album("Album 1", new ArrayList<>(){
                {
                    add(new Song("Song 1", 3.5));
                    add(new Song("Song 2", 4.0));
                    add(new Song("Song 3", 3.75));
                }
            }));
            add(new Album("Album 2", new ArrayList<>(){
                {
                    add(new Song("Song 4", 3.25));
                    add(new Song("Song 5", 4.5));
                    add(new Song("Song 6", 3.0));
                    add(new LiveSong("Song 7", 4.25, "Live in London"));
                }
            }));
        }
    };

}
