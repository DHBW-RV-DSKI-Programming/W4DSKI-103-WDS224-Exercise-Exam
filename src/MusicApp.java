import java.util.ArrayList;

public class MusicApp {

    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        playerService.playSong("Bohemian Rhapsody");
        playerService.playSong("Stairway to Heaven");

        playerService.playSongs(Genre.POP, 3.5, "C", "Major", "4/4", 120, "New York");

        Song song = playerService.randomSong();
        System.out.println(song.toString());
        ArrayList<String> subGenres = playerService.subGenresOfSong(song);
        System.out.println("Sub-genres of " + song.getGenre() + " are: " + subGenres);

        playerService.createMixTape(50, 100, 4);
        playerService.createMixTape(100, 150, 3, 2);

        Song newSong = new LiveSong("Stan", 6.5, Genre.HIPHOP, "D", "Minor", "4/4", 90, "New York");
        LoaderService.albums.get(LoaderService.albums.size() - 1).addSong(newSong);
        playerService.playSong("Stan");
    }

}