import java.util.ArrayList;

public interface Searchable {

    ArrayList<Song> search(String keyword);

    ArrayList<Song> findSuitableSongs(String genre, double duration, String key, String mode, String timeSignature, int tempo, String location);

    Song randomSong();

}
