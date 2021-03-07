package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.LinkedList_Parts.Challenge.MyAttempt;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration) {
        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            // Song doesn't exist in songs
            System.out.println("Adding " + title + " to the Album");
            songToAdd = new Song(title, duration);
            songs.add(songToAdd);
            return true;
        }
        System.out.println("Song already exists in the album");
        return false;
    }

    public Song findSong(String title) {
        for (int i=0; i < songs.size(); i++) {
            Song current = songs.get(i);
            if (current.getTitle().equals(title)) {
                System.out.println(title + " found successfully");
                return current;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String songTitle, Playlist playlist) {
        Song songOfInterest = findSong(songTitle);
        if (songOfInterest != null) {
            // Then the song is in the album, so add it to the playlist (if it can be done)
            playlist.addSong(songOfInterest);
            return true;
        }
        return false;
    }
}
