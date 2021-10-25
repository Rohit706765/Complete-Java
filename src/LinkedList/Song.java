package LinkedList;

public class Song {
    private String songName;
    private double duration;

    public Song(String songName, double duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public String toString() {
        return "song name"+this.songName+" Duration "+this.duration;
    }
}

