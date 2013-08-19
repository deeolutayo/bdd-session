package bdd;

public class Book {
	private String title;

	public Book(String title){
		this.title = title;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (otherObject == this)
			return true;
		if (!(otherObject instanceof Book))
			return false;
		
		return ((Book)otherObject).title.equalsIgnoreCase(this.title);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		
		return result;
	}	
}