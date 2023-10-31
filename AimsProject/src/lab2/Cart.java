package lab2;

public class Cart {
	
	    private DigitalVideoDisc[] itemList;
	    private int qtyOrdered;
	    private final int MAX_CART_SIZE = 20; // Assuming maximum cart size is 10

	    public Cart() {
	        this.itemList = new DigitalVideoDisc[MAX_CART_SIZE];
	        this.qtyOrdered = 0;
	    }

	    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	        if (qtyOrdered < MAX_CART_SIZE) {
	            itemList[qtyOrdered] = disc;
	            qtyOrdered++;
	            System.out.println("The disc has been added.");
	        } else {
	            System.out.println("The cart is almost full.");
	        }
	    }

	    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemList[i].equals(disc)) {
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemList[j] = itemList[j + 1];
	                }
	                qtyOrdered--;
	                found = true;
	                System.out.println("The disc has been removed.");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Disc not found in the cart.");
	        }
	    }

	    public float totalCost() {
	        float totalCost = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            totalCost += itemList[i].getCost();
	        }
	        return totalCost;
	    }

	    // Additional methods and properties can be added here as needed.
	


}
