package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDisc = 0;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;


	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;


	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;

		
	}
	public DigitalVideoDisc() {
		// TODO Auto-generated constructor stub
	}
	//kiểm tra trùng tile
	public boolean trungTitle(String title1) {
		return this.getTitle().equals(title1);
	}
	//hàm toString
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - "
				+ length + ": " + cost + "$";
	}
	public void play() throws PlayerException
	{
		if(this.getLength()>0)
		{	
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
		else
		{
			throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}

}
