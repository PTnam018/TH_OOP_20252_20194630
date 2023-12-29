package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable{
	 private String title;
	 private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	 
	public void play() throws PlayerException
	{  if(this.getLength()>0)
			{
				System.out.println("Playing Track: " + this.getTitle());
				System.out.println("Track length: " + this.getLength());
			}else
			{
				throw new PlayerException("ERROR: Track length is non-positive!");
			}
	}

}
