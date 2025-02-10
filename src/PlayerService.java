import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerService {

    private final HarmoniaSearchable harmoniaSearchable = new HarmoniaSearchable();

    void playSong(String songName) {
        List<Song> songs = harmoniaSearchable.search(songName);
        if (songs.isEmpty()) {
            System.out.println(SystemMessages.NO_SUCH_SONG_FOUND);
        } else {
            Random random = new Random();
            int randomIndex = random.nextInt(songs.size());
            Song randomSong = songs.get(randomIndex);
            randomSong.play();
        }
    }

    void playSongs(Genre genre, double duration, String key, String mode, String timeSignature, int tempo, String location) {
        List<Song> songs;
        songs = harmoniaSearchable.findSuitableSongs(genre.name(), duration, key, mode, timeSignature, tempo, location);
        if (songs.isEmpty()) {
            System.out.println(SystemMessages.NO_SUITABLE_SONGS_FOUND);
            return;
        }
        for (Song song : songs) {
            song.play();
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
        return harmoniaSearchable.randomSong();
    }

    void createMixTape(int minTempo, int maxTempo, int baseSignature) {
        if (minTempo < 0 || maxTempo < 0 || baseSignature < 4 || baseSignature > 8 || minTempo > maxTempo) {
            System.out.println(SystemMessages.INVALID_INPUT);
            return;
        }
        String baseSignatureString = Integer.toString(baseSignature);
        List<Song> songs = harmoniaSearchable.createMixTape(minTempo, maxTempo, baseSignatureString, 5);
        for (Song song : songs) {
            song.play();
        }
    }

    void createMixTape(int minTempo, int maxTempo, int baseSignature, int duration) {
        if (minTempo < 0 || maxTempo < 0 || baseSignature < 4 || baseSignature > 8 || minTempo > maxTempo || duration < 0) {
            System.out.println(SystemMessages.INVALID_INPUT);
            return;
        }
        String baseSignatureString = Integer.toString(baseSignature);
        List<Song> songs = harmoniaSearchable.createMixTape(minTempo, maxTempo, baseSignatureString, duration, 5);
        for (Song song : songs) {
            song.play();
        }
    }

}
