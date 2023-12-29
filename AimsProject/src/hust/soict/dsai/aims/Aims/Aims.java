package hust.soict.dsai.aims.Aims;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.screen.CartScreen;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store.Store;


public class Aims {
    //Store 
	public static	Store Mediastore=new Store();
    public static Cart Mediacart=new Cart();
	public static void showMenu() throws PlayerException {
		int x=1;
		while(x==1)
		{	
			System.out.println("AIMS: ");
			System.out.println("--------------------------------");
			System.out.println("1. View store");
	        System.out.println("2. Update store");
			System.out.println("3. See current cart");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3");
		    int choose;
			Scanner keyboard =  new Scanner(System.in);	    
			choose=keyboard.nextInt();
			switch (choose) {
							case 0:System.out.println("Xin chao, hen gap lai!"); break;
							case 1:storeMenu();break;
							case 2: updateStore();break;
							case 3:cartMenu();break;	
							default:
								System.out.println("Nhap sai Menu!");;break;}
			
			if(choose==0) break;
		}
		
	    
}
	public static void storeMenu() throws PlayerException {
		int x=1;
		while(x==1)
		{	
				System.out.println("Options: ");
				System.out.println("--------------------------------");
				System.out.println("1. See a media’s details");
				System.out.println("2. Add a media to cart");
		        System.out.println("3. Play a media");
				System.out.println("4. See current cart");
				System.out.println("0. Back");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2-3-4");
				int choose;
				Scanner keyboard =  new Scanner(System.in);	    
				choose=keyboard.nextInt();
				switch (choose) {
								case 0:System.out.println("Tro ve menu truoc!"); break;
								case 1:mediaDetailsMenu();break;
								case 2:addCart();break;
								case 3:Play(Mediastore.itemsInStore);break;
								case 4:cartMenu();break;	
								default:
									System.out.println("Nhap sai Menu!");;break;}
				
				if(choose==0) break;
		}
	}
	public static void mediaDetailsMenu() throws PlayerException {
		    int x=1;
		    while(x==1)
		    {
					System.out.println("Options: ");
					System.out.println("--------------------------------");
					System.out.println("1. Add to cart");
					System.out.println("2. Play");
					System.out.println("0. Back");
					System.out.println("--------------------------------");
					System.out.println("Please choose a number: 0-1-2");
					int choose;
					Scanner keyboard =  new Scanner(System.in);	    
					choose=keyboard.nextInt();
					switch (choose) {
									case 0:System.out.println("Tro ve menu truoc!"); break;
									case 1:addCart();break;
									case 2:Play(Mediastore.itemsInStore);break;
										
									default:
										System.out.println("Nhap sai Menu!");;break;}
					
					if(choose==0) break;
		    }		
		}
	public static void cartMenu() throws PlayerException {
		int x=1;
		while(x==1){
					System.out.println("Options: ");
					System.out.println("--------------------------------");
					System.out.println("1. Filter medias in cart");
					System.out.println("2. Sort medias in cart");
					System.out.println("3. Remove media from cart");
					System.out.println("4. Play a media");
					System.out.println("5. Place order");
					System.out.println("0. Back");
					System.out.println("--------------------------------");
					System.out.println("Please choose a number: 0-1-2-3-4-5");
					int choose;
					Scanner keyboard =  new Scanner(System.in);	    
					choose=keyboard.nextInt();
					switch (choose) {
									case 0:System.out.println("Tro ve menu truoc!"); break;
									case 1:filtercart();break;
									case 2:sortmedia();break;
									case 3:removeCart();break;
									case 4:Play(Mediacart.itemsOrdered);break;	
									case 5:order();break;
									default:
										System.out.println("Nhap sai Menu!");;break;}
					
					if(choose==0) break;
		            } 
}
	
	// update store
	public static void updateStore()
	{
		int i=1;
		while(i==1)
		{
			
			System.out.println("Add or Remove Media!");
			System.out.println("1. Add Media.");
			System.out.println("2. Remove Media");
		    System.out.println("0.back");
		    int choose;
			Scanner keyboard =  new Scanner(System.in);	    
			choose=keyboard.nextInt();
			switch (choose) {
							case 0:System.out.println("Tro ve menu truoc!"); break;
							case 1:menu1();break;
							case 2:menu2();break;
								
							default:
								System.out.println("Nhap sai Menu!");;break;}
			
			if(choose==0) break;
		}
	}
   
	// add media vao store
	public static void menu1()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Nhap tilte disc:");
        String t=sc.nextLine();
        System.out.println("Nhap category");
        String c=sc.nextLine();
        System.out.println("Nhap cost");
        float co=sc.nextFloat();
        DigitalVideoDisc dvd= new DigitalVideoDisc(t,c,co);
        Mediastore.addMedia(dvd);
    }
