package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.store.Store.*;
import hust.soict.dsai.aims.media.*;

public class Storetest {
	public static void main(String[] args) {
		Store dvdStore = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		dvdStore.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geoge Lucas", 87, 24.95f);
		dvdStore.addMedia(dvd2);
		
		
		dvdStore.removeMedia(dvd2);
	}
}