public class LiveSong extends Song {

    private String location;

    public LiveSong(String songName, double duration, Genre genre, String mode, String key, String timeSignature, int tempo, String location) {
        super(songName, duration, genre, mode, key, timeSignature, tempo);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void play() {
        System.out.println("Playing " + getSongName() + " for " + getDuration() + " seconds at " + location);
    }

}