// remove media store
	public static void menu2()
	{   int kt=0;
		System.out.println("nhap title can remove");
    	Scanner sc=new Scanner(System.in);
    	String t=sc.nextLine();
    	for(Media dvd: Mediastore.itemsInStore)
    	{	
		     if(dvd.getTitle().equals(t))	
			   { Mediastore.removeMedia(dvd);
			     System.out.println("removed");
			     break;
			   }
    	}  
       if (kt==0)
    	      System.out.println("Khong ton tai Media "+t);

	}
//Play disc   
    public static void Play(List<Media> x) throws PlayerException
    {
    	for( Media dvd: x)
    	{
    		DigitalVideoDisc dvd1=(DigitalVideoDisc)dvd;
    		dvd1.play();
    	}
    		
    }
  // add Cart 
    public static void addCart()
    {
    	Scanner sc=new Scanner(System.in);
    	for( Media dvd: Mediastore.itemsInStore)
    	{
    		System.out.println("add Media"+dvd.getTitle()+" ?");
    		System.out.println("1. Yes\n2.No");
    		int x=sc.nextInt();
    		if(x==1)
    		{
    			Mediacart.addMedia(dvd);
    			System.out.println("added!");
    		}
    	}
    }
   // remove Cart
    public static void removeCart()
    {   Scanner sc=new Scanner(System.in);
    	for(Media dvd:Mediacart.itemsOrdered)
    	{
    		System.out.println("remove Media "+dvd.getTitle()+" ?");
    		System.out.println("1. Yes\n2.No");
    		int x=sc.nextInt();
    		if(x==1)
    			  {
    			    Mediacart.removeMedia(dvd);
    			    System.out.println("removed!");
    			  }
    	}
    }
    // order cart
    public static void order()
    {
    	System.out.println("ban da dat hang thanh cong\n tong so tien la: "+Mediacart.totalCost());
    	Mediacart=new Cart();
    }
    //sort media for cart
    public static void sortmedia()
    {
    	int i=1;
		while(i==1)
		{
			
			System.out.println("Sort by title or Sort by cost");
			System.out.println("1. Sort by title");
			System.out.println("2. Sort by cost");
		    System.out.println("0.back");
		    int choose;
			Scanner keyboard =  new Scanner(System.in);	    
			choose=keyboard.nextInt();
			switch (choose) {
							case 0:System.out.println("Tro ve menu truoc!"); break;
							case 1:Collections.sort(Mediacart.itemsOrdered,Media.COMPARE_BY_TITLE_COST);Mediacart.printCart();break;
							case 2:Collections.sort(Mediacart.itemsOrdered, Media.COMPARE_BY_COST_TITLE);Mediacart.printCart();break;
								
							default:
								System.out.println("Nhap sai Menu!");;break;}
			
			if(choose==0) break;
		}
    }
    // filter for cart
    public static void filtercart()
    {
    	int i=1;
		while(i==1)
		{
			
			System.out.println("filter by id or filter by title");
			System.out.println("1. Filter by id");
			System.out.println("2. Filter by title");
		    System.out.println("0.back");
		    int choose;
			Scanner keyboard =  new Scanner(System.in);	    
			choose=keyboard.nextInt();
			switch (choose) {
							case 0:System.out.println("Tro ve menu truoc!"); break;
							case 1:Mediacart.searchCartId();break;
							case 2:Mediacart.searchCartTitle();break;
								
							default:
								System.out.println("Nhap sai Menu!");;break;}
			
			if(choose==0) break;
		}
    }
	public static void main(String[] args) throws PlayerException {
		  
		 // Cart anOrder = new Cart();
		  
		  DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD1",
				  "Animation","Roger Allers", 87, 19.95f);
		  
			Mediastore.addMedia(dvd1);
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD2",
					"Science Fiction","George Lucas",87,24.95f);
			Mediastore.addMedia(dvd2);
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
					"Animation",23.99f);
			Mediastore.addMedia(dvd3);
			DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD3",
					"Nam Cao",23.99f);
			Mediastore.addMedia(dvd4);
			DigitalVideoDisc dvd6 = new DigitalVideoDisc("DVD5",
					"HUST",2.799f);
			Mediastore.addMedia(dvd6);
			DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD4",
					"hihihi",23.99f);
			Mediastore.addMedia(dvd5);
			DigitalVideoDisc dvd7 = new DigitalVideoDisc("DVD5",
					"Animation",23.99f);
			Mediastore.addMedia(dvd7);
			
			
			
			
	  
	// lab05 Application		
	    new StoreScreen(Mediastore);
	
	//lab04 console menu    
	    //	showMenu();
	    
	    
    

	}

}
