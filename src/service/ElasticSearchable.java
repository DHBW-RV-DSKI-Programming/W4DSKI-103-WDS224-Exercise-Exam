package service;

import model.Album;
import model.Song;

import java.util.ArrayList;

public class ElasticSearchable implements Searchable {

    @Override
    public ArrayList<Song> search(String keyword) {
        ArrayList<Album> albums = LoaderService.albums;
        for (Album album : albums) {
            for (Song song : album.getSongs()) {
                if (song.getSongName().contains(keyword)) {
                    return new ArrayList<>() {{
                        add(song);
                    }};
                }
            }
        }
        return new ArrayList<>();
    }

}
