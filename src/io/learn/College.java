package io.learn;

public class College implements Cloneable {
	
	String collegeName;
	
	Library library;
	
	

	public College(String collegeName, Library library) {
		super();
		this.collegeName = collegeName;
		this.library = library;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
	
	
	
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", library=" + library + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		College college=new College("MIT",new Library("History of Shivaji Maharaj"));
		Object obj=college.clone();  //allowed
		
		College collegeClone=(College) obj;
		
		System.out.println(collegeClone);
	}
	
	

}
