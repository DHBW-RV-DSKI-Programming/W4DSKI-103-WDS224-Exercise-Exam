class Song { // 1 Punkt

    private String songName; // 1 Punkt
    private Genre genre; // 1 Punkt
    private int tempo; // 1 Punkt

    Song(String songName, Genre genre, int tempo) {
        this.songName = songName;
        this.genre = genre;
        this.tempo = tempo;
    } // 1 Punkt

    String getSongName() {
        return songName;
    } // 1 Punkt

    void setSongName(String songName) {
        this.songName = songName;
    } // 1 Punkt

    Genre getGenre() {
        return genre;
    } // 1 Punkt

    void setGenre(Genre genre) {
        this.genre = genre;
    } // 1 Punkt

    int getTempo() {
        return tempo;
    } // 1 Punkt

    void setTempo(int tempo) {
        this.tempo = tempo;
    } // 1 Punkt

    // Summe: 11 Punkte

}
