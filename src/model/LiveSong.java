package model;

public class LiveSong extends Song {

    private String location;

    public LiveSong(String songName, double duration, String location) {
        super(songName, duration);
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
