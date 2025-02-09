import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    private final static int MAX_VOLUME = 100;
    private final ElasticSearchable elasticSearchable = new ElasticSearchable();

    void playSong(String songName) {
        List<Song> songs = elasticSearchable.search(songName);
        if (songs.isEmpty()) {
            System.out.println("Song not found");
        } else {
            System.out.println("Playing song: " + songs.get(0).getSongName() + " at volume: " + MAX_VOLUME);
        }
    }

    void playSongs() {
        List<Song> songs;
        songs = elasticSearchable.findSuitableSongs("POP", 3.5, "C", "Major", "4/4", 120, "New York");
        if (songs.isEmpty()) {
            System.out.println("Song not found");
        } else {
            System.out.println("Playing song: " + songs.get(0).getSongName() + " at volume: " + MAX_VOLUME);
        }
    }

    ArrayList<String> subGenresOfSong(Song song) {
        ArrayList<String> subGenres = new ArrayList<>();
        switch (song.getGenre()) {
            case POP -> {
                subGenres.add("Violin Pop");
                subGenres.add("Teen Pop");
                subGenres.add("Electropop");
            }
            case ROCK -> {
                subGenres.add("Alternative Rock");
                subGenres.add("Hard Rock");
                subGenres.add("Progressive Rock");
            }
            case JAZZ -> {
                subGenres.add("Swing");
                subGenres.add("Bebop");
                subGenres.add("Cool Jazz");
            }
            case CLASSICAL -> {
                subGenres.add("Baroque");
                subGenres.add("Romantic");
                subGenres.add("Renaissance");
            }
            case HIPHOP -> {
                subGenres.add("Trap");
                subGenres.add("Gangsta Rap");
                subGenres.add("Crunk");
            }
        }
        return subGenres;
    }

    Song randomSong() {
        return elasticSearchable.randomSong();
    }

    void createMixTape(int minTempo, int maxTempo, int baseSignature) {
        if (minTempo < 0 || maxTempo < 0 || baseSignature < 1 || baseSignature > 16 || minTempo > maxTempo) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Creating mix tape...");
        }

    }

    void createMixTape(int minTempo, int maxTempo, int baseSignature, int duration) {
        if (minTempo < 0 || maxTempo < 0 || baseSignature < 1 || baseSignature > 16 || minTempo > maxTempo || duration < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Creating mix tape...");
        }
    }

}
