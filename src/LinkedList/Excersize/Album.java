package LinkedList.Excersize;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artistName;
    private ArrayList<Song> album;

    public Album(String name, String artistName) {
        this.name = name;
        this.artistName = artistName;
        this.album = new ArrayList<>();
    }

    public boolean addSong(String songName , double duration)
    {
        if (findSong(songName)==null)
        {
            album.add(new Song(songName,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songName)
    {

        for (int i=0;i<album.size();i++)
        {
            Song mySong =  album.get(i);

            if (mySong.getTitle().equals(songName))
            {
                return mySong;
            }
        }

        // second way of doing this program

       /* for (Song mySong:this.album)
        {
            if (mySong.getTitle().equals(songName))
            {
                return mySong;
            }
        }*/
        return null;
    }
    public boolean addToPlaylist(int trackNumber , LinkedList<Song> playlist)
    {
        int index = trackNumber - 1;
        if ((index>0) && (index<=playlist.size()))
        {
            playlist.add(this.album.get(index));
            return true;
        }
        System.out.println("this song does not have any track ");
        return false;
    }
}
