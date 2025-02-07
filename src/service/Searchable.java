package service;

import model.Song;

import java.util.ArrayList;

public interface Searchable {

    ArrayList<Song> search(String keyword);

}
