package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.LinkedList_Parts.Challenge.Solution;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
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
        for (Song current: songs) {
            if (current.getTitle().equals(title)) {
                System.out.println(title + " found successfully");
                return current;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber-1;
        if ((index >= 0) && (index < songs.size())) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This album does NOT have a track " + trackNumber);
        return false;
    }

    // Overloaded method for Track Title as well
    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        Song songToFind = findSong(songTitle);
        if (songToFind != null) {
            // Then it exists in the album, so we can add it to the playlist
            playlist.add(songToFind);
            return true;
        }
        System.out.println("This album does NOT have the song: " + songTitle);
        return false;
    }
}
