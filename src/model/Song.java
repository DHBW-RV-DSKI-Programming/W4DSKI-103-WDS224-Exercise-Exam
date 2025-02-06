package model;

public class Song {

    private String songName;
    private double duration;
    private Genre genre = Genre.ROCK;
    private String mode;
    private String key;
    private String timeSignature;
    private int tempo;

    public Song(String songName, double duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public double getDuration() {
        return duration;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void play() {
        System.out.println("Playing " + songName + " for " + duration + " seconds");
    }

}
