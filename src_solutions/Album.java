import java.util.ArrayList;

class Album {

    private String albumName;
    private ArrayList<Song> songs;

    Album(String albumName, ArrayList<Song> songs) {
        this.albumName = albumName;
        this.songs = songs;
    }

    String getAlbumName() {
        return albumName;
    }

    ArrayList<Song> getSongs() {
        return songs;
    }

    void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    void addSong(Song song) { // 1 Punkt
        if (songs == null) { // 1 Punkt
            songs = new ArrayList<>(); // 1 Punkt
        }
        songs.add(song); // 1 Punkt
    }

    // Summe: 4 Punkte

}
