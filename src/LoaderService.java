import java.util.ArrayList;

class LoaderService {

    static final ArrayList<Album> albums = new ArrayList<>() {
        {
            add(new Album("Die Entführung aus dem Serail", new ArrayList<>() {
                {
                    add(new Song("Ouvertüre", 4.5, Genre.CLASSICAL, "Major", "C", "4/4", 120));
                    add(new Song("Hier soll ich dich denn sehen", 3.0, Genre.CLASSICAL, "Minor", "D", "3/4", 140));
                    add(new Song("Immer noch traurig, geliebte Konstanze", 1, Genre.CLASSICAL, "Minor", "E", "4/4", 100));
                    add(new Song("Singt dem großen Bassa Lieder", 1.5, Genre.CLASSICAL, "Major", "F", "6/8", 80));
                    add(new Song("Marten aller Arten", 10.1, Genre.CLASSICAL, "Major", "G", "4/4", 160));
                    add(new Song("Bassa Selim lebe lange", 1.25, Genre.CLASSICAL, "Minor", "A", "4/4", 110));
                }
            }));
            add(new Album("The Number of the Beast", new ArrayList<>() {
                {
                    add(new Song("Invaders", 3.5, Genre.ROCK, "Major", "C", "4/4", 120));
                    add(new Song("Children of the Damned", 4.0, Genre.ROCK, "Minor", "D", "3/4", 140));
                    add(new Song("The Prisoner", 6.5, Genre.ROCK, "Minor", "E", "4/4", 100));
                    add(new Song("22 Acacia Avenue", 6.0, Genre.ROCK, "Major", "F", "6/8", 80));
                    add(new Song("The Number of the Beast", 5.5, Genre.ROCK, "Major", "G", "4/4", 160));
                    add(new Song("Run to the Hills", 3.75, Genre.ROCK, "Minor", "A", "4/4", 110));
                    add(new Song("Gangland", 3.25, Genre.ROCK, "Major", "B", "4/4", 130));
                    add(new Song("Hallowed Be Thy Name", 7.0, Genre.ROCK, "Major", "C", "4/4", 120));
                }
            }));
            add(new Album("Live from Vatnagarðar", new ArrayList<>() {
                {
                    add(new LiveSong("Slow And Steady", 5.2, Genre.POP, "Major", "C", "4/4", 120, "Vatnagarðar"));
                    add(new LiveSong("Mountain Sound", 4.5, Genre.POP, "Minor", "D", "3/4", 140, "Vatnagarðar"));
                    add(new LiveSong("King And Lionheart", 4.0, Genre.POP, "Minor", "E", "4/4", 100, "Vatnagarðar"));
                    add(new LiveSong("Dirty Paws", 4.75, Genre.POP, "Major", "F", "6/8", 80, "Vatnagarðar"));
                    add(new LiveSong("Skeletons", 3.5, Genre.POP, "Major", "G", "4/4", 160, "Vatnagarðar"));
                    add(new LiveSong("Little Talks", 4.25, Genre.POP, "Minor", "A", "4/4", 110, "Vatnagarðar"));
                    add(new LiveSong("Six Weeks", 5.0, Genre.POP, "Major", "B", "4/4", 130, "Vatnagarðar"));
                }
            }));
            add(new Album("Jazz Classics", new ArrayList<>() {
                {
                    add(new Song("Take Five", 5.25, Genre.JAZZ, "Major", "C", "5/4", 120));
                    add(new Song("So What", 9.0, Genre.JAZZ, "Minor", "D", "3/4", 140));
                    add(new Song("All Blues", 11.5, Genre.JAZZ, "Minor", "E", "4/4", 100));
                    add(new Song("Blue in Green", 5.75, Genre.JAZZ, "Major", "F", "6/8", 80));
                    add(new Song("Flamenco Sketches", 9.25, Genre.JAZZ, "Major", "G", "4/4", 160));
                    add(new Song("Freddie Freeloader", 9.5, Genre.JAZZ, "Minor", "A", "4/4", 110));
                }
            }));
            add(new Album("Just Lose It", new ArrayList<>() {
                {
                    add(new Song("Just Lose It", 4.5, Genre.HIPHOP, "Major", "C", "4/4", 120));
                    add(new Song("Lose Yourself", 5.0, Genre.HIPHOP, "Minor", "D", "3/4", 140));
                }
            }));
        }
    };

}
