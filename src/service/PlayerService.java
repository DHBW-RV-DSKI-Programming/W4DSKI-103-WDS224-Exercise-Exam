package service;

import model.Song;

import java.util.List;

public class PlayerService {

    private static int MAX_VOLUME = 100;
    private final ElasticSearchable elasticSearchable = new ElasticSearchable();

    public void playSong(String songName) {
        List<Song> songs = elasticSearchable.search(songName);
        if (songs.isEmpty()) {
            System.out.println("Song not found");
        } else {
            System.out.println("Playing song: " + songs.get(0).getSongName() + " at volume: " + MAX_VOLUME);
        }
    }

}
