package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts.Interfaces_LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    // === N.B - THANKS TO THE POWER OF INTERFACES, WE CAN EDIT THIS SLIGHTLY AND IT WON'T BREAK ===
    // Here we change from LinkedList -> List
    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        // N.B. - Notice how the code is still compatible, even though we've changed from LinkedList to List
        int index = trackNumber-1;
        if ((index >= 0) && (index < songs.size())) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This album does NOT have a track " + trackNumber);
        return false;
    }

    // Overloaded method for Track Title as well
    public boolean addToPlaylist(String songTitle, List<Song> playlist) {
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
