import java.util.ArrayList;
import java.util.Random;

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

    @Override
    public ArrayList<Song> findSuitableSongs(String genre, double duration, String key, String mode, String timeSignature, int tempo, String location) {
        ArrayList<Album> albums = LoaderService.albums;
        ArrayList<Song> suitableSongs = new ArrayList<>();
        for (Album album : albums) {
            for (Song song : album.getSongs()) {
                if (song.getGenre().toString().equals(genre) && song.getDuration() == duration && song.getKey().equals(key) && song.getMode().equals(mode) && song.getTimeSignature().equals(timeSignature) && song.getTempo() == tempo) {
                    suitableSongs.add(song);
                }
            }
        }
        return suitableSongs;
    }

    @Override
    public Song randomSong() {
        ArrayList<Album> albums = LoaderService.albums;

        int randomAlbumIndex = new Random().nextInt(albums.size());
        Album randomAlbum = albums.get(randomAlbumIndex);

        ArrayList<Song> songs = randomAlbum.getSongs();
        int randomSongIndex = new Random().nextInt(songs.size());
        return songs.get(randomSongIndex);
    }

}
