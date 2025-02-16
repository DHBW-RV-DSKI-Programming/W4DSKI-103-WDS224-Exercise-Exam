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

}
