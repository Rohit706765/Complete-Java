package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String AlbumName;
    private String ArtistName;
    private ArrayList<Song> songs;

    public Album(String albumName, String artistName) {
        AlbumName = albumName;
        ArtistName = artistName;
        this.songs=new ArrayList<>();
    }
    public boolean AddSong(String Title,double duration)
    {
        Song song=findSong(Title);
        if (song==null)
        {
            songs.add(song);
            System.out.println("Successfully Added ");
            return true;
        }
        return false;
    }
    public boolean AddToPlaylist(int Tracknumber, LinkedList<Song> playlist)
    {
        int index=Tracknumber-1;
        if (index>=0 && index<=this.songs.size())
        {
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }
    public boolean AddToPlaylist(String title, LinkedList<Song> playlist)
    {
        Song song=findSong(title);
        if (song!=null)
        {
            playlist.add(song);
            return true;
        }
        return false;
    }

    public Song findSong(String name)
    {
        for(Song song:this.songs)// for(int i=0;i<song.size();i++)  Song song=songs.get(i)
        {
            if(song.getSongName().equals(name))
            {
                return song;
            }
        }
        return null;
    }

}
