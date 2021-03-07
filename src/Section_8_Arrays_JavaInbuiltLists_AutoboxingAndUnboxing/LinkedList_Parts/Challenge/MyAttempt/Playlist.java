package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.LinkedList_Parts.Challenge.MyAttempt;

import java.util.LinkedList;
import java.util.Scanner;

public class Playlist {
    private String name;
    private LinkedList<Song> playlist;

    private Scanner input = new Scanner(System.in);

    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedList<Song>();
    }

    public boolean addSong(Song song) {
        if (!findSong(song)) {
            System.out.println("Adding song to the playlist");
            playlist.add(song);
            return true;
        }
        System.out.println(song.getTitle() + " already exists in the playlist");
        return false;
    }

    private boolean findSong(Song song) {
        String songTitle = song.getTitle();
        for (int i=0; i < playlist.size(); i++) {
            String currentTitle = playlist.get(i).getTitle();
            if (currentTitle.equals(songTitle)) {
                // Then song exists in the playlist
                return true;
            }
        }
        // Else, song not in the playlist
        return false;
    }

    public void goThroughPlaylist() {

    }
}
