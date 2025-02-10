public class Song {

    private String songName;
    private double duration;
    private Genre genre;
    private String mode;
    private String key;
    private String timeSignature;
    private int tempo;

    public Song(String songName, double duration, Genre genre, String mode, String key, String timeSignature, int tempo) {
        this.songName = songName;
        this.duration = duration;
        this.genre = genre;
        this.mode = mode;
        this.key = key;
        this.timeSignature = timeSignature;
        this.tempo = tempo;
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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTimeSignature() {
        return timeSignature;
    }

    public void setTimeSignature(String timeSignature) {
        this.timeSignature = timeSignature;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void play() {
        System.out.println("Playing a " + genre.name() + " song: " + songName);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", mode='" + mode + '\'' +
                ", key='" + key + '\'' +
                ", timeSignature='" + timeSignature + '\'' +
                ", tempo=" + tempo +
                '}';
    }

}
