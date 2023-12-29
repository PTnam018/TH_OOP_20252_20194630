package hust.soict.dsai.aims.media;

import java.util.*;
public class Book extends Media {	
	private List<String> authors=new ArrayList<String>();
	public Book(int id,String title,String category,float cost)
	{
	  this.id=id;
	  this.title=title;
	  this.category=category;
	  this.cost=cost;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}	
	public void addAuthor(String tacgia)
	{
	
	    if (!this.authors.contains(tacgia)) 
	          {this.authors.add(tacgia);
	          System.out.println("added");
	          }
	    else 
	    	System.out.println("tac gia da ton tai");
			
	}
	public void removeAuthor(String s)
	{  
	   if(!this.authors.contains(s))
		     System.out.println("khong ton tai tac gia nay");
	   else 
	   { this.authors.remove(s);
	     System.out.println("removed");
	   }
      		
	    
	}
	
}
