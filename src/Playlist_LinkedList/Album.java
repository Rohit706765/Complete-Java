package Playlist_LinkedList;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Scanner;

public class Album {
    private String AristName;
    private String name;
    private ArrayList<Song> songs;

    public Album(String aristName, String name) {
        AristName = aristName;
        this.name = name;
        this.songs=new ArrayList<>();
    }
    public boolean AddSong(String title,Double Duration)
    {
        if(findSong(title)==null)
        {
            this.songs.add(new Song(title,Duration));
            return true;
        }
        return false;
    }
    private Song findSong(String Title)
    {
        for (Song CheckedSong:this.songs) // for each loop Similar to for(int i=0;i<song.size;i++)  Song checkedsong=
        {
            if (CheckedSong.getTitle().equals(Title))
            {
                return CheckedSong;
            }
        }
        return null;
    }
    public boolean AddToPlaylist(int TrackNumber, LinkedList<Song> playlist)
    {
        int index=TrackNumber-1; //
        if((index>=0)&&(index<=this.songs.size()))
        {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This Album Does'nt Have Track "+TrackNumber);
        return false;
    }
    public boolean AddToPlaylist(String Title,LinkedList<Song> playlist)
    {
        Song song=findSong(Title);
        if(song!=null)
        {
            playlist.add(song);
            return true;
        }
        System.out.println(Title+" is not in your Album ");
        return false;
    }
}























/*
     *   This linkedlist challenge here
     *   Class use Song , Album
     *   Concept use Arraylist, Linkedlist
     * */

    /*private static Scanner s=new Scanner(System.in);
    private ArrayList<Song> Album;
    private String AlbumName;


    public Album(String albumName) {
        AlbumName = albumName;
        this.Album=new ArrayList<>();
    }

    public ArrayList<Song> getAlbum() {
        return Album;
    }

    public String getAlbumName() {
        return AlbumName;
    }

        *//*
        *   This Code Add song in Album
        *   Album is Arraylist Okay !!!!
        *
        * *//*

    public void ListOfSong()
    {
        for (int i=0;i<Album.size();i++)
        {
            Song song=Album.get(i);
            System.out.println(" Song Name-->"+song.getTitle()+"\n Duration-->"+song.getDuration());
        }
    }
    public boolean UpdateExistingSong(String OldsongName,String NewSong,double Duration)
    {
        int position=FindSong(OldsongName);
        if(position<0)
        {
            System.out.println(OldsongName+" May be Not Exist In Your Album ");
            return false;
        }
        Song song=new Song(NewSong, Duration);
        Album.set(position,song);
        return true;
    }
    public boolean AddSong(Song song)
    {
        int position=FindSong(song.getTitle());
        if (position>=0)
        {
            System.out.println(song.getTitle()+" is Already in your Album ");
            return false;
        }
        Album.add(song);
        return true;
    }
    private int FindSong(Song song)
    {
        return this.Album.indexOf(song);
    }
    private int FindSong(String SongName)
    {
        for (int i=0;i<Album.size();i++)
        {
            Song song=Album.get(i);
            if (song.getTitle().equals(SongName))
            {
                return i;
            }
        }
        return -1;
    }
}
*/