package hust.soict.dsai.aims.Aims;
import java.util.Scanner;

import hust.soict.dsai.aims.store.Store.Store;


public class Aims {
	public static void showMenu() {
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
	public static void storeMenu() {
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
								case 2:break;
								case 3:cartMenu();break;
								case 4:cartMenu();break;	
								default:
									System.out.println("Nhap sai Menu!");;break;}
				
				if(choose==0) break;
		}
	}
	public static void mediaDetailsMenu() {
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
									case 1:break;
									case 2:break;
										
									default:
										System.out.println("Nhap sai Menu!");;break;}
					
					if(choose==0) break;
		    }		
		}
	public static void cartMenu() {
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
									case 1:break;
									case 2:break;
									case 3:break;
									case 4:break;	
									case 5:break;
									default:
										System.out.println("Nhap sai Menu!");;break;}
					
					if(choose==0) break;
		            } 
}
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
							case 1:break;
							case 2:break;
								
							default:
								System.out.println("Nhap sai Menu!");;break;}
			
			if(choose==0) break;
		}
	}



   
	public static void main(String[] args) {
		  
		 /* Cart anOrder = new Cart();
		  
		  DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				  "Animation","Roger Allers", 87, 19.95f);
		  
			anOrder.addMedia(dvd1);
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars",
					"Science Fiction","George Lucas",87,24.95f);
			anOrder.addMedia(dvd2);
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
					"Animation",18.99f);
			anOrder.addMedia(dvd3);
			
			System.out.println("Total cost: " + anOrder.totalCost()); 
		*/
		Store Mediastore=new Store();
		showMenu();
	    
	    
    

	}

}
