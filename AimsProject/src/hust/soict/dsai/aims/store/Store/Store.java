package hust.soict.dsai.aims.store.Store;

	import java.util.*;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
	public class Store {
		
		//tạo ds lk
		public ArrayList<Media> itemsInStore = new ArrayList<Media>();
		//remove
		public void removeMedia(Media disc) {
			itemsInStore.remove(disc);
			System.out.println("The Media " + disc.getTitle() + " removed");
		}

		//add
		public void addMedia(Media disc) {
		
				itemsInStore.add(disc);
				System.out.println("The Media " + disc.getTitle() + " added");
		}

		public ArrayList<Media> getItemsInStore() {
			return itemsInStore;
		}

		public void setItemsInStore(ArrayList<Media> itemsInStore) {
			this.itemsInStore = itemsInStore;
		}
		
}
