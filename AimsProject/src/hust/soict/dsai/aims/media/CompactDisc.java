package hust.soict.dsai.aims.media;
import java.util.*;

public class CompactDisc extends Disc implements Playable {
	public String artist;
    public List<Track> tracks=new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
    public void addTrack(Track dvd)
    {
    	   if (!this.tracks.contains(dvd)) 
   	        {this.tracks.add(dvd);
   	         System.out.println("added");
   	        }
   	    else 
   	    	System.out.println("dvd da co!");
    }
    public void removeTrack(Track dvd)
    { 
    	if (this.tracks.contains(dvd)) 
       {     this.tracks.remove(dvd);
	         System.out.println("removed");
	        }
	    else 
	    	System.out.println("dvd khong co!");
    	
    }
    public int getLength()
    {
    	int sum=0;
    	for(Track dvd : tracks)
    		sum+=dvd.getLength();
    	return sum;
    }
    public void play()
    {
    	int i=1;
    	System.out.println("Danh sach cac track:");
    	for(Track tr: tracks)
    	{
    		System.out.println("Track " + i);
    		tr.play();
    		i++;
    	}
    }

}
