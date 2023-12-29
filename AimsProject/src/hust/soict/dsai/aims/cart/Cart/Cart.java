package hust.soict.dsai.aims.cart.Cart;
import java.util.*;
import hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public ObservableList<Media> itemsOrdered= FXCollections.observableArrayList();
	public void addMedia(Media m)
	{
	    
		if((itemsOrdered.size()<MAX_NUMBERS_ORDERED)&&(!itemsOrdered.contains(m)))
		{itemsOrdered.add(m);
		 System.out.println("added");
		}
	  else System.out.println("Can not add!");
	  
	}
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(ObservableList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public void removeMedia(Media m)
	{
		if(itemsOrdered.contains(m))
		{
			itemsOrdered.remove(m);
			System.out.println("removed!");
		}
		else 
			System.out.println("media not found!");
	}
	public float totalCost() {
		float totalCost = 0;
		for(Media dvd:itemsOrdered ) {
			totalCost += dvd.getCost();
		}
		return totalCost;}
	 
	public void searchCartId() {
	    	int id, sum = 0;
	    	Scanner keyboard =  new Scanner(System.in);
	    	System.out.println("nhap ID: ");
	    	id = keyboard.nextInt(); 
	    	for(Media dvd:itemsOrdered) {
	    		if(id == dvd.id) {
	    			System.out.println(dvd.toString());
	    			sum ++;
	    			break;
	    		}
	    	}
	    		
	    		
	    	if(sum == 0) {
	    		System.out.println("Found\n");
	    	}

	    	
	    }
	//tìm theo tiêu đề
	
	public void searchCartTitle() {
		String title1;
		int sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("nhap title: ");
		title1 = keyboard.nextLine();
		for(Media dvd:itemsOrdered) {
			if(dvd.title.equals(title1)) 
			{
				System.out.println(dvd.toString());
				sum ++;
				break;
			}
		}
		if(sum == 0) {
			System.out.println("Found!");
		}
		}
	//in xe đẩy 
	public void printCart() {int j = 0;

	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        //System.out.println("1. " +itemsOrdered[0].toString());
	        for(Media dvd:itemsOrdered) {
	        	j++;
	        	System.out.println(j + ". " +dvd.toString());
	        }
	        System.out.println("Total cost: " + totalCost());
	        System.out.println("***************************************************");
	        
	    }
	public ObservableList<Media> searchID(int id) {
		ObservableList<Media> x= FXCollections.observableArrayList();
		for(Media m : itemsOrdered)
			 if(m.getId()==id)
				 x.add(m);
			
		return x;
	}
	public ObservableList<Media> searchTitle(String s) {
		ObservableList<Media> x= FXCollections.observableArrayList();
		for(Media m : itemsOrdered)
			 if(m.getTitle().equals(s))
				 x.add(m);
			
		return x;
	}
}
