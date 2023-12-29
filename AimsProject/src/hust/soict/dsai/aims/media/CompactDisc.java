package hust.soict.dsai.aims.media;
import java.util.*;

import hust.soict.dsai.aims.exception.PlayerException;
public class CompactDisc extends Disc implements Playable {
	private String artist;
    private List<Track> tracks=new ArrayList<Track>();
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
    public void play() throws PlayerException
    {
//    	int i=1;
//    	System.out.println("Danh sach cac track:");
//    	for(Track tr: tracks)
//    	{
//    		System.out.println("Track " + i);
//    		tr.play();
//    		i++;
//    	}
    	if(this.getLength()>0)
    	{
    		java.util.Iterator iter= tracks.iterator();
    		Track nextTrack;
    		while(iter.hasNext())
    		{
    			nextTrack=(Track)iter.next();
    			try
    			{
    				 nextTrack.play();
    			}catch(PlayerException e)
    			{
    				throw e;
    			}
    		}
    	}else
    	{
    		throw new PlayerException("ERROR: CD length is non-postive!");
    	}
    }

}
