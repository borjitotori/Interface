package Interface;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	
 static List<BookList> Book_list = new ArrayList<BookList>();
 static List<BookList> Book_list2 = new ArrayList<BookList>();
 static List<BookList> Book_list3 = new ArrayList<BookList>();
	
   
	private String category;	
	
	private String name;
	private String author;
	private float price;
	
	
	
   protected BookList(String category, String name, String author, float price) {
	 category = category;
	 name = name;
	 author = author;
	 price = price;
	 
	}
   
   static public String adv() {
   
	    Book_list.add(new BookList("adventure", "La llegada de los tres", "Stephen", 7));
		Book_list.add(new BookList("adventure", "Las bizarras aventuras de jojo", "Araki", 120));
		
		Book_list.add(new BookList("adventure", "Calor helado", "Richard", 10));
		Book_list.add(new BookList("adventure", "El evangelizador", "Jhon", 12));
		
	   String all = "";
	   
	   for (int i = 0; i <= Book_list.size() - 1; i++) {
			
		   
			all =  all  + "Categoria: "+BookList.Book_list.get(i).category + "\n" 
					+ "Nombre: " + BookList.Book_list.get(i).name +" "
					+ " Autor: " + BookList.Book_list.get(i).author + " \n" + "Precio: " + BookList.Book_list.get(i).price+ "\n" ;
			                
	      
  }

        return all;		
	   
   }
   


   
	
	static public String hor() {
		Book_list2.add(new BookList("Horror", "It", "Stephen", 12));
		Book_list2.add(new BookList("Horror", "Salems lot", "Raul", 7));		
		Book_list2.add(new BookList("Horror", "Dark abbys", "Drake", 15));


		String newall = "";
		  for (int i = 0; i <= Book_list2.size() - 1; i++) {
				
		
						
	
					newall =  newall  + "Categoria: "+BookList.Book_list2.get(i).category + "\n" 
							+ "Nombre: " + BookList.Book_list2.get(i).name +" "
							+ " Autor: " + BookList.Book_list2.get(i).author + " \n" + "Precio: " + BookList.Book_list2.get(i).price+"€" + "\n" ;
					                
			      
	  }
		
		return newall;		
	}
	
	static public String act() {
		Book_list3.add(new BookList("action", "Action Bunnies", "Tomska", 45));
		Book_list3.add(new BookList("action", "ASDF", "Movies", 23));
		
		String newnewall = "";
		  for (int i = 0; i <= Book_list3.size() - 1; i++) {
				
		
						
	
			  newnewall =  newnewall  + "Categoria: "+BookList.Book_list3.get(i).category + "\n" 
							+ "Nombre: " + BookList.Book_list3.get(i).name +" "
							+ " Autor: " + BookList.Book_list3.get(i).author + " \n" + "Precio: " + BookList.Book_list3.get(i).price+"€" + "\n" ;

		
		return newnewall;		
	}
	

	public String getCategor() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}


